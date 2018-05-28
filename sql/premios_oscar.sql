/*
-- BASE DATOS: MySQL
-- Date: 2018-05-19 19:54
-- autor: wlopera
*/
usuario:  root
clave:    admin
puerto:   3306
hostname: localhost

/*
-- Table: gender
-- Date: 2018-05-19 19:54
-- autor: wlopera
*/
CREATE TABLE 'gender' (
  'id_gender' int(11) NOT NULL AUTO_INCREMENT,
  'name' varchar(45) NOT NULL,
  'description' varchar(45) NOT NULL,
  PRIMARY KEY ('id_gender')
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
SELECT * FROM premios_oscar.gender;

/*
-- Table: oscar
-- Date: 2018-05-19 19:54
-- autor: wlopera
*/
CREATE TABLE 'oscar' (
  'id_oscar' int(11) NOT NULL AUTO_INCREMENT,
  'year' int(11) NOT NULL,
  'edition' int(11) NOT NULL,
  'name' varchar(45) NOT NULL,
  'awards' int(11) NOT NULL,
  'nominations' int(11) NOT NULL,
  'id_gender' int(11) NOT NULL,
  'description' varchar(255) DEFAULT NULL,
  PRIMARY KEY ('id_oscar')
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


/*
-- Query: SELECT * FROM premios_oscar.gender
LIMIT 0, 1000

-- Date: 2018-05-19 19:54
-- autor: wlopera
*/
INSERT INTO 'gender' ('id_gender','name','description') VALUES (1,'AMOR','AMOR');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (2,'AVENTURA','AVENTURA');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (3,'DRAMA','DRAMA');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (4,'EPICA','EPICA');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (5,'BELICO','BELICO');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (6,'ROMANCE','ROMANCE');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (7,'BIOGRAFICO','BIOGRAFICO');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (8,'MUSICAL','MUSICAL');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (9,'FANTASIA','FANTASIA');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (10,'COMEDIA','COMEDIA');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (11,'ACCION','ACCION');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (12,'TERROR','TERROR');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (13,'SUSPENSO','SUSPENSO');
INSERT INTO 'gender' ('id_gender','name','description') VALUES (14,'WESTERN','WESTERN');

/*
-- Query: SELECT * FROM premios_oscar.oscar
LIMIT 0, 1000

-- Date: 2018-05-28 11:25
*/
INSERT INTO 'oscar' ('id_oscar','year','edition','name','awards','nominations','id_gender','description') VALUES (1,1982,55,'GHADHI',8,11,7,'Historia de Gandhi');
INSERT INTO 'oscar' ('id_oscar','year','edition','name','awards','nominations','id_gender','description') VALUES (4,1990,63,'DANCES WITH WOLVES',7,12,14,'Danza con Lobos');
INSERT INTO 'oscar' ('id_oscar','year','edition','name','awards','nominations','id_gender','description') VALUES (5,1993,66,'La Lista de Schindler ',7,12,3,'Historico Lista de Schindler');
INSERT INTO 'oscar' ('id_oscar','year','edition','name','awards','nominations','id_gender','description') VALUES (6,1998,71,'SHAKESPEARE IN LOVE',7,13,6,'Romance - Shakespeare Enamorado');
