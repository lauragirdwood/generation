-- JOINs

-- Mostrando todos os livros que possuem categoria
SELECT * FROM livro l
INNER JOIN categoria c
ON l.id_categoria = c.id_categoria;

SELECT l.id_livro, 
		l.titulo, 
		c.id_categoria, 
		c.categoria 
FROM livro l
INNER JOIN categoria c
ON l.id_categoria = c.id_categoria;

SELECT livro.id_livro, 
		livro.titulo, 
		categoria.id_categoria, 
		categoria.categoria 
FROM livro
INNER JOIN categoria
ON livro.id_categoria = categoria.id_categoria;

SELECT livro.titulo, 
		categoria.categoria 
FROM livro
JOIN categoria
ON livro.id_categoria = categoria.id_categoria;

-- Mostrando todos os livros que os alunos pegaram emprestados
SELECT
	a.id_aluno,
    a.nome,
    l.id_livro,
    l.titulo,
    e.data_emprestimo,
    e.data_devolucao
FROM aluno a
INNER JOIN emprestimo e
ON a.id_aluno = e.id_aluno
INNER JOIN livro l
ON e.id_livro = l.id_livro;

-- Mostrando todos os livros que os alunos pegaram emprestados
-- Mostrar também as categorias de cada livro
SELECT a.id_aluno,
    a.nome,
    l.id_livro,
    l.titulo,
    c.id_categoria,
    c.categoria,
    e.data_emprestimo,
    e.data_devolucao
FROM aluno a
INNER JOIN emprestimo e
ON a.id_aluno = e.id_aluno
INNER JOIN livro l
ON e.id_livro = l.id_livro
INNER JOIN categoria c
ON l.id_categoria = c.id_categoria;