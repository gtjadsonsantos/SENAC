/*
Crie uma consulta SQL que liste todos os alunos com “R" no nome e informe a posição da letra;
*/

SELECT 
NOME,
LOCATE('R',NOME) 
FROM ALUNO
WHERE 
NOME LIKE "%R%";


/*
Crie uma consulta SQL que lista o nome de todos os alunos em ordem alfabética e com todos os caracteres 
em letra minúsculas, exceto a primeira letra que deve estar em maiúscula;
*/


SELECT 
NOME,
CONCAT(LOWER(SUBSTRING(NOME,1,1)),UCASE(SUBSTRING(NOME,1,(LENGTH(NOME)-1))))
FROM ALUNO
ORDER BY 
NOME


/*
Crie uma consulta SQL que listar “Sr. ” na frente do nome quando o aluno for masculino e “Sra.” 
quando o aluno for do sexo feminino. O nome deve estar com apenas a primeira letra em maiúscula e 
o texto “Sr.” e “Sra.” deve aparecer junto com o nome separado por espaço;
*/



SELECT
CONCAT (
REPLACE(REPLACE(SEXO,"F","Sra "),"M","Sr "),
SUBSTRING(NOME, 1,1),
SUBSTRING(NOME, 2,LENGTH(NOME) - 1))
FROM ALUNO


/*
Crie uma consulta SQL para criar a frase juntando o nome do aluno com a cidade o resultado deve 
aparecer da seguinte forma “Maria mora em São José";
*/



SELECT
CONCAT(NOME, " MORA EM ", CIDADE)
FROM ALUNO



/*
Crie uma consulta SQL para listar todos os alunos, listando o nome e a idade de cada aluno;
*/

SELECT
NOME,
(YEAR(NOW()) - YEAR(DT_NASCIMENTO)) as IDADE
FROM ALUNO


/*
Crie uma consulta SQL para  listar todos os alunos, listando o nome e a data do próximo aniversário de cada aluno
*/


SELECT
NOME,
CONCAT(DAY(DT_NASCIMENTO),"/",MONTH(DT_NASCIMENTO),"/",YEAR(NOW())+1)

FROM ALUNO