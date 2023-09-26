create database db_rh;

use db_rh;

create table colaboradores(
id_colaborador bigint auto_increment,
nome_colaborador varchar (50) not null,
sobrenome_colaborador varchar (100) not null,
cargo varchar (100) not null,
salario decimal(6,2) not null,
primary key(id_colaborador)
);

INSERT INTO colaboradores (nome_colaborador, sobrenome_colaborador, cargo, salario)
VALUES
    ('João', 'Silva Oliveira', 'Gerente de Vendas', 12.500),
    ('Maria', 'Tomé Pereira', 'Programador Sênior', 9.200),
    ('Ana', 'Lopes Guerra', 'Engenheiro de Software', 8.700),
    ('Juan', 'Fernandes Sanchez', 'Analista Financeiro', 5.500),
    ('Aline', 'Arruda Conceição', 'Analista de Recursos Humanos', 7.500),
    ('Henrique', 'Gusmão Oliveira', 'Analista de Qualidade', 5.500),
    ('Rafael', 'Silva Cardoso', 'Marketing e Performance', 5.500),
    ('Bianca', 'Pedrosa De Assís', 'Gerente de Contabilidade', 15.500),
    ('Luiz', 'Teló de Castro', 'Analista de Dados', 8.700),
    ('Pedro', 'Oliveira Munis', 'Designer Gráfico', 6.800);

alter table colaboradores rename to tb_colaboradores;
alter table tb_colaboradores modify salario decimal(6,3);

select salario from tb_colaboradores
where salario > 2.000000;

select salario from tb_colaboradores
where salario < 2.000000;

update tb_colaboradores
set salario = 2.000000
where id_colaborador = 7;