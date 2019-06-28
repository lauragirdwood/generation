CREATE DATABASE gfood;
USE gfood;

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