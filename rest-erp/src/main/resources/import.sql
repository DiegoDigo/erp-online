insert into usuario(nome, login, sistema, password) values ('ADM CB','portalvendas', 'PORTAL_VENDAS','@erponlinerestapi2017');
 
insert into perfil(nome) values ('ROLE_USER');
insert into perfil(nome) values ('ROLE_ADMIN');
insert into perfil(nome) values ('ROLE_GUEST'); 

insert into perfil_usuario(id_usuario, id_perfil) values (1,1);
insert into perfil_usuario(id_usuario, id_perfil) values (1,2);