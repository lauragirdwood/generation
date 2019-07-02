package org.generation.brazil.gfood.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

//troca de class pra interface
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByNome(String nome);
    List<Cliente> findByDataNascimento(LocalDate dataNascimento);
}
