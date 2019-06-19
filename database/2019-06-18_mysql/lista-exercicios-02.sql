-- Exercício 1
CREATE DATABASE biblioteca;

-- Exercício 2
SHOW DATABASES;
USE biblioteca;

-- Exercício 3
CREATE TABLE categoria (
	id_categoria INTEGER NOT NULL,
    categoria VARCHAR(100),
    PRIMARY KEY (id_categoria)
);

-- Adicionar atributo a um campo de uma tabela já criada
ALTER TABLE categoria
MODIFY categoria VARCHAR(100) NOT NULL;

-- Renomear campo de tabela já criada
ALTER TABLE categoria CHANGE categoria categotia VARCHAR(100);

-- Exercício 4
DESCRIBE categoria;

-- Exercício 5
CREATE TABLE livro (
	id_livro INTEGER NOT NULL,
    id_categoria INTEGER NOT NULL,
    titulo VARCHAR(200),
	PRIMARY KEY (id_livro),
    FOREIGN KEY (id_categoria)
    REFERENCES categoria (id_categoria)  
);

-- Exercício 6
DESCRIBE livro;

-- Exercício 7
CREATE TABLE aluno (
	id_aluno INTEGER NOT NULL,
    nome VARCHAR(100),
    PRIMARY KEY (id_aluno)
);

-- Exercício 8
DESCRIBE aluno;

-- Exercício 9
CREATE TABLE emprestimo (
	id_emprestimo INTEGER NOT NULL,    
    id_aluno INTEGER NOT NULL UNIQUE,
    id_livro INTEGER NOT NULL UNIQUE,
    data_emprestimo DATE UNIQUE,
    data_devolucao DATE,
    PRIMARY KEY (id_emprestimo),
    FOREIGN KEY (id_aluno)
    REFERENCES aluno (id_aluno),
    FOREIGN KEY (id_livro)
    REFERENCES livro (id_livro)    
);
DESCRIBE emprestimo;

-- Drop Foreign Key errada
ALTER TABLE emprestimo DROP KEY id_aluno;

INSERT INTO categoria (id_categoria, categoria)
VALUES (1, "Romance");
INSERT INTO categoria (id_categoria, categoria)
VALUES (2, "Psicodelia");

SELECT * FROM categoria;

INSERT INTO livro (id_livro, id_categoria, titulo)
VALUES (1, 1, "Anarquistas Graças a Deus");
INSERT INTO livro (id_livro, id_categoria, titulo)
VALUES (2, 1, "Romeu e Julieta");
INSERT INTO livro (id_livro, id_categoria, titulo)
VALUES (3, 2, "Transmissão de Conhecimento Coerente com Comportamentos Observados: Análise de Redes Sociais");

SELECT * FROM livro;
