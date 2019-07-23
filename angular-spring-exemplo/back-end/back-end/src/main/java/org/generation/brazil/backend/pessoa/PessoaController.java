package org.generation.brazil.backend.pessoa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.generation.brazil.backend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaController {

  private static final String NOT_FOUND = "Não foi encontrado uma pessoa com o id: ";

  @Autowired
  private PessoaRepository pessoaRepository;

  @GetMapping("/pessoas")
  public List<Pessoa> getPessoas() {
    return pessoaRepository.findAll();
  }

  @GetMapping("/pessoas/{id}")
  public ResponseEntity<Pessoa> getPessoa(@PathVariable(value = "id") Long pessoaId)
      throws ResourceNotFoundException {
    Pessoa pessoa = pessoaRepository.findById(pessoaId)
        .orElseThrow(() -> new ResourceNotFoundException(NOT_FOUND + pessoaId));
    return ResponseEntity.ok().body(pessoa);
  }

  @PostMapping("/pessoas")
  public Pessoa createPessoa(@Valid @RequestBody Pessoa pessoa) {
    return pessoaRepository.save(pessoa);
  }

  @PutMapping("/pessoas/{id}")
  public ResponseEntity<Pessoa> updatePessoa(@PathVariable(value = "id") Long pessoaId,
      @Valid @RequestBody Pessoa pessoaDetails) throws ResourceNotFoundException {
    Pessoa pessoa = pessoaRepository.findById(pessoaId)
        .orElseThrow(() -> new ResourceNotFoundException(NOT_FOUND + pessoaId));
    pessoa.setNome(pessoaDetails.getNome());
    pessoa.setSobrenome(pessoaDetails.getSobrenome());
    pessoa.setEmail(pessoaDetails.getEmail());
    final Pessoa updatedPessoa = pessoaRepository.save(pessoa);
    return ResponseEntity.ok(updatedPessoa);
  }

  @DeleteMapping("/pessoas/{id}")
  public Map<String, Boolean> deletePessoa(@PathVariable(value = "id") Long pessoaId)
      throws ResourceNotFoundException {
    Pessoa pessoa = pessoaRepository.findById(pessoaId)
        .orElseThrow(() -> new ResourceNotFoundException(NOT_FOUND + pessoaId));
    pessoaRepository.delete(pessoa);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }

}
