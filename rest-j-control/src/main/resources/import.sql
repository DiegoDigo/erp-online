insert into usuario(nome, login, sistema, password) values ('Rasa Lariguet','rasa', 'PORTAL_VENDAS','123');
insert into usuario(nome, login, sistema, password) values ('Rodrigo Galante','rodrigo', 'PORTAL_VENDAS','123');
insert into usuario(nome, login, sistema, password) values ('Wagner Dragao','dragao', 'SFA', '123');
 
insert into perfil(nome) values ('ROLE_USER');
insert into perfil(nome) values ('ROLE_ADMIN');
insert into perfil(nome) values ('ROLE_GUEST'); 

insert into perfil_usuario(id_usuario, id_perfil) values (1,1);
insert into perfil_usuario(id_usuario, id_perfil) values (1,2);
insert into perfil_usuario(id_usuario, id_perfil) values (2,1);
insert into perfil_usuario(id_usuario, id_perfil) values (3,1);
