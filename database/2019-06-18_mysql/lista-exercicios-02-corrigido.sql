-- Exercício 1
CREATE DATABASE biblioteca;
-- DROP DATABASE biblioteca;

-- Exercício 2
SHOW DATABASES;
USE biblioteca;

-- Exercício 3
CREATE TABLE categoria (
	id_categoria INTEGER NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_categoria)
);

/*
-- Adicionar atributo a um campo de uma tabela já criada
ALTER TABLE categoria
MODIFY categoria VARCHAR(100) NOT NULL;

-- Renomear campo de tabela já criada
ALTER TABLE categoria CHANGE categoria categotia VARCHAR(100);
*/

-- Exercício 4
DESCRIBE categoria;

-- Exercício 5
CREATE TABLE livro (
	id_livro INTEGER NOT NULL,
    titulo VARCHAR(200) NOT NULL,    
    id_categoria INTEGER NOT NULL,
	PRIMARY KEY (id_livro),
    CONSTRAINT fk_categoria_livro
    FOREIGN KEY (id_categoria)
    REFERENCES categoria (id_categoria)  
);

-- Exercício 6
DESCRIBE livro;

-- Exercício 7
CREATE TABLE aluno (
	id_aluno INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_aluno)
);

DROP TABLE aluno;

-- Exercício 8
DESCRIBE aluno;

-- Exercício 9
CREATE TABLE emprestimo (
	id_emprestimo INTEGER NOT NULL,    
    id_aluno INTEGER NOT NULL,
    id_livro INTEGER NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    PRIMARY KEY (id_emprestimo),
    CONSTRAINT uk_emprestimo
    UNIQUE KEY (id_aluno, id_livro, data_emprestimo),
    CONSTRAINT fk_livro_emprestimo
    FOREIGN KEY (id_livro)
    REFERENCES livro (id_livro),
    CONSTRAINT fk_aluno_emprestimo
    FOREIGN KEY (id_aluno)
    REFERENCES aluno (id_aluno)    
);

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE emprestimo;

-- Exercício 10
DESCRIBE emprestimo;
