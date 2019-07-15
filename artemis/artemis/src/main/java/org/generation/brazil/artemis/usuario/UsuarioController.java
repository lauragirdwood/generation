package org.generation.brazil.artemis.usuario;

import java.util.List;
import java.util.Optional;
import org.generation.brazil.artemis.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

  private static final Logger logger = LoggerFactory.getLogger()

  @Autowired
  private UsuarioRepository usuarioRepository;

  // TESTE OK
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/usuarios")
  public Usuario save(@RequestBody Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  // TESTE OK
  @GetMapping("/usuarios")
  public List<Usuario> findAll() {
    return usuarioRepository.findAll();
  }


  //  TESTE OK
  @GetMapping("/usuarios/{id}")
  public Optional<Usuario> findById(@PathVariable Long id) {
    return usuarioRepository.findById(id);
  }


  // TESTE DOING
  @PutMapping("/usuarios/{id}")
  public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario)
      throws ResourceNotFoundException {
    // "UPDATE usuario SET ... WHERE ..."
    return usuarioRepository.findById(id).map(usuarioAtualizado -> {
      usuarioAtualizado.setNome(usuario.getNome());
      usuarioAtualizado.setEmail(usuario.getEmail());
      return usuarioRepository.save(usuarioAtualizado);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe usuario cadastrado com o id: " + id));
  }

  @DeleteMapping("/usuarios/{id}")
  public void delete(@PathVariable Long id) {
    usuarioRepository.deleteById(id);
  }

}