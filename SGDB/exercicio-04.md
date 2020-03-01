# 01 - Com base no DER acima qual é a sintaxe do comando SQL para fazer um join entre a tabela cliente e pedido

SELECT * FROM CLIENTE INNER JOIN PEDIDO ON CLIENTE.IDCLIENTE = PEDIDO.IDCLIENTE;

# 02 - Com base no DER acima qual é a sintaxe do comando SQL para fazer um join entre a tabela produto e item_pedido

SELECT * FROM PRODUTO INNER JOIN ITEM_PEDIDO ON PRODUTO.IDPRODUTO = ITEM_PEDIDO.IDPRODUTO

# 03 - Com base no DER acima qual é a sintaxe do comando SQL para fazer um join entre a tabela pedido e item_pedido

SELECT * FROM PEDIDO INNER JOIN ITEM_PEDIDO ON PEDIDO.IDPEDIDO = ITEM_PEDIDO.IDPEDIDO

# 04 - Com base no DER acima qual é a sintaxe do comando SQL para fazer um join entre a tabela pedido, item_pedido e produto.

SELECT 
* 
FROM ITEM_PEDIDO 
	INNER JOIN PEDIDO ON ITEM_PEDIDO.IDPEDIDO = PEDIDO.IDPEDIDO
    INNER JOIN PRODUTO ON PRODUTO.IDPRODUTO = ITEM_PEDIDO.IDPRODUTO

# 5 - Com base no DER acima qual é a sintaxe do comando SQL para fazer um join entre a tabela cliente, pedido e item_pedido.​

SELECT 
* 
FROM PEDIDO 
	INNER JOIN ITEM_PEDIDO ON PEDIDO.IDPEDIDO = ITEM_PEDIDO.IDPEDIDO
    INNER JOIN CLIENTE ON PEDIDO.IDCLIENTE = CLIENTE.IDCLIENTE

# 6 - ​​​Com base no DER acima qual é a sintaxe do comando SQL para fazer um join entre a tabela cliente, pedido, item_pedido e produto.​

SELECT * FROM PEDIDO 
	INNER JOIN ITEM_PEDIDO ON PEDIDO.IDPEDIDO = ITEM_PEDIDO.IDPEDIDO
    INNER JOIN CLIENTE ON PEDIDO.IDCLIENTE = CLIENTE.IDCLIENTE
    INNER JOIN PRODUTO ON PRODUTO.IDPRODUTO = ITEM_PEDIDO.IDPRODUTO

# 7 - ​​Crie uma consulta SQL para listar o sexo e a quantidade de cliente com cada sexo.​

SELECT 
	CLIENTE.SEXO,
    COUNT(CLIENTE.SEXO)
FROM CLIENTE
WHERE CLIENTE.SEXO IN ('M','F')
GROUP BY 
CLIENTE.SEXO

# 8 - Crie uma consulta SQL para listar o nome do produto e o preco do produto, ordene o resultado categoria do produto em seguida pelo nome do produto.

SELECT 
	PRODUTO.NOME,
    PRODUTO.PRECO
FROM PRODUTO
ORDER BY 
	PRODUTO.CATEGORIA,
    PRODUTO.NOME

# 9 - Crie uma consulta SQL para listar a categoria do produto, a quantidade de produto e a media dos valores dos produtos de cada categoria, ordenado pelo nome da categoria​

SELECT 
    PRODUTO.CATEGORIA,
    COUNT(PRODUTO.CATEGORIA),
    AVG(PRODUTO.PRECO)
FROM PRODUTO
GROUP BY 
    PRODUTO.CATEGORIA

# 10 - Na tabela item_pedido armazena a quantidade que cada produto foi vendida nos pedidos, sendo assim, crie uma consulta SQL para listar o código identificador do produto, a quantidade de itens vendido, o valor de cada produto

SELECT 
    ITEM_PEDIDO .IDPRODUTO,
    ITEM_PEDIDO.QTDE,
    ITEM_PEDIDO.PRECO_UNITARIO
FROM ITEM_PEDIDO;

# 11 - Para saber o valor total de um item em um pedido você deve multiplicar o preco_unitario pela quantidade na tabela de item_pedido, sendo assim, crie uma consulta SQL para listar o codido do pedido, o código do produto, o preço unitário, a quantidade vendida e o valor total do item. Ordene o resultado pelo código do pedido e pelo código do produto 

SELECT
    ITEM_PEDIDO.IDPEDIDO,
    ITEM_PEDIDO.IDPRODUTO,
    ITEM_PEDIDO.PRECO_UNITARIO,
    ITEM_PEDIDO.QTDE,
    SUM(ITEM_PEDIDO.QTDE * ITEM_PEDIDO.PRECO_UNITARIO) AS "TOTAL"
FROM ITEM_PEDIDO
GROUP BY 
    ITEM_PEDIDO.IDPEDIDO,
    ITEM_PEDIDO.IDPRODUTO,
    ITEM_PEDIDO.PRECO_UNITARIO,
    ITEM_PEDIDO.QTDE
ORDER BY 
    ITEM_PEDIDO.IDPEDIDO,
    ITEM_PEDIDO.IDPRODUTO

# 12 - Crie uma consulta SQL para listar a quantidade de pedido (para pegar a quantidade correta de pedido use count(distinct idpedido), a media de item vendido, e o valor total médio

SELECT 
    COUNT(DISTINCT ITEM_PEDIDO.IDPEDIDO),
    AVG(ITEM_PEDIDO.QTDE) AS "MEDIA DE ITENS VENDIDOS",
    AVG(ITEM_PEDIDO.QTDE * ITEM_PEDIDO.PRECO_UNITARIO) AS "VALOR TOTAL MEDIO"
FROM ITEM_PEDIDO

# 13 - Crie uma consulta SQL para listar todos os pedidos do cliente com código identificador igual 

SELECT 
    * 
FROM PEDIDO
    INNER JOIN ITEM_PEDIDO ON ITEM_PEDIDO.IDPEDIDO = PEDIDO.IDPEDIDO
    INNER JOIN  PRODUTO ON ITEM_PEDIDO.IDPRODUTO = PRODUTO.IDPRODUTO
WHERE 
    IDCLIENTE = 3

# 14 - Crie uma consulta SQL para listar o código identificador do cliente, o nome do cliente e a quantidade de pedido de cada cliente

SELECT 
    CLIENTE.IDCLIENTE,
    CLIENTE.NOME,
    COUNT(ITEM_PEDIDO.QTDE)
FROM CLIENTE 
    INNER JOIN PEDIDO ON PEDIDO.IDCLIENTE = CLIENTE.IDCLIENTE
    INNER JOIN ITEM_PEDIDO ON ITEM_PEDIDO.IDPEDIDO = PEDIDO.IDPEDIDO
GROUP BY 
	 CLIENTE.IDCLIENTE,
     CLIENTE.NOME

# 15 - ​Crie uma consulta SQL para listar o código identificador do cliente, o nome do cliente e a quantidade de pedido de cada cliente. Caso o cliente não tenha pedido ele deve listado também

SELECT 
    CLIENTE.IDCLIENTE,
    CLIENTE.NOME,
    COUNT(ITEM_PEDIDO.QTDE)
FROM CLIENTE 
     JOIN PEDIDO ON PEDIDO.IDCLIENTE = CLIENTE.IDCLIENTE
     JOIN ITEM_PEDIDO ON ITEM_PEDIDO.IDPEDIDO = PEDIDO.IDPEDIDO
GROUP BY 
	 CLIENTE.IDCLIENTE,
     CLIENTE.NOME

# 16 - Crie uma consulta SQL para listar o código identificador do produto, o nome do produto, a quantidade de pedidos únicos (distinct), a quantidade vendida de produtos e a media de produtos vendidos por pedido. Ordene o resultado pelo nome quantidade vendida de produtos decrescente

SELECT 
    COUNT(ITEM_PEDIDO.IDPEDIDO),
    PRODUTO.NOME,
    PRODUTO.IDPRODUTO,
    ITEM_PEDIDO.QTDE,
    AVG(ITEM_PEDIDO.QTDE * ITEM_PEDIDO.PRECO_UNITARIO) AS "MEDIA DE PRODUTOS"
FROM ITEM_PEDIDO
     INNER JOIN PRODUTO ON ITEM_PEDIDO.IDPRODUTO = PRODUTO.IDPRODUTO
GROUP BY 
    PRODUTO.IDPRODUTO,
    PRODUTO.NOME,
    ITEM_PEDIDO.QTDE
ORDER BY 
    PRODUTO.NOME,
    ITEM_PEDIDO.IDPEDIDO DESC

PRESTAR ATENÇÃO NA CORREÇÃO.....

# 17 - Crie uma consulta SQL para listar o nome do produto e a quantidade vendida. Mesmo que o produto não tenha nenhuma venda ele deve ser listado na consulta

SELECT 
    PRODUTO.NOME,
    ITEM_PEDITO.QTDE
FROM PRODUTO 
     RIGTH JOIN ITEM_PEDIDO ON PRODUTO.IDPRODUTO = ITEM_PEDIDO.IDPRODUTO

# 18 - Crie uma consulta SQL para lista o código identificador do cliente, o nome do cliente e a quantidade de pedido do cliente, liste apenas os clientes que tem mais de 5 pedidos, ordene pela quantidade de pedido de forma decrescente

SELECT 
    CLIENTE.IDCLIENTE,
    CLIENTE.NOME,
    COUNT(ITEM_PEDIDO.QTDE)
FROM ITEM_PEDIDO 
   INNER JOIN PEDIDO ON ITEM_PEDIDO.IDPEDIDO = PEDIDO.IDPEDIDO
   INNER JOIN CLIENTE ON PEDIDO.IDCLIENTE = CLIENTE.IDCLIENTE
GROUP BY 
        CLIENTE.IDCLIENTE,
        CLIENTE.NOME
HAVING 
    COUNT(ITEM_PEDIDO.QTDE) > 5
ORDER BY 
    ITEM_PEDIDO.QTDE DESC

# 19 - ​​Crie uma consulta SQL para listar o código identificador do pedido, data do pedido, o código identificador do cliente, nome do cliente, o código identificador do produto, nome do produto, preço unitário do produto, quantidade vendida e o valor total do produto, listando apenas o pedido com código identificador igual a 10

SELECT 
    PEDIDO.IDPEDIDO,
    PEDIDO.DTPEDIDO,
    CLIENTE.IDCLIENTE,
    CLIENTE.NOME,
    PRODUTO.IDPRODUTO,
    PRODUTO.NOME,
    ITEM_PEDIDO.PRECO_UNITARIO,
    ITEM_PEDIDO.QTDE,
    SUM(ITEM_PEDIDO.PRECO_UNITARIO * ITEM_PEDIDO.QTDE )
FROM
    PEDIDO 
	INNER JOIN ITEM_PEDIDO ON PEDIDO.IDPEDIDO = ITEM_PEDIDO.IDPEDIDO
    INNER JOIN CLIENTE ON PEDIDO.IDCLIENTE = CLIENTE.IDCLIENTE
    INNER JOIN PRODUTO ON PRODUTO.IDPRODUTO = ITEM_PEDIDO.IDPRODUTO
WHERE 
    PEDIDO.IDPEDIDO = 10
GROUP BY 
    PEDIDO.IDPEDIDO,
    PEDIDO.DTPEDIDO,
    CLIENTE.IDCLIENTE,
    CLIENTE.NOME,
    PRODUTO.IDPRODUTO,
    PRODUTO.NOME,
    ITEM_PEDIDO.PRECO_UNITARIO,
    ITEM_PEDIDO.QTDE

# 20 - Crie uma consulta SQL que liste o sexo do cliente, a categoria do produto e a quantidade de produto vendidos

SELECT 
    CLIENTE.SEXO,
    PRODUTO.CATEGORIA,
    COUNT(ITEM_PEDIDO.QTDE)
FROM ITEM_PEDIDO 
    INNER JOIN PRODUTO ON ITEM_PEDIDO.IDPRODUTO = PRODUTO.IDPRODUTO
    INNER JOIN PEDIDO ON PEDIDO.IDPEDIDO = ITEM_PEDIDO.IDPEDIDO
    INNER JOIN CLIENTE ON CLIENTE.IDCLIENTE = PEDIDO.IDCLIENTE
GROUP BY 
    CLIENTE.SEXO,
    PRODUTO.CATEGORIA