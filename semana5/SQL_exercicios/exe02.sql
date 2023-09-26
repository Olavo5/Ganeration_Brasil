create database db_ecomerce;

use db_ecomerce;

create table tb_produto(
id_produto bigint auto_increment,
nome_produto varchar (50) not null,
descricao varchar (100) not null,
quantidade int not null,
preco decimal(6,3) not null,
primary key(id_produto)
);

ALTER TABLE tb_produto MODIFY preco decimal(7,2);


insert into tb_produto (nome_produto, descricao, quantidade, preco)
values
    ('Smartphone', 'Um smartphone com câmera de alta qualidade', 50, 999.99),
    ('Notebook', 'Notebook processador de última geração', 30, 1299.00),
    ('Fones de Ouvido Sem Fio', 'Fones de ouvido Bluetooth', 100, 149.95),
    ('Máquina de Café Expresso', 'Prepara café expresso aromático em minutos', 20, 299.50),
    ('Smart TV 4K', 'Smart TV com resolução 4K', 15, 799.99),
    ('Cadeira de Escritório Ergonômica', 'Cadeira de escritório ergonômica', 40, 199.00),
    ('Liquidificador Multifuncional', 'Liquidificador com várias funções', 60, 79.95),
    ('Tênis de Corrida', 'Tênis esportivos leves e confortáveis', 75, 129.99),
    ('Relógio Inteligente', 'Relógio inteligente com monitoramento de saúde', 55, 179.50),
    ('Mochila de Viagem', 'Mochila durável e espaçosa para', 25, 49.99);
    
    select * from tb_produto
    where preco > 500;

    select * from tb_produto
    where preco < 500;
    
UPDATE tb_produto
SET preco = 100
where preco < 100;
    
select * from tb_produto;
