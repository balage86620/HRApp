INSERT INTO `evo_examdb`.`person` (`id`, `name`,`user_name`, `password`, `email`) VALUES ('1', 'Gipsz Jakab', 'gipszjakab1', '1234', 'gipszjakab@jakab.hu');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('2', 'Minta Márton', 'mintamarton2', '4321', 'mintamarton@gmail.com');
INSERT INTO `evo_examdb`.`person` (`id`, `name`,`user_name`, `password`, `email`) VALUES ('3', 'Jónás Borka', 'Burnournswes', 'Ohnou9za7tie', 'JonasBorka@teleworm.us');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('4', 'Madarász Karola', 'Satch1977', 'Gohw5Ac7Oo', 'MadaraszKarola@rhyta.com');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('5', 'Majer Zsuzsanna', 'Maddeauttle47', 'BiaPhee7iok', 'MajerZsuzsi@teleworm.us');
INSERT INTO `evo_examdb`.`person` (`id`, `name`,`user_name`, `password`, `email`) VALUES ('6', 'Vörös Bianka', 'Froplithe', 'Eeph5ciep', 'VorosBianka@armyspy.com');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('7', 'Balogh Melinda', 'Pueed1952', 'Uith3ieque', 'BaloghMelinda@jourrapide.com');
INSERT INTO `evo_examdb`.`person` (`id`, `name`,`user_name`, `password`, `email`) VALUES ('8', 'Puskás László', 'Taight', 'fek0ahQu', 'PuskasLaszlo@teleworm.us');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('9', 'Váradi Jázmin', 'Forebole', 'UWahghohhi8', 'VaradiJazmin@dayrep.com');
INSERT INTO `evo_examdb`.`person` (`id`, `name`, `user_name`, `password`, `email`) VALUES ('10', 'Kállay László', 'Thativess51', 'maekajone1U', 'KallayLaszlo@rhyta.com');


INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('1', 'path', '1', 'HU', '2018-01-03');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('2', 'path', '2', 'EN', '2018-02-12');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('3', 'path', '3', 'HU', '2018-09-06');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('4', 'path', '4', 'EN', '2018-09-27');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('5', 'path', '5', 'HU', '2018-10-02');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('6', 'path', '6', 'EN', '2018-12-03');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('7', 'path', '7', 'HU', '2018-12-27');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('8', 'path', '8', 'EN', '2019-01-03');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('9', 'path', '9', 'HU', '2019-01-14');
INSERT INTO `evo_examdb`.`cv` (`id`, `path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('10', 'path', '10', 'EN', '2019-03-15');

INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('1', 'JavaEE', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type` ) VALUES ('2', 'JPA', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('3', 'MYSQL', 'Database');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('4', 'REST', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('5', 'JavaSE', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('6', 'Python', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type` ) VALUES ('7', '.NET', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('8', 'C#', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('9', 'Ruby', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('10', 'Android', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('11', 'HTML', 'Web');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type` ) VALUES ('12', 'CSS', 'Web');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('13', 'JavaScript', 'Web');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('14', 'XML', 'Web');
INSERT INTO `evo_examdb`.`skill` (`id`, `name`, `type`) VALUES ('15', 'WildFly', 'DevOps');

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

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('11', '6', '3', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('12', '4', '3', '2');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('13', '3', '3', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('14', '9', '3', '1');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('15', '5', '3', '2');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('16', '11', '4', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('17', '12', '4', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('18', '13', '4', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('19', '14', '4', '2');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('20', '5', '4', '1');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('21', '1', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('22', '2', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('23', '3', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('24', '4', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('25', '5', '5', '3');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('26', '6', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('27', '7', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('28', '8', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('29', '9', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('30', '10', '6', '3');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('31', '11', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('32', '12', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('33', '13', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('34', '14', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('35', '15', '7', '3');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('36', '1', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('37', '2', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('38', '3', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('39', '4', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('40', '5', '8', '3');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('41', '6', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('42', '7', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('43', '8', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('44', '9', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('45', '10', '9', '3');

INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('46', '11', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('47', '12', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('48', '13', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('49', '14', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`id`, `skill_id`, `person_id`, `skill_level`) VALUES ('50', '15', '10', '3');

INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('1', 'Associate');
INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('2', 'Bachelor');
INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('3', 'Master');
INSERT INTO `evo_examdb`.`degree` (`id`, `name`) VALUES ('4', 'Doctor');

INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('1', '2018-02-02', '1', '1');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('2', '2018-07-23', '2', '2');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('3', '2018-12-26', '3', '3');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('4', '2018-10-05', '4', '4');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('5', '2018-10-16', '1', '5');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('6', '2018-11-01', '2', '6');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('7', '2018-10-18', '3', '7');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('8', '2019-01-09', '4', '8');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('9', '2019-02-05', '1', '9');
INSERT INTO `evo_examdb`.`degree2person` (`id`, `date_of_issue`, `degree_id`, `person_id`) VALUES ('10', '2019-03-04', '2', '10');

INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('1', 'Junior Java Fejlesztő', 'leírás', 'Budapest', '200000-400000 HUF', '1');
INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('2', 'Senior JavaEE Developer', 'description', 'Berlin', '3000-6000 EUR', '2');
INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('3', 'Frontend fejlesztő', 'leírás', 'Budaörs', '300000 HUF', '3');
INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('4', 'Senior ASP.NET Developer', 'description', 'Stockholm', '5000-10000 EUR', '4');
INSERT INTO `evo_examdb`.`hiring` (`id`, `job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('5', 'Senior C# Fejlesztő', 'leírás', 'Szeged', '500000-1000000 HUF', '5');

INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('1', '1', '3', '2');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('2', '1', '5', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('3', '1', '1', '1');

INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('4', '2', '1', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('5', '2', '2', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('6', '2', '4', '3');

INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('7', '3', '11', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('8', '3', '12', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('9', '3', '13', '3');

INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('10', '4', '7', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('11', '4', '8', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('12', '4', '3', '3');

INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('13', '5', '4', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('14', '5', '8', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`id`, `hiring_id`, `skill_id`, `skill_level`) VALUES ('15', '5', '3', '3');



INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('1', '1', '1');
INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('2', '2', '3');
INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('3', '3', '1');
INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('4', '4', '3');
INSERT INTO `evo_examdb`.`degree2hiring` (`id`, `hiring_id`, `degree_id`) VALUES ('5', '5', '4');



INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('1', '1', '1', '2018-04-13', 'Open', '2018-07-03');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('2', '2', '1', '2018-05-14', 'Closed', '2018-07-27');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('3', '3', '2', '2018-09-13', 'Open', '2018-10-03');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('4', '4', '2', '2018-12-28', 'Closed', '2019-03-25');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('5', '5', '3', '2018-10-12', 'Open', '2018-12-07');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('6', '6', '3', '2018-12-14', 'Closed', '2019-01-27');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('7', '7', '4', '2018-04-13', 'Open', '2018-07-03');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('8', '8', '4', '2018-05-14', 'Closed', '2018-07-27');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('9', '9', '5', '2018-04-13', 'Open', '2018-07-03');
INSERT INTO `evo_examdb`.`application` (`id`, `person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('10', '10', '5', '2018-10-22', 'Closed', '2018-10-30');

INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('1', '2018-01-15', 'leírás', '1');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('2', '2018-02-02', 'leírás', '2');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('3', '2018-02-14', 'leírás', '3');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('4', '2018-05-02', 'leírás', '4');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('5', '2018-05-15', 'leírás', '5');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('6', '2018-06-25', 'leírás', '6');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('7', '2018-09-19', 'leírás', '7');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('8', '2018-12-06', 'leírás', '8');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('9', '2019-03-06', 'leírás', '9');
INSERT INTO `evo_examdb`.`interview` (`id`, `date`, `description`, `application_id`) VALUES ('10', '2019-03-20', 'leírás', '10');
