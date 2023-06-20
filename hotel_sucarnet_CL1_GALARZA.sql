-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 20-06-2023 a las 04:41:10
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `hotel_sucarnet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE IF NOT EXISTS `habitacion` (
  `CodigoHabitacion` int(11) NOT NULL,
  `CodigoHotel` varchar(255) DEFAULT NULL,
  `Tipo` varchar(255) DEFAULT NULL,
  `Precio` double DEFAULT NULL,
  PRIMARY KEY (`CodigoHabitacion`),
  KEY `CodigoHotel` (`CodigoHotel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`CodigoHabitacion`, `CodigoHotel`, `Tipo`, `Precio`) VALUES
(100, 'H001', 'Individual', 100),
(101, 'H001', 'Doble', 150),
(102, 'H002', 'Suite', 250);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE IF NOT EXISTS `hotel` (
  `CodigoHotel` varchar(255) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `SitioWeb` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CodigoHotel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hotel`
--

INSERT INTO `hotel` (`CodigoHotel`, `Nombre`, `Direccion`, `SitioWeb`) VALUES
('H001', 'Hotel A', 'Calle Principal 123', 'www.hotela.com'),
('H002', 'Hotel B', 'Avenida Central 456', 'www.hotelb.com'),
('H003', 'Hotel C', 'Plaza Mayor 789', 'www.hotelc.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE IF NOT EXISTS `huesped` (
  `CodigoHuesped` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CodigoHuesped`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`CodigoHuesped`, `Nombre`, `Email`, `Direccion`, `Telefono`) VALUES
(1, 'Juan Pérez', 'juan@example.com', 'Calle Principal 123', '1234567890'),
(2, 'María López', 'maria@example.com', 'Avenida Central 456', '9876543210'),
(3, 'Carlos Gómez', 'carlos@example.com', 'Plaza Mayor 789', '4567890123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservacion`
--

CREATE TABLE IF NOT EXISTS `reservacion` (
  `CodigoReserva` int(11) NOT NULL,
  `CodigoHotel` varchar(255) DEFAULT NULL,
  `CodigoHuesped` int(11) DEFAULT NULL,
  `CodigoHabitacion` int(11) DEFAULT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  PRIMARY KEY (`CodigoReserva`),
  KEY `CodigoHotel` (`CodigoHotel`),
  KEY `CodigoHuesped` (`CodigoHuesped`),
  KEY `CodigoHabitacion` (`CodigoHabitacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`CodigoHotel`) REFERENCES `hotel` (`CodigoHotel`);

--
-- Filtros para la tabla `reservacion`
--
ALTER TABLE `reservacion`
  ADD CONSTRAINT `reservacion_ibfk_1` FOREIGN KEY (`CodigoHotel`) REFERENCES `hotel` (`CodigoHotel`),
  ADD CONSTRAINT `reservacion_ibfk_2` FOREIGN KEY (`CodigoHuesped`) REFERENCES `huesped` (`CodigoHuesped`),
  ADD CONSTRAINT `reservacion_ibfk_3` FOREIGN KEY (`CodigoHabitacion`) REFERENCES `habitacion` (`CodigoHabitacion`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
