CREATE DATABASE gfood;
SHOW DATABASES;
USE gfood;

CREATE TABLE cliente (
	id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(200),
    PRIMARY KEY (id)
);

SELECT * FROM cliente;

INSERT INTO cliente(nome, endereco) 
VALUES ("Laura Xavier de Oliveira Girdwood de Azevedo e Mello", "Rua Estevão Lopes, 82 - Butantã");

INSERT INTO cliente(nome, endereco) 
VALUES ("Felipe Coala", "Rua Discórdia, 0 - Butantã");