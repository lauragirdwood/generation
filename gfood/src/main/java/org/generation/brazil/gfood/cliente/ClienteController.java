package org.generation.brazil.gfood.cliente;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//@Controller
@ResponseBody
@RestController
public class ClienteController {

  /*
  Alguns testes

  //@ResponseBody
  //@RequestMapping("/index")  //antigo
  @GetMapping("/index") //novo
  public String index() {
      return "Uma mensagem de teste!";
  }

  @PostMapping("/post") //novo
  public String post() {
      return "Não dá pra fazer pelo navegador!";
  }
  */
  //
  @Autowired // vai injetar a dependência que eu preciso pra rodar o programa
  private ClienteRepository clienteRepository;

  // CREATE (C DO CRUD) -- POST do HTTP
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/clientes")
  public Cliente save(@RequestBody Cliente cliente) {
    // 'INSERT INTO cliente ...'
    return clienteRepository.save(cliente);
  }

  // READ (R DO CRUD) -- GET do HTTP
  @GetMapping("/clientes")
  public List<Cliente> findAll() {
    // 'SELECT * FROM cliente'
    return clienteRepository.findAll();
  }

  // READ (R DO CRUD) -- GET do HTTP pegando por id
  @GetMapping("/clientes/{id}")
  public Optional<Cliente> findById(@PathVariable Long id) {
    // 'SELECT * FROM cliente WHERE id = '
    return clienteRepository.findById(id);
  }

  // READ (R DO CRUD) -- POST do HTTP buscando por nome (pra não passar na url)
  @PostMapping("/clientes/filter") // ?nome=Felipe Coala
  public List<Cliente> findByNome(@RequestParam String nome) {
    // 'SELECT * FROM cliente WHERE nome = '
    return clienteRepository.findByNome(nome);
  }

  // READ (R DO CRUD) -- POST do HTTP buscando por nome (pra não passar na url)
//  @PostMapping("/clientes/nome")
//  public List<Cliente> findByFirstnameContaining(@RequestParam String nome) {
//    // 'SELECT * FROM cliente WHERE nome = '
//    return clienteRepository.findByFirstnameContaining(nome);
//  }

  // READ (R DO CRUD) -- POST do HTTP buscando por data de nascimento
//  @PostMapping("/clientes/filter/data-nascimento")
//  public List<Cliente> findByDataNascimento(@RequestParam @DateTimeFormat(iso = ISO.DATE) LocalDate dataNascimento) {
//    // 'SELECT * FROM cliente WHERE data_nascimento = '
//    return clienteRepository.findByDataNascimento(dataNascimento);
//  }

  @GetMapping("/clientes/filter/data-nascimento") // ?data-nascimento=1989-12-20
  public List<Cliente> findByDataNascimento(@RequestParam(value = "data-nascimento") @DateTimeFormat(iso = ISO.DATE) LocalDate dataNascimento) {
     // 'SELECT * FROM cliente WHERE data_nascimento = '
    return clienteRepository.findByDataNascimento(dataNascimento);
  }


  // READ (R DO CRUD) -- POST do HTTP buscando por nome e data de nascimento
  @PostMapping("/clientes/nomeAndNasc")
  public List<Cliente> findByNomeAndDataNascimento(@RequestParam String nome, @RequestParam LocalDate dataNascimento) {
    // 'SELECT * FROM cliente WHERE nome = AND data_nascimento = '
    return clienteRepository.findByNomeAndDataNascimento(nome, dataNascimento);
  }


  // UPDATE (U DO CRUD) -- PUT do HTTP
    /*@PutMapping("/clientes/{id}")
    public Cliente saveOrUpdate(@PathVariable Long id, @RequestBody Cliente cliente){
        // Optional é uma abstração para facilitar o manuseio de um objeto, no caso, um cliente
        //Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        // mapear o conteúdo de cliente para o Option

        // EXPRESSÕES LAMBDAS
        return clienteRepository.findById(id).map(c -> {
            c.setNome(cliente.getNome());
            c.setEndereco(cliente.getEndereco());
            return clienteRepository.save(c);
        }).orElseGet(() -> {
            cliente.setId(id);
            return clienteRepository.save(cliente);
        });
    }*/


  @PatchMapping("/clientes/altera/{id}")
  public Optional<Cliente> updateNomeById(@PathVariable Long id, @RequestParam String nome){
    clienteRepository.updateNomeById(nome, id);
    return clienteRepository.findById(id);
  }

  public ClienteRepository getClienteRepository() {
    return clienteRepository;
  }
// @transactional
   //  UPDATE (U DO CRUD) -- PUT do HTTP
  /* // Ver o uso do PatchMapping (atualiza parcialmente)
  @PutMapping("/clientes/altera/{id}")
  public Cliente updateClienteByNome(@PathVariable Long id, @RequestParam String nome)
      throws ResourceNotFoundException {
    // 'UPDATE cliente SET ... WHERE ...'
    return clienteRepository.findById(id).map(clienteAtualizado -> {
      clienteAtualizado.setNome(nome);
      return clienteRepository.save(clienteAtualizado);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe cliente cadastrado com o id: " + id));
  }*/

   //UPDATE (U DO CRUD) -- PUT do HTTP
  @PutMapping("/clientes/{id}")
  public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente)
          throws ResourceNotFoundException {
    // 'UPDATE cliente SET ... WHERE ...'
    return clienteRepository.findById(id).map(clienteAtualizado -> {
      clienteAtualizado.setNome(cliente.getNome());
      clienteAtualizado.setEndereco(cliente.getEndereco());
      clienteAtualizado.setDataNascimento(cliente.getDataNascimento());
      return clienteRepository.save(clienteAtualizado);
    }).orElseThrow(() ->
            new ResourceNotFoundException("Não existe cliente cadastrado com o id: " + id));
  }

  // DELETE (D DO CRUD)
  @DeleteMapping("/clientes/{id}")
  public void delete(@PathVariable Long id) {
    clienteRepository.deleteById(id);
  }

  // DELETE (D DO CRUD)
  @DeleteMapping("/clientes/delete-by")
  public void deleteByDataNascimentoAndNome(@RequestParam @DateTimeFormat(iso = ISO.DATE) LocalDate dataNascimento,
      @RequestParam String nome) {
    // "DELETE FROM cliente WHERE data_nascimento = ... AND nome = ..."
    clienteRepository.deleteByDataNascimentoAndNome(dataNascimento, nome);
  }


}