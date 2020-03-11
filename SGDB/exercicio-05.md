# 1 - Construa uma consulta SQL para listar o código identificador do cliente, o nome do cliente e carro locado por esse cliente (Listar a marca, o modelo, a placa do carro e a data de locação)​

SELECT 
CLIENTE.IDCLIENTE,
CLIENTE.NOME,
VEICULO.MARCA,
VEICULO.MODELO,
VEICULO.PLACA,
LOCACAO.DT_LOCACAO
FROM LOCACAO
    INNER JOIN CLIENTE ON 
    LOCACAO.IDCLIENTE = CLIENTE.IDCLIENTE
    INNER JOIN VEICULO ON 
    LOCACAO.IDVEICULO = VEICULO.IDVEICULO; 


# 2 - Construa uma consulta SQL para listar o código identificador do veículo, marca do veículo, modelo do veículo e a quantidade de locação de cada veiculo;

SELECT 
VEICULO.IDVEICULO,
VEICULO.MARCA,
VEICULO.MODELO,
COUNT(VEICULO.IDVEICULO) AS QTD_LOCACAO
FROM LOCACAO
    INNER JOIN VEICULO ON 
    LOCACAO.IDVEICULO = VEICULO.IDVEICULO
GROUP BY 
    VEICULO.IDVEICULO,
    VEICULO.MARCA,
    VEICULO.MODELO;

# 3 - Construa uma consulta SQL que liste o código identificador do cliente, o nome do cliente e a quantidade de quilômetros percorridos (para encontrar a quilometragem percorrida, você deve subtrair a km da locação da km da entrega);

SELECT 
distinct CLIENTE.IDCLIENTE,
CLIENTE.NOME,
(LOCACAO.KM_ENTREGA - LOCACAO.KM_LOCACAO)
FROM LOCACAO
    INNER JOIN CLIENTE ON 
    LOCACAO.IDCLIENTE = CLIENTE.IDCLIENTE;


# 4 - Construa uma consulta SQL para listar todos os veículos que não possuem nenhum opcional;

SELECT 
*
FROM VEICULO
    LEFT JOIN OPCIONAL_VEICULO ON 
    OPCIONAL_VEICULO.IDVEICULO = VEICULO.IDVEICULO
WHERE 
    OPCIONAL_VEICULO.IDVEICULO IS NULL;


# 5 - Construa uma consulta SQL para listar o código identificador de cada veículo,  a marca do veículo, o modelo do veículo, a quantidade de locação de cada veiculo e a soma das quilometragens usada em cada veículo;

SELECT 
VEICULO.IDVEICULO,
VEICULO.MARCA,
VEICULO.MODELO,
COUNT(LOCACAO.IDVEICULO),
SUM(KM_ENTREGA - KM_LOCACAO )
FROM VEICULO
    INNER JOIN LOCACAO on  
    VEICULO.IDVEICULO = LOCACAO.IDVEICULO
GROUP BY 
    VEICULO.IDVEICULO,
    VEICULO.MARCA,
    VEICULO.MODELO

# 6 - Construa uma consulta SQL para listar os seguintes dados: código identificador do cliente, nome do cliente, telefone celular do cliente, data da locação, marca do veículo locado, modelo do veículo locado e nome do funcionário responsável pela locação;

SELECT 
CLIENTE.IDCLIENTE,
CLIENTE.NOME,
CLIENTE.FONE_CELULAR,
LOCACAO.DT_LOCACAO,
VEICULO.MARCA,
VEICULO.MODELO,
FUNCIONARIO.NOME
FROM CLIENTE
    INNER JOIN LOCACAO ON 
    CLIENTE.IDCLIENTE = LOCACAO.IDCLIENTE
    INNER JOIN VEICULO ON
    LOCACAO.IDVEICULO = VEICULO.IDVEICULO
    INNER JOIN FUNCIONARIO ON
    LOCACAO.IDFUNCIONARIO = FUNCIONARIO.IDFUNCIONARIO


# 7 - Construa uma consulta SQL para listar a quantidade de locação por dia da semana (para descobrir o dia da semana utilize a função dayofweek passando a data de locação como parametro);​

SELECT 
DAYOFWEEK(DT_LOCACAO),
COUNT(IDLOCACAO)
FROM LOCACAO
GROUP BY 
    DT_LOCACAO


# 8 - Construa uma consulta SQL para listar a quilometragem média (somando todos os veículos) por mês e ano (para descobrir o mês de uma data utilize a função month, para descobrir o ano utilize a função year)


SELECT 
AVG( KM_ENTREGA - KM_LOCACAO ) AS "MÉDIA KM",
MONTH(DT_LOCACAO),
YEAR(DT_LOCACAO)
FROM LOCACAO
group BY 
    MONTH(DT_LOCACAO),
    YEAR(DT_LOCACAO)

# 9 - Construa uma consulta SQL para listar o tempo médio em dias de locação (para descobrir o tempo de locação utilize a função datediff passando como parâmetro a data de locação e a data de entrega);

SELECT 
AVG(datediff(DT_ENTREGA, DT_LOCACAO)) "MEDIA DE DIAS DE LOCACAO"
FROM LOCACAO 

# 10 - Construa uma consulta SQL para listar a quilometragem média de locação;

SELECT 
AVG(KM_ENTREGA - KM_LOCACAO) AS "QUILOMETRAGEM MÉDIA"
FROM LOCACAO

# 11 - Construa uma consulta SQL a quantidade de locação por opcional de veículo;

SELECT 
OPCIONAL_VEICULO.IDOPCIONAL,
count(IDLOCACAO)
FROM LOCACAO 
    INNER JOIN OPCIONAL_VEICULO ON 
    LOCACAO.IDVEICULO = OPCIONAL_VEICULO.IDVEICULO 
GROUP BY 
    OPCIONAL_VEICULO.IDOPCIONAL


# 12 - Construa uma consulta SQL que liste o valor a pagar por cada km, a quantidade de km utilizado e o valor total a pagar por cada locação;​

SELECT 
LOCACAO.IDLOCACAO,
(KM_ENTREGA - KM_LOCACAO )  as "KM USADOS",
TABELA.VALOR,
((KM_ENTREGA - KM_LOCACAO ) * TABELA.VALOR) as "Valor total"
FROM TABELA_VEICULO 
    INNER JOIN VEICULO ON 
    TABELA_VEICULO.IDVEICULO  = VEICULO.IDVEICULO
    INNER JOIN LOCACAO ON 
    LOCACAO.IDVEICULO = VEICULO.IDVEICULO
    INNER JOIN TABELA ON 
    TABELA_VEICULO.IDTABELA = TABELA.IDTABELA
WHERE 
    TABELA.TIPO = "KM"
ORDER BY 
    LOCACAO.IDLOCACAO

# 13 - ​​​Construa uma consulta SQL que liste o valor a pagar por dia, a quantidade de dias utilizado e o valor total a pagar por cada locação;


SELECT 
LOCACAO.IDLOCACAO,
(KM_ENTREGA - KM_LOCACAO )  as "KM USADOS",
TABELA.VALOR,
((KM_ENTREGA - KM_LOCACAO ) * TABELA.VALOR) as "Valor total"
FROM TABELA_VEICULO 
    INNER JOIN VEICULO ON 
    TABELA_VEICULO.IDVEICULO  = VEICULO.IDVEICULO
    INNER JOIN LOCACAO ON 
    LOCACAO.IDVEICULO = VEICULO.IDVEICULO
    INNER JOIN TABELA ON 
    TABELA_VEICULO.IDTABELA = TABELA.IDTABELA
WHERE 
    TABELA.TIPO = "KM"
ORDER BY 
    LOCACAO.IDLOCACAO




