USE `pjm_web_db`;
DROP procedure IF EXISTS `insertion_into_review`;

DELIMITER $$
USE `pjm_web_db`$$
CREATE PROCEDURE `insertion_into_review` (
IN text VARCHAR(200),
IN rate INT,
IN user_id INT,
IN pot_id INT
)
BEGIN
INSERT INTO review(`text`, `rate`, `user_id`, `pot_id`) VALUES (text, rate, user_id, pot_id);
END$$

DELIMITER ;
