-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bdtypf
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdtypf
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdtypf` DEFAULT CHARACTER SET utf8 ;
USE `bdtypf` ;

-- -----------------------------------------------------
-- Table `bdtypf`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtypf`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `tipo_documento` VARCHAR(45) NULL,
  `numero_documento` VARCHAR(10) NULL,
  `nombre` VARCHAR(100) NULL,
  `email` VARCHAR(100) NULL,
  `celular` VARCHAR(15) NULL,
  `contraseña` VARCHAR(255) NULL,
  `rol` VARCHAR(50) NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtypf`.`restaurante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtypf`.`restaurante` (
  `idrestaurante` INT NOT NULL AUTO_INCREMENT,
  `idusuario` INT NULL,
  `nombre_restaurante` VARCHAR(100) NULL,
  `direccion` VARCHAR(100) NULL,
  `departamento` VARCHAR(100) NULL,
  `municipio` VARCHAR(100) NULL,
  `telefono` VARCHAR(10) NULL,
  `celular` VARCHAR(10) NULL,
  `imagen` VARCHAR(255) NULL,
  PRIMARY KEY (`idrestaurante`),
  INDEX `fk_restaurante_usuario_idx` (`idusuario` ASC) VISIBLE,
  CONSTRAINT `fk_restaurante_usuario`
    FOREIGN KEY (`idusuario`)
    REFERENCES `bdtypf`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtypf`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtypf`.`categoria` (
  `idcategoria` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(255) NULL,
  PRIMARY KEY (`idcategoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtypf`.`platillo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtypf`.`platillo` (
  `idplatillo` INT NOT NULL AUTO_INCREMENT,
  `idrestaurante` INT NULL,
  `idcategoria` INT NULL,
  `nombre_platillo` VARCHAR(100) NULL,
  `descripcion` VARCHAR(255) NULL,
  `valor` DOUBLE NULL,
  `imagen` VARCHAR(255) NULL,
  PRIMARY KEY (`idplatillo`),
  INDEX `fk_platillo_restaurante1_idx` (`idrestaurante` ASC) VISIBLE,
  INDEX `fk_platillo_categoria1_idx` (`idcategoria` ASC) VISIBLE,
  CONSTRAINT `fk_platillo_restaurante1`
    FOREIGN KEY (`idrestaurante`)
    REFERENCES `bdtypf`.`restaurante` (`idrestaurante`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_platillo_categoria1`
    FOREIGN KEY (`idcategoria`)
    REFERENCES `bdtypf`.`categoria` (`idcategoria`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdtypf`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdtypf`.`pedido` (
  `idpedido` INT NOT NULL AUTO_INCREMENT,
  `idusuario` INT NULL,
  `idplatillo` INT NULL,
  `cantidad` TINYINT(4) NULL,
  `valor_total` DECIMAL(10,2) NULL,
  `fecha` DATETIME NULL,
  `tipo_entrega` VARCHAR(20) NULL,
  `direccion` VARCHAR(100) NULL,
  `estado` VARCHAR(100) NULL,
  PRIMARY KEY (`idpedido`),
  INDEX `fk_pedido_usuario1_idx` (`idusuario` ASC) VISIBLE,
  INDEX `fk_pedido_platillo1_idx` (`idplatillo` ASC) VISIBLE,
  CONSTRAINT `fk_pedido_usuario1`
    FOREIGN KEY (`idusuario`)
    REFERENCES `bdtypf`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_platillo1`
    FOREIGN KEY (`idplatillo`)
    REFERENCES `bdtypf`.`platillo` (`idplatillo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
