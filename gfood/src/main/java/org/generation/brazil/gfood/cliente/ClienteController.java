package org.generation.brazil.gfood.cliente;

//import org.springframework.stereotype.Controller;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//@Controller
//@ResponseBody
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
  @PostMapping("/clientes/nome")
  public Cliente findByNome(@RequestParam String nome) {
    // 'SELECT * FROM cliente WHERE nome = '
    return clienteRepository.findByNome(nome);
  }

  // READ (R DO CRUD) -- GET do HTTP buscando por data de nascimento
  @GetMapping("/clientes/dataNascimento/'{dataNascimento}'")
  public List<Cliente> findByDataNascimento(@PathVariable LocalDate dataNascimento) {
    // 'SELECT * FROM cliente WHERE data_nascimento = '
    return clienteRepository.findByDataNascimento(dataNascimento);
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

  // UPDATE (U DO CRUD) -- PUT do HTTP
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


}