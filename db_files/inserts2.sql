INSERT INTO `evo_examdb`.`person` (`name`,`user_name`, `password`, `email`) VALUES ('Gipsz Jakab', 'gipszjakab1', '1234', 'gipszjakab@jakab.hu');
INSERT INTO `evo_examdb`.`person` (`name`, `user_name`, `password`, `email`) VALUES ('Minta Márton', 'mintamarton2', '4321', 'mintamarton@gmail.com');
INSERT INTO `evo_examdb`.`person` (`name`,`user_name`, `password`, `email`) VALUES ('Jónás Borka', 'Burnournswes', 'Ohnou9za7tie', 'JonasBorka@teleworm.us');
INSERT INTO `evo_examdb`.`person` (`name`, `user_name`, `password`, `email`) VALUES ('Madarász Karola', 'Satch1977', 'Gohw5Ac7Oo', 'MadaraszKarola@rhyta.com');
INSERT INTO `evo_examdb`.`person` (`name`, `user_name`, `password`, `email`) VALUES ('Majer Zsuzsanna', 'Maddeauttle47', 'BiaPhee7iok', 'MajerZsuzsi@teleworm.us');
INSERT INTO `evo_examdb`.`person` (`name`,`user_name`, `password`, `email`) VALUES ('Vörös Bianka', 'Froplithe', 'Eeph5ciep', 'VorosBianka@armyspy.com');
INSERT INTO `evo_examdb`.`person` (`name`, `user_name`, `password`, `email`) VALUES ('Balogh Melinda', 'Pueed1952', 'Uith3ieque', 'BaloghMelinda@jourrapide.com');
INSERT INTO `evo_examdb`.`person` (`name`,`user_name`, `password`, `email`) VALUES ('Puskás László', 'Taight', 'fek0ahQu', 'PuskasLaszlo@teleworm.us');
INSERT INTO `evo_examdb`.`person` (`name`, `user_name`, `password`, `email`) VALUES ('Váradi Jázmin', 'Forebole', 'UWahghohhi8', 'VaradiJazmin@dayrep.com');
INSERT INTO `evo_examdb`.`person` (`name`, `user_name`, `password`, `email`) VALUES ('Kállay László', 'Thativess51', 'maekajone1U', 'KallayLaszlo@rhyta.com');


INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '1', 'HU', '2018-01-03');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '2', 'EN', '2018-02-12');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '3', 'HU', '2018-09-06');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '4', 'EN', '2018-09-27');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '5', 'HU', '2018-10-02');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '6', 'EN', '2018-12-03');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '7', 'HU', '2018-12-27');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '8', 'EN', '2019-01-03');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '9', 'HU', '2019-01-14');
INSERT INTO `evo_examdb`.`cv` (`path_to_file`, `person_id`, `language`, `upload_date`) VALUES ('path', '10', 'EN', '2019-03-15');

INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('JavaEE', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type` ) VALUES ('JPA', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('MYSQL', 'Database');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('REST', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('JavaSE', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('Python', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type` ) VALUES ('.NET', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('C#', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('Ruby', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('Android', 'Programming');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('HTML', 'Web');
INSERT INTO `evo_examdb`.`skill` (`name`, `type` ) VALUES ('CSS', 'Web');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('JavaScript', 'Web');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('XML', 'Web');
INSERT INTO `evo_examdb`.`skill` (`name`, `type`) VALUES ('WildFly', 'DevOps');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('1', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('2', '1', '2');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('3', '1', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('4', '1', '1');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('5', '1', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('1', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('2', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('3', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('4', '2', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('5', '2', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('6', '3', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('4', '3', '2');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('3', '3', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('9', '3', '1');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('5', '3', '2');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('11', '4', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('12', '4', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('13', '4', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('14', '4', '2');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('5', '4', '1');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('1', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('2', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('3', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('4', '5', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('5', '5', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('6', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('7', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('8', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('9', '6', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('10', '6', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('11', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('12', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('13', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('14', '7', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('15', '7', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('1', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('2', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('3', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('4', '8', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('5', '8', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('6', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('7', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('8', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('9', '9', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('10', '9', '3');

INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('11', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('12', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('13', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('14', '10', '3');
INSERT INTO `evo_examdb`.`skill2person` (`skill_id`, `person_id`, `skill_level`) VALUES ('15', '10', '3');

INSERT INTO `evo_examdb`.`degree` (`name`) VALUES ('Associate');
INSERT INTO `evo_examdb`.`degree` (`name`) VALUES ('Bachelor');
INSERT INTO `evo_examdb`.`degree` (`name`) VALUES ('Master');
INSERT INTO `evo_examdb`.`degree` (`name`) VALUES ('Doctor');

INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-02-02', '1', '1');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-07-23', '2', '2');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-12-26', '3', '3');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-10-05', '4', '4');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-10-16', '1', '5');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-11-01', '2', '6');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2018-10-18', '3', '7');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2019-01-09', '4', '8');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2019-02-05', '1', '9');
INSERT INTO `evo_examdb`.`degree2person` (`date_of_issue`, `degree_id`, `person_id`) VALUES ('2019-03-04', '2', '10');

INSERT INTO `evo_examdb`.`hiring` (`job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('Junior Java Fejlesztő', 'leírás', 'Budapest', '200000-400000 HUF', '1');
INSERT INTO `evo_examdb`.`hiring` (`job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('Senior JavaEE Developer', 'description', 'Berlin', '3000-6000 EUR', '2');
INSERT INTO `evo_examdb`.`hiring` (`job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('Frontend fejlesztő', 'leírás', 'Budaörs', '300000 HUF', '3');
INSERT INTO `evo_examdb`.`hiring` (`job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('Senior ASP.NET Developer', 'description', 'Stockholm', '5000-10000 EUR', '4');
INSERT INTO `evo_examdb`.`hiring` (`job_name`, `job_description`, `job_location`, `salary_category`, `job_id`) VALUES ('Senior C# Fejlesztő', 'leírás', 'Szeged', '500000-1000000 HUF', '5');

INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('1', '3', '2');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('1', '5', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('1', '1', '1');

INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('2', '1', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('2', '2', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('2', '4', '3');

INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('3', '11', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('3', '12', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('3', '13', '3');

INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('4', '7', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('4', '8', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('4', '3', '3');

INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('5', '4', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('5', '8', '3');
INSERT INTO `evo_examdb`.`skill2hiring` (`hiring_id`, `skill_id`, `skill_level`) VALUES ('5', '3', '3');



INSERT INTO `evo_examdb`.`degree2hiring` (`hiring_id`, `degree_id`) VALUES ('1', '1');
INSERT INTO `evo_examdb`.`degree2hiring` (`hiring_id`, `degree_id`) VALUES ('2', '3');
INSERT INTO `evo_examdb`.`degree2hiring` (`hiring_id`, `degree_id`) VALUES ('3', '1');
INSERT INTO `evo_examdb`.`degree2hiring` (`hiring_id`, `degree_id`) VALUES ('4', '3');
INSERT INTO `evo_examdb`.`degree2hiring` (`hiring_id`, `degree_id`) VALUES ('5', '4');



INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('1', '1', '2018-04-13', 'Open', '2018-07-03');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('2', '1', '2018-05-14', 'Closed', '2018-07-27');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('3', '2', '2018-09-13', 'Open', '2018-10-03');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('4', '2', '2018-12-28', 'Closed', '2019-03-25');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('5', '3', '2018-10-12', 'Open', '2018-12-07');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('6', '3', '2018-12-14', 'Closed', '2019-01-27');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('7', '4', '2018-04-13', 'Open', '2018-07-03');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('8', '4', '2018-05-14', 'Closed', '2018-07-27');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('9', '5', '2018-04-13', 'Open', '2018-07-03');
INSERT INTO `evo_examdb`.`application` (`person_id`, `hiring_id`, `date_of_application`, `status`, `modification_date`) VALUES ('10', '5', '2018-10-22', 'Closed', '2018-10-30');

INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-01-15', 'leírás', '1');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-02-02', 'leírás', '2');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-02-14', 'leírás', '3');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-05-02', 'leírás', '4');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-05-15', 'leírás', '5');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-06-25', 'leírás', '6');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-09-19', 'leírás', '7');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2018-12-06', 'leírás', '8');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2019-03-06', 'leírás', '9');
INSERT INTO `evo_examdb`.`interview` (`date`, `description`, `application_id`) VALUES ('2019-03-20', 'leírás', '10');
