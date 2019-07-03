package org.generation.brazil.gfood.cliente;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
//import java.sql.Date;
import java.sql.Date;
import java.time.LocalDate;


@Entity
@Data
public class Cliente {

  @Id // eh o do Java Persistence pq se for o do Spring dá pau
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //@GeneratedValue para auto increment -- qual estratégia de auto increment do mysql? Identity
  private Long id;

  @NotNull
  private String nome;
  private String endereco;

  @NotNull
  @Column(name = "data_nascimento")
  private LocalDate dataNascimento;

}
