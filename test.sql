DROP TABLE IF EXISTS PACIENTES;
CREATE TABLE PACIENTES
(ID BIGINT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(255), APELLIDO VARCHAR(255),DNI VARCHAR(255), FECHA_INGRESO VARCHAR(255), DIRECCION BIGINT);
DROP TABLE IF EXISTS DIRECCION;
CREATE TABLE DIRECCION
(ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL, CALLE VARCHAR(255), NUMERO VARCHAR(255), LOCALIDAD VARCHAR(255), PROVINCIA VARCHAR(255));