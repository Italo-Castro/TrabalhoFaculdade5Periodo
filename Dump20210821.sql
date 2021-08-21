-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projetoconsultorio
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idMedico` int NOT NULL,
  `idPaciente` int NOT NULL,
  `idReceita` int DEFAULT NULL,
  `relatoPaciente` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idMedico` (`idMedico`),
  KEY `idPaciente` (`idPaciente`),
  KEY `idReceita` (`idReceita`),
  CONSTRAINT `idMedico` FOREIGN KEY (`idMedico`) REFERENCES `medico` (`id`),
  CONSTRAINT `idPaciente` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nomeEmpresa` varchar(50) DEFAULT NULL,
  `telefone1` varchar(20) DEFAULT NULL,
  `telefone2` varchar(20) DEFAULT NULL,
  `rua` varchar(40) DEFAULT NULL,
  `bairro` varchar(40) DEFAULT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `cidade` varchar(30) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'ClinVida','3321 - 4026','98808 - 4026','João Domingos Da Fonseca ','Centro','Sala 02','Formiga',51);
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rua` varchar(50) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `cep` varchar(16) DEFAULT NULL,
  `bairro` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Rua Primeiro de Abril','MG','Formiga','35570-280','Vila Ferreira'),(2,'Rua Presidente Kenedy','MG','Formiga','35570-142','Centro'),(3,'Avenida Guiomar Garcia Neto','MG','Formiga','35570-148','Centro');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itensreceita`
--

DROP TABLE IF EXISTS `itensreceita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itensreceita` (
  `idReceita` int NOT NULL,
  `posicaoItem` int NOT NULL AUTO_INCREMENT,
  `codItem` int NOT NULL,
  `dosagem` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`posicaoItem`),
  KEY `idReceita` (`idReceita`),
  KEY `codItem` (`codItem`),
  CONSTRAINT `idReceita` FOREIGN KEY (`idReceita`) REFERENCES `receita` (`id`),
  CONSTRAINT `itensreceita_ibfk_1` FOREIGN KEY (`codItem`) REFERENCES `medicamento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itensreceita`
--

LOCK TABLES `itensreceita` WRITE;
/*!40000 ALTER TABLE `itensreceita` DISABLE KEYS */;
INSERT INTO `itensreceita` VALUES (23,1,12,'O1 comp. a 2 hrs.'),(23,2,13,'1 ao dia'),(26,3,20,'italo'),(26,4,21,'italo'),(27,5,23,'italo'),(28,6,24,'italo'),(29,7,25,'italo'),(30,8,26,'italo'),(31,9,27,'italo'),(32,10,28,'italo'),(33,11,28,'italo'),(34,12,29,'italo');
/*!40000 ALTER TABLE `itensreceita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicamento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (1,'MEDICAMENTO1'),(2,'MEDICAMENTO2'),(3,'MEDICAMENTO3'),(4,'MEDICAMENTO4'),(5,'MEDICAMENTO5'),(6,'MEDICAMENTO6'),(7,'MEDICAMENTO7'),(8,'MEDICAMENTO8'),(9,'MEDICAMENTO9'),(10,'MEDICAMENTO10'),(11,'MEDICAMENTO11'),(12,'MEDICAMENTO12'),(13,'MEDICAMENTO13'),(14,'MEDICAMENTO14'),(15,'MEDICAMENTO15'),(16,'MEDICAMENTO16'),(17,'MEDICAMENTO17'),(18,'MEDICAMENTO18'),(19,'MEDICAMENTO19'),(20,'MEDICAMENT20'),(21,'MEDICAMENTO21'),(22,'MEDICAMENTO22'),(23,'MEDICAMENTO23'),(24,' DIPIRONA'),(25,'CORONAVAC'),(26,'teste'),(27,'AZTRAZENICA'),(28,'CORONA VAC'),(29,'TESTANDO');
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(25) NOT NULL,
  `dataNascimento` datetime DEFAULT NULL,
  `especializacao` varchar(30) DEFAULT NULL,
  `sexo` varchar(9) DEFAULT NULL,
  `disponibilidade` tinyint DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `crm` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,'ITALO CESAR CASTRO','0321-02-01 00:00:00','TSTE','MASCULINO',0,'138.713.176-16','00113145'),(2,'IGOR GUILHERME CASTRO',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(25) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `idEndereco` int NOT NULL,
  `idPlanoSaude` int DEFAULT NULL,
  `cpf` varchar(16) DEFAULT NULL,
  `telefone` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idEndereco` (`idEndereco`),
  KEY `idPlanoSaude` (`idPlanoSaude`),
  CONSTRAINT `idEndereco` FOREIGN KEY (`idEndereco`) REFERENCES `endereco` (`id`),
  CONSTRAINT `idPlanoSaude` FOREIGN KEY (`idPlanoSaude`) REFERENCES `planosaude` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'ITALO','MASCULINO',1,NULL,'13871317616','(03) 79998 - 0897'),(2,'ITALO CESAR CASTRO','MASCULINO',1,2,'138.713.176-16','(03) 79998 - 0897'),(3,'ITALO CESAR CASTRO','MASCULINO',1,2,'138.713.176-16','(03) 79998 - 0897'),(5,'MARIO JOSE DA SILVA','MASCULINO',3,2,'011.414.111-11','(03) 79998 - 0897');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planosaude`
--

DROP TABLE IF EXISTS `planosaude`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planosaude` (
  `id` int NOT NULL AUTO_INCREMENT,
  `valor` double DEFAULT NULL,
  `dataExpiracao` date NOT NULL,
  `tipo` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planosaude`
--

LOCK TABLES `planosaude` WRITE;
/*!40000 ALTER TABLE `planosaude` DISABLE KEYS */;
INSERT INTO `planosaude` VALUES (2,50,'2014-02-06','PESSOAL'),(3,400,'2021-02-07','EMPRESARIAL');
/*!40000 ALTER TABLE `planosaude` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receita`
--

DROP TABLE IF EXISTS `receita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receita` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataReceita` date DEFAULT NULL,
  `idMedico` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receita`
--

LOCK TABLES `receita` WRITE;
/*!40000 ALTER TABLE `receita` DISABLE KEYS */;
INSERT INTO `receita` VALUES (1,'2021-07-14',NULL),(2,'2021-07-14',NULL),(3,'2021-07-14',NULL),(4,'2021-07-14',NULL),(5,'2021-07-14',NULL),(6,'2021-07-14',NULL),(7,'2021-07-14',NULL),(8,'2021-07-14',NULL),(9,'2021-07-14',NULL),(10,'2021-07-14',NULL),(11,'2021-07-14',NULL),(12,'2021-07-14',NULL),(13,'2021-07-14',NULL),(14,'2021-07-14',NULL),(15,'2021-07-14',NULL),(16,'2021-07-14',NULL),(17,'2021-07-14',NULL),(18,'2021-07-14',NULL),(19,'2021-07-14',NULL),(20,'2021-07-14',NULL),(21,'2021-07-14',NULL),(22,'2021-07-14',NULL),(23,'2021-07-14',1),(24,'2021-07-14',1),(25,'2021-07-24',1),(26,'2021-07-24',1),(27,'2021-08-19',1),(28,'2021-08-20',0),(29,'2021-08-20',0),(30,'2021-08-20',0),(31,'2021-08-20',0),(32,'2021-08-21',1),(33,'2021-08-21',1),(34,'2021-08-21',1);
/*!40000 ALTER TABLE `receita` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-21 16:08:52
