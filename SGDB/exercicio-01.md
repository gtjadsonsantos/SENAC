# 1. Crie uma consulta SQL para listar os alunos do sexo masculino

SELECT * FROM ALUNO WHERE SEXO = "M"

# 2. Crie uma consulta SQL para listar os alunos com 19 anos

SELECT * FROM ALUNO WHERE IDADE = 19;

# 3. Crie uma consulta SQL para listar os alunos com a primeira letra do nome igual a 'D'

SELECT * FROM ALUNO WHERE NOME LIKE 'D%'

# 4. Crie uma consulta SQL para listar os alunos com idade entre 20 e 22 anos

SELECT * FROM ALUNO WHERE IDADE BETWEEN 20 AND 22

SELECT * FROM ALUNO WHERE IDADE > 20 AND  IDADE < 22;

SELECT * FROM ALUNO WHERE IDADE IN(20,21,22)

SELECT * FROM ALUNO WHERE IDADE = 20 OR  OR IDADE = 21 OR IDADE = 22 OR IDADE = 23;


# 5. Crie uma consulta SQL para listar os alunos sem cidade cadastrada

SELECT * FROM ALUNO WHERE CIDADE IS NULL

# 6. Crie uma consulta SQL para listar os alunos que moram em Blumenau

SELECT * FROM ALUNO WHERE CIDADE = "BLUMENAU"

# 7. Crie uma consulta SQL para listar os alunos que com idade diferente a 18 anos:

SELECT * FROM ALUNO WHERE IDADE <> 18

# 8. Crie uma consulta SQL para listar os alunos com que tenham "Ri" em qualquer parte do nome

SELECT * FROM ALUNO WHERE NOME LIKE '%Ri%'

# 9. Crie uma consulta SQL para listar os alunos de São José do sexo masculino com menos de 20 anos

SELECT * FROM ALUNO WHERE CIDADE = "SÃO JOSE" AND SEXO = "M" AND IDADE < 20

# 10. Crie uma consulta SQL para listar os alunos maiores de idade (idade acima de 20 para mulheres e idade acima de 17 para homens

SELECT * FROM ALUNO WHERE (IDADE > 20 AND SEXO = 'F' ) OR (IDADE > 17 AND SEXO = 'M' )

# 11. Crie uma consulta SQL para listar somente os alunos que tenham "A" e "R" no nome

SELECT * FROM ALUNO WHERE NOME LIKE'%A%' OR NOME LIKE '%R%'

# 12. Crie uma consulta SQL para listar somente o nome e idade dos alunos do sexo feminino

SELECT NOME,IDADE FROM ALUNO WHERE SEXO = 'F'

# 13. Crie uma consulta SQL para listar somente o código e o n  ome dos alunos de Blumenau

SELECT IDALUNO,NOME FROM ALUNO WHERE CIDADE = "BLUMENAU"

# 14. Crie uma consulta SQL para listar somente o nome e a cidade dos alunos que são menores de idade   

SELECT NOME, CIDADE FROM ALUNO WHERE IDADE >= 18

# 15. Crie uma consulta SQL para listar somente o Nome e a cidade dos alunos com idade entre 15 e 18 anos que não moram em palhoça

SELECT NOME, CIDADE FROM ALUNO WHERE (IDADE BETWEEN 15 AND 18) AND (CIDADE <> "PALHOÇA")

# 16. Crie uma consulta SQL para listar somente a cidade de todos os alunos que têm cidade cadastrada

SELECT CIDADE FROM ALUNO WHERE CIDADE IS NOT NULL

# 17. Crie uma consulta SQL para listar somente o nome dos alunos com 18 anos que mora em palhoça ou 17 anos que mora em são José

SELECT NOME FROM ALUNO WHERE (IDADE = 18 AND CIDADE = "PALHOCA" ) OR (IDADE = 17 AND CIDADE = "SAO JOSE");

# 18. Crie uma consulta SQL para lista somente o nome dos alunos do sexo masculino moradores de tubarão com idade entre 18 e 25 anos

SELECT NOME FROM ALUNO WHERE SEXO = 'M' AND CIDADE = 'TUBARAO' AND IDADE BETWEEN 18 AND 25;


# 19. Crie uma consulta SQL para liste somente o nome e a idade dos alunos, ordenado pela idade

SELECT NOME, IDADE FROM ALUNO ORDER BY IDADE

# 20. Crie uma consulta SQL para liste somente o código e o nome dos alunos, ordenado pelo nome de forma decrescente.

SELECT IDALUNO, NOME FROM ALUNO ORDER BY NOME DESC

# 21. Crie uma consulta SQL para liste todos os dados dos alunos, ordenado pela idade de forma decrescente e depois pelo nome de forma crescente.

SELECT * FROM ALUNO ORDER BY IDADE DESC , NOME ASC

# 22. Crie uma consulta SQL para liste todos os dados dos alunos, ordenado pelo sexo e depois pelo nome

SELECT * FROM ALUNO ORDER BY SEXO, NOME

# 23. Crie uma instrução SQL para alterar a idade do aluno 'Jose' para 20 anos

UPDATE ALUNO SET IDADE = 20 WHERE NOME = "JOSE"

# 24. Crie uma instrução SQL para alterar a idade dos alunos 'Tadeu', 'Cesar' e 'Marisa' para 21 anos

UPDATE ALUNO SET IDADE = 21 WHERE NOME = "TADEU" AND NOME = "CESAR" AND NOME = "MARISA"

# 25. Crie uma instrução SQL para alterar o aluno cuja o código seja 12, mudando seu nome para "Luiz" a idade para "22" o sexo para "M" e a cidade para "Tijucas“;

UPDATE ALUNO SET IDADE = 22, NOME = "Luiz", SEXO = "M", CIDADE="TIJUCAS" WHERE IDALUNO = 12

# 26. Crie uma instrução SQL apagar a cidade de todos os alunos acima de 24 anos;

UPDATE ALUNO SET CIDADE = NULL WHERE IDADE > 24

# 27. Crie uma instrução SQL remover os alunos que estão sem cidade;

DELETE FROM ALUNO WHERE CIDADE IS NULL

# 28. Crie uma instrução SQL remover os alunos que moram em tubarão e com mais de 15 anos do sexo masculino;

DELETE FROM ALUNO WHERE CIDADE = 'TUBARAO' AND IDADE > 15 AND SEXO ='M'

# 29. Crie uma instrução SQL remover os alunos "Tadeu", “Alice" "Maria" desde que tenham 19 anos;

DELETE FROM ALUNO WHERE NOME IN('TADEU','ALICE', 'MARIA') AND IDADE = 19

# 30. Crie uma instrução SQL remover os alunos com menos de 18 anos para o sexo masculino e os alunos com menos de 21 do sexo feminino;

DELETE FROM ALUNO WHERE (IDADE < 18 AND SEXO = 'M') OR (IDADE < 21 AND SEXO = 'F')
