create database stufut

create table carta
(idcarta int not null primary key AUTO_INCREMENT,
nombre varchar (20),
media int,
posicion varchar (20),
equipo varchar (20),
pais varchar (20),
velocidad int,
disparo int,
pase int,
regate int,
defensa int,
fisico int,
tipo varchar (20),
likes int,
dislikes int);


create table comentarios_carta_usuario
(idcomentario int not null primary key AUTO_INCREMENT,
descripcion text,
fecha datetime,
nombreusu varchar(20) not null,
idcarta int not null,
FOREIGN KEY (nombreusu) REFERENCES stufut_usuario (nombreusu) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (idcarta) REFERENCES carta (idcarta) ON DELETE CASCADE ON UPDATE CASCADE);


create table comentarios_mazo
(idcomentario int not null primary key AUTO_INCREMENT,
descripcion text,
fecha datetime,
nombreusu varchar(20) not null,
idmazo int not null,
FOREIGN KEY (nombreusu) REFERENCES stufut_usuario (nombreusu) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (idmazo) REFERENCES mazo_carta (idmazo) ON DELETE CASCADE ON UPDATE CASCADE);



create table mazo_carta
(idmazocarta int not null primary key AUTO_INCREMENT,
idcarta int not null,
idmazo int not null,
fechamazocarta datetime,
FOREIGN KEY (idcarta) REFERENCES carta (idcarta) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (idmazo) REFERENCES mazo (idmazo) ON DELETE CASCADE ON UPDATE CASCADE);

create table mazo
(idmazo int not null primary key AUTO_INCREMENT,
nombre varchar(20),
likes int,
fecha datetime,
idformacion int not null,
nombreusu varchar(20) not null,
FOREIGN KEY (idformacion) REFERENCES formacion (idformacion) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (nombreusu) REFERENCES stufut_usuario (nombreusu) ON DELETE CASCADE ON UPDATE CASCADE);

create table formacion
(idformacion int not null primary key,
tipo varchar(20));


create table stufut_usuario
(nombreusu varchar(20) primary key not null,
email varchar(20),
nombre varchar(20),
apellido varchar(20),
pass varchar(20));


