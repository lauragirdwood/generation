package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    // CREATE (C DO CRUD) -- POST do HTTP
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto) {
        // 'INSERT INTO produto ...'
        return repository.save(produto);
    }


    // READ (R DO CRUD) -- GET do HTTP
    @GetMapping("/produtos")
    public List<Produto> findAll(){
        // 'SELECT * FROM produto'
        return repository.findAll();
    }

    // UPDATE (U DO CRUD) -- PUT do HTTP
    @PutMapping("/produtos/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto)
            throws ResourceNotFoundException {
        // 'UPDATE produto SET ... WHERE ...'
        return repository.findById(id).map(produtoAtualizado -> {
            produtoAtualizado.setNome(produto.getNome());
            produtoAtualizado.setDescricao(produto.getDescricao());
            return repository.save(produtoAtualizado);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe cliente cadastrado com o id: " + id));
    }


}
