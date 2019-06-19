SHOW DATABASES;

DESCRIBE users;

-- COUNT() conta a quantidade de linhas da tabela
SELECT COUNT(*) FROM movies;
SELECT COUNT(id) FROM movies;
-- conta mostrando um nome personalizado para o total da contagem
SELECT COUNT(id) AS total FROM actors;
-- conta os registros a partir de um filtro
SELECT COUNT(id) AS total FROM movies WHERE genre_id = 3; 
-- mostra os dois primeiros registros
SELECT * FROM MOVIES LIMIT 2;

-- AVG() mostra a média aritmética das notas dos filmes
SELECT AVG(rating) AS media_aritmetica FROM movies;

-- SUM() soma a duração de todos os filmes com nota de avaliação maior ou igual a 9
SELECT SUM(length) AS total_minutes FROM movies WHERE rating >= 9;

-- MIN() mostra filme com menor nota de avaliação
SELECT MIN(rating) FROM movies;
SELECT * FROM movies WHERE rating = 10.0;

-- MIN() - Criando variável no MySQL
SELECT @minimo := MIN(rating) FROM movies;
SELECT MIN(rating) FROM movies;
SELECT * FROM movies WHERE rating = @minimo;

-- MAX()
SELECT MAX(rating) FROM movies;
SELECT * FROM movies WHERE rating = 0.9;

-- MAX() - Criando variável no MySQL
SELECT @maximo := MAX(rating) FROM movies;
SELECT MAX(rating) FROM movies;
SELECT * FROM movies WHERE rating = @maximo;

-- GROUP BY
SELECT COUNT(title) from movies group by genre_id;
