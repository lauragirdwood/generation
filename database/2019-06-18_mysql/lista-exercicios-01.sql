-- Exercício 1
SHOW DATABASES;

-- Exercício 2
CREATE DATABASE sistema2;

-- Exercício 3
SHOW DATABASES;
USE sistema2;

-- Exercício 6
CREATE TABLE departamento_ (
	id_departamento INTEGER AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100),
    telefone CHAR(15),
    PRIMARY KEY (id_departamento)
);

-- Exercício 7
DESCRIBE departamento_;

-- Exercício 8
CREATE table funcionario (
	id_funcionario INTEGER AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100),
    id_departamento INTEGER NOT NULL,
    data_cadastro DATE,
    PRIMARY KEY (id_funcionario),
    FOREIGN KEY (id_departamento)
    REFERENCES departamento_ (id_departamento)    
);

-- Exerício 9
DROP TABLE funcionario;

-- Exerício 10
CREATE table funcionario (
	id_funcionario INTEGER AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100),
    id_departamento INTEGER NOT NULL,
    data_cadastro DATE,
    PRIMARY KEY (id_funcionario)
);

DESCRIBE funcionario;

-- Exercício 11
ALTER TABLE funcionario
ADD CONSTRAINT fk_funcionario_departamento
FOREIGN KEY (id_departamento)
REFERENCES departamento_ (id_departamento);

DESCRIBE funcionario; 

-- Exercício 12
INSERT INTO departamento_
VALUES (2, "Departamento de Energia", "(11) 93333-9999");
INSERT INTO departamento_
VALUES (3, "Departamento de Tecnologia", "(11) 98888-7777");

SELECT * FROM departamento_;

-- Exercício 13
INSERT INTO departamento_ (id_departamento, nome)
VALUES (4, "Departamento de Comunicação");
INSERT INTO departamento_ (id_departamento, nome, telefone)
VALUES (5, "Departamento de Nada", NULL);

-- Exerício 14
INSERT INTO departamento_
VALUES (6, "Departamento Ridículo", NULL),
	(7, "Departamento Financeiro", NULL),
	(8, "Departamento Mamão", NULL),
    (9, "Departamento Microondas", NULL),
    (10, "Departamento Tipificado", NULL);
    
-- Exercício 15
SELECT * FROM departamento_;

-- Exercício 16
SELECT * FROM departamento_ ORDER BY nome DESC;

-- Exercício 17
SELECT * FROM departamento_ ORDER BY nome;

-- Exercício  18
SELECT * FROM departamento_ WHERE telefone IS NULL;

-- Exercício 19
SELECT * FROM departamento_ WHERE telefone IS NOT NULL;

-- Exercício 20
SELECT * FROM departamento_ WHERE id_departamento = 3;

-- Exercício 21
SELECT * FROM departamento_ WHERE nome LIKE 'D%';

-- Exercício 22
SELECT * FROM departamento_ WHERE nome LIKE "%Nada";

-- Exercício 23
SELECT * FROM departamento_ WHERE nome LIKE '%de%';

-- Exercício 24
SELECT * FROM departamento_ WHERE nome NOT LIKE '%de%';

-- Exercício 25 (atualizar)
UPDATE departamento_
SET telefone = "(11) 98888-3214"
WHERE id_departamento = 2;

SELECT * FROM departamento_ WHERE id_departamento = 2;

-- Exercício 26
DELETE FROM departamento_ WHERE id_departamento = 2;

-- Exercício 27 (Terminal)
-- QUIT ou \q

-- Exercício 28
SELECT VERSION();
SELECT sysdate();
SELECT NOW();
SELECT CURRENT_DATE();

-- Exercício 29
SELECT USER();

-- Exercício 30
-- \c
