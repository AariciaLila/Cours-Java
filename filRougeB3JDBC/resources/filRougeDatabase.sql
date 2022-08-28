/*==============================================================================================*/
/* 								Création de la BDD + table User									*/
/*==============================================================================================*/

-- Lancer Wampserver et se connecter au serveur MySQL
-- select * user; pour voir le contenu de la table
-- desc user; pour voir la structure de la table

CREATE database filrougeB3;

USE filrougeB3;

CREATE TABLE user(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	lastname VARCHAR(30),
	firstname VARCHAR(30)
);

INSERT INTO user (lastname, firstname) VALUES ("Gharbi", "Safia");

ALTER TABLE user ADD date_birth DATE;
ALTER TABLE user ADD mail_address VARCHAR(50);




