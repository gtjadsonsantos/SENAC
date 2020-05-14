# AOO

## PILATES 

- ABSTRAÇÃO 
- HERANÇA
- POLIMORFISMO
- ENCAPSULAMENTO

COMIC STORE 1..1    1..* REVISTA        
                  1..1 ATENDENTE
                  1..1 GERRENTE  
                  1..* CLIENTES   
                  1..1 ESTOQUE 
                  1..* VENDA 

VENDA 1..*        1..1 ATENDENTE
                  0..1 GERENTE
                  1..1 CLIENTE
                  1..* REVISTAS

ATENDENTE 1..1         1..1 COMIC STORE
                       1..1 GERENTE 
                       1..* VENDA
                       1..* CLIENTES

GERENTE 1..1      1..1 COMIC STORE
                  1..* VENDA
                  1..* CLIENTES
                  1..1 ESTOQUE

ESTOQUE 1..1       1..1 GERENTE
                   