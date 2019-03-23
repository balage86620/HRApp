INSERT INTO `evo_examdb`.`person` (`id`, `name`,`user_name`, `password`, `email`) VALUES ('1', 'Gipsz Jakab', 'gipszjakab1', '1234', 'gipszjakab@jakab.hu');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('2', 'Minta Márton', 'mintamarton2', '4321', 'mintamarton@gmail.com');

INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('1', 'path', '1', 'HU', '2018.03.23');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('2', 'path', '2', 'EN', '2018.03.23');

INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('1', 'JavaEE', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type` ) VALUES ('2', 'JPA', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('3', 'MYSQL', 'Database');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('4', 'REST', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('5', 'JavaSE', 'Programming');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('1', '1', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('2', '2', '1', '2');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('3', '3', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('4', '4', '1', '1');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('5', '5', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('6', '1', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('7', '2', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('8', '3', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('9', '4', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('10', '5', '2', '3');

INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('1', 'BSC');
INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('2', 'MSC');

INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('1', '2015.06.05', '1', '1');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('2', '2018.01.01', '2', '2');

INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('1', 'Junior Java Fejlesztő', 'leírás', 'Budapest', '200000-400000 HUF', '1');
INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('2', 'Senior JavaEE Developer', 'description', 'Berlin', '3000-6000 EUR', '2');

INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('1', '1', '3', '2');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('2', '1', '5', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('3', '2', '1', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('4', '2', '2', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('5', '2', '4', '3');

INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('1', '1', '1');
INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('2', '2', '2');

INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('1', '1', '1', '2019.03.23', 'Open', '2019.03.23');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('2', '2', '2', '2019.01.01', 'Closed', '2019.03.23');

INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('1', '2019.03.25', 'Megfelelt!', '1');