package org.generation.brazil.gfood.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//troca de class pra interface
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    @Query("UPDATE cliente SET nome = :nome WHERE id = :id")
    Cliente updateClienteByNome (
            @Param("id") Long id,
            @Param("nome") String nome);

    //Optional<Cliente> findByFirstnameStartingWith(String nome);
    //List<Cliente> findByFirstnameContaining(String nome);

    List<Cliente> findByDataNascimento(LocalDate dataNascimento);

    List<Cliente> findByNomeAndDataNascimento(String nome, LocalDate dataNascimento);
}
