USE `pjm_web_db`;
DROP procedure IF EXISTS `insertion_into_user`;

DELIMITER $$
USE `pjm_web_db`$$
CREATE PROCEDURE `insertion_into_user` (
IN surname VARCHAR(40),
IN name VARCHAR(40),
IN email VARCHAR(100),
IN gender VARCHAR(20),
IN birthday DATE,
IN login VARCHAR(50),
IN password VARCHAR(60)
)
BEGIN
INSERT INTO user(`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) 
VALUES (surname, name, email, gender, birthday, login, password);
END$$

DELIMITER ;
