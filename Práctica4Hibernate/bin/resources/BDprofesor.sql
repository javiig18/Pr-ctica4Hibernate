

drop database if exists profesor;

create database profesor;

use profesor; 

create table Direccion (
        direccion_Id integer not null AUTO_INCREMENT,
        calle varchar(255),
        numero integer,
        poblacion varchar(255),
        provincia varchar(255),
        primary key (direccion_Id)
    )ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
    
create table Profesor (
        Id integer not null AUTO_INCREMENT,
	direccion_Id integer NOT NULL,
        nombre varchar(255),
        ape1 varchar(255),
        ape2 varchar(255),
        primary key (Id),
 	CONSTRAINT `FKDIRECCION` FOREIGN KEY (`direccion_Id`) REFERENCES `Direccion` (`direccion_Id`)
    )ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

create table Modulo (
        Id integer not null AUTO_INCREMENT,
        nombre varchar(255),
	creditos integer(255),
        primary key (modulo_Id)
    )ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
