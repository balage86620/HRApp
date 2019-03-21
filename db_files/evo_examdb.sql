CREATE SCHEMA IF NOT EXISTS `evo_examdb` DEFAULT CHARACTER SET utf8 ;
USE `evo_examdb` ;

-- -----------------------------------------------------
-- Table `evo_examdb`.`hiring`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`hiring` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `evo_examdb`.`status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evo_examdb`.`status` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `date` DATE NULL DEFAULT NULL,
  `description` VARCHAR(200) NULL DEFAULT NULL,
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
  `status_id` INT(11) NOT NULL,
  `person_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `hiring_id`, `status_id`, `person_id`),
  INDEX `fk_application_hiring1_idx` (`hiring_id` ASC),
  INDEX `fk_application_status1_idx` (`status_id` ASC),
  INDEX `fk_application_person1_idx` (`person_id` ASC),
  CONSTRAINT `fk_application_hiring1`
    FOREIGN KEY (`hiring_id`)
    REFERENCES `evo_examdb`.`hiring` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_application_status1`
    FOREIGN KEY (`status_id`)
    REFERENCES `evo_examdb`.`status` (`id`)
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
  `path_to_file` VARCHAR(45) NULL DEFAULT NULL,
  `person_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `person_id`),
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
  PRIMARY KEY (`id`, `degree_id`, `person_id`),
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
  PRIMARY KEY (`id`, `skill_id`, `person_id`),
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