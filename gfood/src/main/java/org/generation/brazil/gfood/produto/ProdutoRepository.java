package org.generation.brazil.gfood.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNome(String nome);

    List<Produto> findByPreco(BigDecimal preco);

    List<Produto> findByPrecoLessThan(BigDecimal preco);

    List<Produto> findByPrecoGreaterThan(BigDecimal preco);

    List<Produto> findByPrecoBetween(BigDecimal preco1, BigDecimal preco2);

}
