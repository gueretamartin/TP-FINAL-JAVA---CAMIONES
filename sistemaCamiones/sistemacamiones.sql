# SQL Manager 2005 Lite for MySQL 3.7.0.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : sistemacamiones


SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `sistemacamiones`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

#
# Structure for the `camion` table : 
#

CREATE TABLE `camion` (
  `patenteLetra` varchar(3) NOT NULL,
  `patenteNumero` int(3) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`patenteLetra`,`patenteNumero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `ciudad` table : 
#

CREATE TABLE `ciudad` (
  `codPostal` int(4) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `provincia` varchar(25) NOT NULL,
  PRIMARY KEY (`codPostal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `demora` table : 
#

CREATE TABLE `demora` (
  `demora` time NOT NULL DEFAULT '00:00:00',
  `id` int(1) DEFAULT NULL,
  PRIMARY KEY (`demora`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `personal` table : 
#

CREATE TABLE `personal` (
  `dni` int(8) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `personal` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for the `camion` table  (LIMIT 0,500)
#

INSERT INTO `camion` (`patenteLetra`, `patenteNumero`, `marca`, `modelo`, `descripcion`) VALUES 
  ('IHI',123,'FIAT','UNO','LINDO CAMION');

COMMIT;

#
# Data for the `ciudad` table  (LIMIT 0,500)
#

INSERT INTO `ciudad` (`codPostal`, `nombre`, `provincia`) VALUES 
  (2900,'San Pedro','Buenos Aires');

COMMIT;

#
# Data for the `demora` table  (LIMIT 0,500)
#

INSERT INTO `demora` (`demora`, `id`) VALUES 
  ('06:00:00',1);

COMMIT;

