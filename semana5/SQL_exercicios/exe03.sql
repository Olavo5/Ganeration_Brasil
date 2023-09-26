create database db_escola;

use db_escola;

create table tb_aluno(
id_aluno bigint auto_increment,
nome_aluno varchar (50) not null,
sobrenome varchar (100) not null,
data_nascimento date not null,
ano_letivo int not null,
nota decimal(2,2) not null,
primary key(id_aluno)
);

alter table tb_aluno modify nota decimal(4,2);

insert into tb_aluno (nome_aluno, sobrenome, data_nascimento, ano_letivo, nota)
values
    ('Maria', 'Silva', '2000-03-15', 2023, 8.75),
    ('João', 'Santos', '2001-06-22', 2023, 7.90),
    ('Ana', 'Pereira', '2002-01-10', 2023, 9.25),
    ('Pedro', 'Fernandes', '2000-11-05', 2023, 6.80),
    ('Carla', 'Oliveira', '2002-08-18', 2023, 8.50),
    ('Rafael', 'Lima', '2001-09-30', 2023, 7.20),
    ('Luiza', 'Gomes', '2003-04-12', 2023, 9.80),
    ('Fernando', 'Rodrigues', '2002-12-07', 2023, 5.45),
    ('Mariana', 'Martins', '2000-07-25', 2023, 6.95),
    ('Lucas', 'Ferreira', '2003-02-19', 2023, 7.75);

select * from tb_aluno
where nota > 7;

select * from tb_aluno
where nota < 7;
    
update tb_aluno
set nome_aluno = 'Lucas'
where data_nascimento = '2002-02-19';
    
select * from tb_aluno;
