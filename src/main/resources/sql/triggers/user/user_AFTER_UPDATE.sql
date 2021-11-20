DROP TRIGGER IF EXISTS `pjm_web_db`.`user_AFTER_UPDATE`;

DELIMITER $$
USE `pjm_web_db`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `user_AFTER_UPDATE` AFTER UPDATE ON `user` FOR EACH ROW BEGIN
	IF new.login  RLIKE "^[0-9].+" THEN
			SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "UPDATE Error (login can't start with number).";
	END IF;
	IF LENGTH(new.login)<6 THEN
			SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "UPDATE Error (login is too short).";
	END IF;
END$$
DELIMITER ;
