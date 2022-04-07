-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: cineman
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `seatcol` varchar(45) DEFAULT NULL,
  `seatrow` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `srid` int DEFAULT NULL,
  `showtime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `srid_idx` (`srid`),
  CONSTRAINT `srid` FOREIGN KEY (`srid`) REFERENCES `showroom` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES (1,'1','1','0',1,'16h30'),(2,'2','1','0',1,'16h30'),(3,'3','1','0',1,'16h30'),(4,'4','1','0',1,'16h30'),(5,'5','1','0',1,'16h30'),(6,'1','2','0',1,'16h30'),(7,'2','2','1',1,'16h30'),(8,'3','2','1',1,'16h30'),(9,'4','2','0',1,'16h30'),(10,'5','2','0',1,'16h30'),(11,'1','3','0',1,'16h30'),(12,'2','3','0',1,'16h30'),(13,'3','3','0',1,'16h30'),(14,'4','3','1',1,'16h30'),(15,'5','3','1',1,'16h30'),(16,'1','4','1',1,'16h30'),(17,'2','4','0',1,'16h30'),(18,'3','4','1',1,'16h30'),(19,'4','4','1',1,'16h30'),(20,'5','4','1',1,'16h30'),(21,'1','5','0',1,'16h30'),(22,'2','5','0',1,'16h30'),(23,'3','5','0',1,'16h30'),(24,'4','5','1',1,'16h30'),(25,'5','5','1',1,'16h30');
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-07 16:32:09
