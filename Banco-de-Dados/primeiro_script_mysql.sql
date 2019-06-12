/* criando um banco de dados */
create database generation;

/* indicando qual banco de dados iremos trabalhar */
use generation;

/* criando uma tabela */
create table alunos (
	id INT(11) primary key auto_increment not null,
    nome VARCHAR(50) not null,
    sobrenome VARCHAR(50) not null,
    email VARCHAR(50) not null,
    data_nascimento DATE,
    cpf CHAR(11) not null,   

);