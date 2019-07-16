package org.generation.brazil.artemis.usuario;

import java.util.List;
import java.util.Optional;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.generation.brazil.artemis.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

  @Autowired
  private UsuarioRepository usuarioRepository;

  // CRIA UM NOVO USUARIO NO BANCO
  @ApiOperation(value = "Insere um novo usuário",
          notes = "Insere um novo usuário",
          response = Usuario.class)
  @ApiResponses(value = {
          @ApiResponse(code = 201, message = "Sucesso! Deu certo a inserção!"),
          @ApiResponse(code = 401, message = "Sem autorização!"),
          @ApiResponse(code = 403, message = "Proibidão!"),
          @ApiResponse(code = 404, message = "Não encontrado!")
  })
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/usuarios")
  public Usuario save(@RequestBody Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  @GetMapping("/usuarios")
  public List<Usuario> findAll() {
    return usuarioRepository.findAll();
  }

  @GetMapping("/usuarios/{id}")
  public Optional<Usuario> findById(@PathVariable Long id) {
    return usuarioRepository.findById(id);
  }

  @PutMapping("/usuarios/{id}")
  public Usuario update(@PathVariable Long id, @RequestBody Usuario infoQueVemDoFront)
      throws ResourceNotFoundException {

    // "UPDATE produto SET ... WHERE ..."
    return usuarioRepository.findById(id).map( novaInformacaoQueVaiProBanco -> {
      novaInformacaoQueVaiProBanco.setNome(   infoQueVemDoFront.getNome()   );
      novaInformacaoQueVaiProBanco.setEmail(infoQueVemDoFront.getEmail());
      return usuarioRepository.save(novaInformacaoQueVaiProBanco);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe produto cadastrado com o id: " + id));
  }

  @DeleteMapping("/usuarios/{id}")
  public void delete(@PathVariable Long id) {
    usuarioRepository.deleteById(id);
  }

}