/* criando um banco de dados */
CREATE DATABASE generation;

/* indicando qual banco de dados iremos trabalhar */
USE generation;

/* criando uma tabela */
CREATE TABLE alunos (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50),
    sobrenome VARCHAR(50),
    email VARCHAR(50),
    data_nascimento DATE,
    cpf VARCHAR(11) UNIQUE
);

INSERT INTO alunos (
	nome, 
	sobrenome, 
    email, 
    data_nascimento, 
    cpf
) VALUES (
	"James",
	"Bond Guerra",
    "james@gmail.com",
    "1990-10-12",
    "26734536754"
);

select * from alunos;

CREATE TABLE professores (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(50),
    email VARCHAR(50),
    data_nascimento DATE,
    cpf VARCHAR(11) UNIQUE
);

CREATE TABLE cursos (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(50)
);

CREATE TABLE turmas (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    descricao VARCHAR(50),
    periodo VARCHAR(20),
    id_alunos INT(11),
    id_professores INT(11),
    id_cursos INT(11)
);

/* exibindo todas tabelas do meu banco de dados */
SHOW TABLES;

/* descrever os detalhes de uma tabela */
show TABLES





