create database proyectoun


USE proyectoun

select * from materias

select * from temas

INSERT INTO temas(Descripcion,idMateria) VALUES('Fracciones',(SELECT idMateria FROM materias WHERE Materia = 'Matematicas'))

create table ejercicios(
	idEjercicio int primary key AUTO_INCREMENT, 
    urlEjercicio longblob not null,
    urlSolucion longblob,
    idTema int not null
)

ALTER TABLE ejercicios ADD FOREIGN KEY (idTema) REFERENCES temas(idTema)
INSERT INTO materias(Materia) VALUES ('Fisica')

SELECT * FROM ejercicios
SELECT * FROM materias
INSERT INTO ejercicios(urlEjercicio,idTema) VALUES('url.com',1)

select * from usuarios
select * from ejercicios
INSERT INTO tipoUsuario(Descripcion) VALUES('Invitado')
INSERT INTO usuarios(usuario,contraseña,tipoUsuario) VALUES('sergio.rivera','sergio',3)
UPDATE usuarios SET usuario = 'invitado',contraseña = 'invitado' where tipoUsuario = 3

DELETE FROM temas WHERE idTema = 1
SELECT * FROM ejercicios