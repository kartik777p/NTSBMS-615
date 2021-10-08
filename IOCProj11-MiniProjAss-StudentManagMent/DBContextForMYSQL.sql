CREATE TABLE `ntspms615`.`realtimedi_spring_student` (
  `sno` INT NOT NULL AUTO_INCREMENT,
  `sname` VARCHAR(25) NULL,
  `addrs` VARCHAR(25) NULL,
  `total` FLOAT NULL,
  `avg` FLOAT NULL,
  `result` VARCHAR(25) NULL,
  PRIMARY KEY (`sno`),
  UNIQUE INDEX `sno_UNIQUE` (`sno` ASC) VISIBLE);
