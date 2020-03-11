# 1 Crie uma consulta SQL que liste o nome e o telefone de cada proprietário, ordenado pelo nome;

SELECT 
TELEFONE_RESIDENCIAL
FROM PROPRIETARIO
ORDER BY NOME;

# 2 Crie uma consulta SQL que liste todos os serviços realizados pela oficina, ordenado pelo nome do serviço;

SELECT 
SERVICO.NOME
FROM ITEM_SERVICO 
    LEFT JOIN SERVICO ON  
    ITEM_SERVICO.IDSERVICO = SERVICO.IDSERVICO
ORDER BY SERVICO.NOME

# 3 Crie uma consulta SQL que liste todos os produtos vendidos pela oficina, ordenado pelo nome do produto;

SELECT 
PRODUTO.NOME
FROM ITEM_PRODUTO 
    INNER JOIN PRODUTO ON  
    ITEM_PRODUTO.IDPRODUTO = PRODUTO.IDPRODUTO
ORDER BY 
    PRODUTO.NOME

# 4 Crie uma consulta SQL que liste a quantidade de veículo por marca de veiculo;

SELECT 
MARCA,
COUNT(IDVEICULO)
FROM VEICULO
GROUP BY 
    MARCA
        
# 5 Liste os proprietários que fazem aniversario nos próximos 45 dias, listar quando será a data de aniversario, ordenado pela data de aniversario;​

/* # 5 Liste os proprietários que fazem aniversario nos próximos 45 dias, listar quando será a data de aniversario, ordenado pela data de aniversario;​ */

SELECT 
PROPRIETARIO.NOME,
CONCAT (DAY(DT_NASCIMENTO) ,"/",MONTH(DT_NASCIMENTO),"/", YEAR(NOW()))  AS "DATA DE ANIVERSARIO"
FROM PROPRIETARIO
WHERE 
    DAY(DT_NASCIMENTO) BETWEEN DAY(NOW()) AND DAY(DATE_ADD(NOW(), INTERVAL 45 DAY)) 
    AND
    MONTH(DT_NASCIMENTO) BETWEEN MONTH(NOW()) AND MONTH(NOW()) + 1
ORDER BY 
    PROPRIETARIO.NOME

# 6 Crie uma consulta SQL que liste todos os proprietários de veículos e seus respectivos carros, o proprietário deve ser listado mesmo não tendo carro;

# 7 Crie uma consulta SQL que liste todos os carros e seus respectivos proprietários, ordenados por nome do proprietário;

# 8 Crie uma consulta SQL que liste todos os mecânicos cadastrados na oficina;​

# 9 Crie uma consulta SQL que liste o nome e o valor de todos os produtos já utilizados em um orçamento pela oficina;

# 10 ​Crie uma consulta SQL que liste todos os orçamentos realizadas no carro com o código(IDVEICULO) igual à 3, você deve lista a quantidade de serviço realizado e a soma total dos valores do serviço;

# 11 Crie uma consulta SQL que liste todos os orçamentos realizadas no carro com o código(IDVEICULO) igual à 3, você deve lista a quantidade de produto utilizado e a soma total de produto utilizado;

# 12 Crie uma consulta SQL que liste todas os orçamentos realizadas no carro com o código(idcarro) igual à 2, liste também o nome do mecânico responsável pela manutenção;

# 13 Crie uma consulta SQL que liste a quantidade de orçamentos por carro, desde que o ano de fabricação seja 2014;

# 14 Crie uma consulta SQL que liste a media do valor pago em cada orçamento;

# 15 Crie uma consulta SQL que liste a quantidade de orçamentos realizados por mês e ano, a soma dos valores pagos, e a média paga em cada mês e ano;

