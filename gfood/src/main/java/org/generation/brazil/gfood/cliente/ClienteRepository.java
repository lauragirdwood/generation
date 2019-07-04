package org.generation.brazil.gfood.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

//troca de class pra interface
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    /*
    @Modifying
    @Query("UPDATE cliente SET nome = ?1 WHERE id = ?2")
    void updateNomeById (String nome, Long id);
    */

    //legal usar @query quando precisamos usar queries complexas, com AND, OR
    @Transactional
    @Modifying // usa quando for fazer update, delete or save
    @Query("UPDATE Cliente c SET c.nome = :nome WHERE c.id = :id")
    void updateNomeById(@Param("nome") String nome, @Param("id") Long id);

    @Transactional
    void deleteByDataNascimentoAndNome(LocalDate dataNascimento, String nome);

    //Optional<Cliente> findByFirstnameStartingWith(String nome);
    //List<Cliente> findByFirstnameContaining(String nome);

    List<Cliente> findByDataNascimento(LocalDate dataNascimento);

    List<Cliente> findByNomeAndDataNascimento(String nome, LocalDate dataNascimento);
}
