/*CREATE DATABASE store;
USE store;*/

CREATE TABLE product (
	id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    PRIMARY KEY (id)
);
USE store;
DROP TABLE product;

CREATE TABLE produto (
	id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    PRIMARY KEY (id)
);

INSERT INTO produto VALUE (
	null,
    "Rodrigo",
    "Bonitão"
);

DELETE FROM produto WHERE nome="Rodrigo";
