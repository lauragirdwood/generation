package org.generation.brazil.store.controller;

//import org.springframework.stereotype.Controller;
import org.generation.brazil.store.dao.ProdutoDAO;
import org.generation.brazil.store.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class ProdutoController {

    @Autowired // sem ele dá erro 500, ou seja, código quebraaaa!
    private ProdutoDAO produtoDAO;

    @RequestMapping("/lista-produtos")
    public List<Produto> lista() {
        //List<Produto> produtos = (List<Produto>) produtoDAO.findAll(); // fazendo casting pra Lista pq ele quer Iterable
        //return produtos;

        // SELECT * FROM produto
        return (List<Produto>) produtoDAO.findAll(); // devolve uma lista do que criei no crudRepository
    }

}
