CREATE SCHEMA IF NOT EXISTS `evo_examdb` DEFAULT CHARACTER SET utf8 ;
USE `evo_examdb` ;

-- -----------------------------------------------------
-- Table `evo_examdb`.`hiring`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`hiring` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `job_name` VARCHAR(45) NULL,
  `job_description` VARCHAR(2000) NULL,
  `job_location` VARCHAR(45) NULL,
  `salary_category` VARCHAR(500) NULL,
  `job_id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`person` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `user_name` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`application`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`application` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `hiring_id` INT(11) NOT NULL,
  `person_id` INT(11) NOT NULL,
  `date_of_application` DATE NULL,
  `status` VARCHAR(45) NULL,
  `modification_date` DATE NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_application_hiring1_idx` (`hiring_id` ASC),
  INDEX `fk_application_person1_idx` (`person_id` ASC),
  CONSTRAINT `fk_application_hiring1`
    FOREIGN KEY (`hiring_id`)
    REFERENCES `evo_examdb`.`hiring` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_application_person1`
    FOREIGN KEY (`person_id`)
    REFERENCES `evo_examdb`.`person` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`cv`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`cv` (
  `id` INT(11) NOT NULL,
  `path_to_file` VARCHAR(45) NOT NULL,
  `person_id` INT(11) NOT NULL,
  `language` VARCHAR(2) NOT NULL,
  `upload_date` DATE NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cv_person1_idx` (`person_id` ASC),
  CONSTRAINT `fk_cv_person1`
    FOREIGN KEY (`person_id`)
    REFERENCES `evo_examdb`.`person` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`degree`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`degree` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`degree2person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`degree2person` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `date_of_issue` DATE NULL DEFAULT NULL,
  `degree_id` INT(11) NOT NULL,
  `person_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_degree2person_degree_idx` (`degree_id` ASC),
  INDEX `fk_degree2person_person1_idx` (`person_id` ASC),
  CONSTRAINT `fk_degree2person_degree`
    FOREIGN KEY (`degree_id`)
    REFERENCES `evo_examdb`.`degree` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_degree2person_person1`
    FOREIGN KEY (`person_id`)
    REFERENCES `evo_examdb`.`person` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`skill`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`skill` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `type` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`skill2person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`skill2person` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `skill_id` INT(11) NOT NULL,
  `person_id` INT(11) NOT NULL,
  `skill_level` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skill2person_skill1_idx` (`skill_id` ASC),
  INDEX `fk_skill2person_person1_idx` (`person_id` ASC),
  CONSTRAINT `fk_skill2person_person1`
    FOREIGN KEY (`person_id`)
    REFERENCES `evo_examdb`.`person` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_skill2person_skill1`
    FOREIGN KEY (`skill_id`)
    REFERENCES `evo_examdb`.`skill` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`interview`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`interview` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `date` DATE NULL DEFAULT NULL,
  `description` VARCHAR(4000) NULL DEFAULT NULL,
  `application_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_interview_application1_idx` (`application_id` ASC),
  CONSTRAINT `fk_interview_application1`
    FOREIGN KEY (`application_id`)
    REFERENCES `evo_examdb`.`application` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`skill2hiring`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`skill2hiring` (
  `hiring_id` INT(11) NOT NULL,
  `skill_id` INT(11) NOT NULL,
  `id` INT NOT NULL AUTO_INCREMENT,
  `skill_level` INT(11) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_hiring_has_skill_skill1_idx` (`skill_id` ASC),
  INDEX `fk_hiring_has_skill_hiring1_idx` (`hiring_id` ASC),
  CONSTRAINT `fk_hiring_has_skill_hiring1`
    FOREIGN KEY (`hiring_id`)
    REFERENCES `evo_examdb`.`hiring` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hiring_has_skill_skill1`
    FOREIGN KEY (`skill_id`)
    REFERENCES `evo_examdb`.`skill` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`degree2hiring`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`degree2hiring` (
  `hiring_id` INT(11) NOT NULL,
  `degree_id` INT(11) NOT NULL,
  `id` INT NOT NULL,
  INDEX `fk_hiring_has_degree_degree1_idx` (`degree_id` ASC),
  INDEX `fk_hiring_has_degree_hiring1_idx` (`hiring_id` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_hiring_has_degree_hiring1`
    FOREIGN KEY (`hiring_id`)
    REFERENCES `evo_examdb`.`hiring` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hiring_has_degree_degree1`
    FOREIGN KEY (`degree_id`)
    REFERENCES `evo_examdb`.`degree` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
