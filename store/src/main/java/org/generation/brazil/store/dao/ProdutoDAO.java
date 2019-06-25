package org.generation.brazil.store.dao;

import org.generation.brazil.store.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDAO extends CrudRepository <Produto, Long> {

}
