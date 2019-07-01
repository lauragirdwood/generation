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


-- CRIO CAMPO NULO NA TABELA
ALTER TABLE cliente ADD data_nascimento DATE NULL;

-- FAÇO UPDATE NA TABELA COM UM VALOR DEFAULT
UPDATE cliente SET data_nascimento = '1999-12-12' WHERE data_nascimento IS NULL;

-- ALTERO A DEFINIÇÃO DO CAMPO PARA NOT NULL
ALTER TABLE cliente MODIFY data_nascimento DATE NOT NULL;

-- ALTERO O VALOR DOS CAMPOS NOVOS
UPDATE cliente
SET data_nascimento = '1989-12-20'
WHERE id = 1;

UPDATE cliente
SET data_nascimento = '1987-03-01'
WHERE id = 2;


-- CRIO CAMPO NULO NA TABELA
ALTER TABLE produto ADD preco DECIMAL(6,2) NULL;

-- FAÇO UPDATE NA TABELA COM UM VALOR DEFAULT
UPDATE produto SET preco = 0.00 WHERE preco IS NULL;

-- ALTERO A DEFINIÇÃO DO CAMPO PARA NOT NULL
ALTER TABLE produto MODIFY preco DECIMAL(6,2) NOT NULL;

-- ALTER TABLE produto DROP COLUMN preco;

-- ALTERO O VALOR DOS CAMPOS NOVOS
UPDATE produto
SET preco = 21.00
WHERE id = 1;

UPDATE produto
SET preco = 6.99
WHERE id = 2;

