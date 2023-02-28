SELECT aluno.nome AS "Aluno",
curso.id AS "Código do curso",
curso.nome AS "Nome do curso",
professor.nome AS "Nome do professor",
aluno.data_matricula AS "Data da matricula"
FROM aluno
JOIN curso ON aluno.id_curso = curso.id
JOIN professor ON curso.id_professor = professor.id
WHERE aluno.data_matricula BETWEEN '2022-01-01' AND '2022-06-01';


