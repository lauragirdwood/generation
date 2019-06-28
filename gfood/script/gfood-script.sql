CREATE DATABASE gfood;
SHOW DATABASES;
USE gfood;

-- Cliente
CREATE TABLE cliente (
	id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(200),
    PRIMARY KEY (id)
);

SELECT * FROM cliente;

INSERT INTO cliente(nome, endereco) 
VALUES ('Laura Xavier de Oliveira Girdwood de Azevedo e Mello', 'Rua Estevão Lopes, 82 - Butantã');

INSERT INTO cliente(nome, endereco) 
VALUES ('Felipe Coala', 'Rua Discórdia, 0 - Butantã');

-- Produtos
CREATE TABLE produto (
    id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    descricao VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO produto(nome, descricao)
VALUES ('pizza', 'escarola'),
       ('esfiha', 'brócolis');

SELECT * FROM produto;