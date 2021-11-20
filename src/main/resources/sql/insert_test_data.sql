INSERT INTO `pjm_web_db`.`pot` (`name`, `description`) VALUES ('Beautiful flower pot', 'The best in the world');
INSERT INTO `pjm_web_db`.`pot` (`name`, `description`) VALUES ('Green flower pot', 'The best choice for you');
INSERT INTO `pjm_web_db`.`pot` (`name`, `description`) VALUES ('Amazing flower pot', 'Just amazing');
INSERT INTO `pjm_web_db`.`pot` (`name`, `description`) VALUES ('XR3000', 'Watering Garden Planter for Indoor and Outdoor Use');
INSERT INTO `pjm_web_db`.`pot` (`name`, `description`) VALUES ('Tinypot', 'Small pot');

INSERT INTO `pjm_web_db`.`user` (`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) VALUES ('Baran', 'Yuliya', 'yulbaran@gmail.com', 'female', '2003-06-04', 'vlad123', 'askdjflgrqe');
INSERT INTO `pjm_web_db`.`user` (`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) VALUES ('Borysov', 'Karyna', 'karborysova@gmail.com', 'female', '2003-04-23', 'milasha', 'wregwhfds');
INSERT INTO `pjm_web_db`.`user` (`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) VALUES ('Sobol', 'Vladyslav', 'vlad1234@gmail.com', 'male', '2003-11-12', 'odarkaa', 'werydfs');
INSERT INTO `pjm_web_db`.`user` (`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) VALUES ('Shevchuk', 'Milana', 'milashev@gmail.com', 'female', '2003-03-15', 'kovalenkovika', 'tegbvcfd');
INSERT INTO `pjm_web_db`.`user` (`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) VALUES ('Odarka', 'Oksana', 'odarkaa@gmail.com', 'female', '2003-07-27', 'zhenia69', 'hdgwegfd');
INSERT INTO `pjm_web_db`.`user` (`surname`, `name`, `email`, `gender`, `birthday`, `login`, `password`) VALUES ('Melnyk', 'Davyd', 'davydmelnyk@gmail.com', 'male', '2003-08-05', 'davydmelny', 'sdfgwerg');

INSERT INTO `pjm_web_db`.`review` (`text`, `rate`, `user_id`, `pot_id`) VALUES ('Cool!', '8', '1', '1');
INSERT INTO `pjm_web_db`.`review` (`text`, `rate`, `user_id`, `pot_id`) VALUES ('The best', '10', '2', '1');
INSERT INTO `pjm_web_db`.`review` (`text`, `rate`, `user_id`, `pot_id`) VALUES ('Ugly', '2', '3', '1');
INSERT INTO `pjm_web_db`.`review` (`text`, `rate`, `user_id`, `pot_id`) VALUES ('Not bad', '6', '3', '2');
