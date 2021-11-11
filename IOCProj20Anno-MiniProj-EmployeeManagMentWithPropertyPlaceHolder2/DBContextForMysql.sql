CREATE TABLE `neosoft`.`realtimedi_spring_employee` (
  `eno` INT NOT NULL AUTO_INCREMENT,
  `ename` VARCHAR(25) NULL,
  `desg` VARCHAR(25) NULL,
  `basicsalary` FLOAT NULL,
  `grosssalary` FLOAT NULL,
  `netsalary` FLOAT NULL,
  UNIQUE INDEX `eno_UNIQUE` (`eno` ASC));
