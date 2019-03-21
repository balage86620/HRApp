INSERT INTO `evo_examdb`.`person` (`id`, `name`,`user_name`, `password`, `email`) VALUES ('1', 'Gipsz Jakab', 'gipszjakab1', '1234', 'gipszjakab@jakab.hu');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('2', 'Minta Márton', 'mintamarton2', '4321', 'mintamarton@gmail.com');

INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`) VALUES ('1', 'path', '1');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`) VALUES ('2', 'path 2', '2');

INSERT INTO `evo_examdb`.`skill` (`id`, `name`) VALUES ('1', 'JavaEE');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`) VALUES ('2', 'JPA');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`) VALUES ('3', 'MYSQL');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`) VALUES ('4', 'REST');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('1', '1', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('2', '2', '1', '2');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('3', '3', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('4', '4', '1', '1');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('5', '1', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('6', '2', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('7', '3', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('8', '4', '2', '3');

INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('1', 'BSC');
INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('2', 'MSC');

INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('1', '2015.06.05', '1', '1');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('2', '2018.01.01', '2', '2');

INSERT INTO `evo_examdb`.`status` (`id`, `date`, `description`) VALUES ('1', '2019.03.21', 'accepted');
INSERT INTO `evo_examdb`.`status` (`id`, `date`, `description`) VALUES ('2', '2017.12.30', 'rejected');

INSERT INTO `evo_examdb`.`hiring` (`id`) VALUES ('1');
INSERT INTO `evo_examdb`.`hiring` (`id`) VALUES ('2');

INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `status_id`, `hiring_id`) VALUES ('1', '1', '2', '1');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `status_id`, `hiring_id`) VALUES ('1', '2', '1', '2');