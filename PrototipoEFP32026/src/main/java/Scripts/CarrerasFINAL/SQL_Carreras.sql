/*Britany Mishel Hernandez Davila 9959-24-4178
/**
 * Author:  Mishel
 * Created: 1/06/2026
 */

CREATE TABLE IF NOT EXISTS `carreras` (
  `codigo_carrera` varchar(5)) NOT NULL,
  `nombre_carrera` varchar(45) NOT NULL,
  `codigo_facultad` varchar(5) NOT NULL,
  `estatus_carrera` varchar(1) NOT NULL,
  PRIMARY KEY (`codigo_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
