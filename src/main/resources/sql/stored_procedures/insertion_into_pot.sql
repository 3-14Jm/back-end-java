USE `pjm_web_db`;
DROP procedure IF EXISTS `insertion_into_pot`;

DELIMITER $$
USE `pjm_web_db`$$
CREATE PROCEDURE `insertion_into_pot` (
IN name VARCHAR(60),
IN description VARCHAR(1000)
)
BEGIN
INSERT INTO pot(`name`, `description`) VALUES (name, description);
END$$

DELIMITER ;