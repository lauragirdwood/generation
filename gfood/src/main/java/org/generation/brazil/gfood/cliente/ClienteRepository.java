package org.generation.brazil.gfood.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//troca de class pra interface
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
