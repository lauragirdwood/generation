package org.generation.brazil.gfood.cliente;

//import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    private ClienteRepository repository;

    // READ (R DO CRUD)
    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        // "SELECT * FROM cliente"
        return repository.findAll();
    }

    // CREATE (C DO CRUD)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

}
