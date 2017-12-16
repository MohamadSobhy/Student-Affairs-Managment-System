-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: college
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `Username` varchar(40) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Username`,`Password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('Admin','1234'),('Admin','12345'),('Ahmed','1234'),('Alaa','1234'),('Mohamad','sobhy');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courses` (
  `Course_code` varchar(20) NOT NULL,
  `Course_name` varchar(50) NOT NULL,
  `C_year` varchar(30) NOT NULL,
  PRIMARY KEY (`Course_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES ('AI','Artificial Intelligence','          Third Year'),('algodesign','Analysis & Design of Algorithms','          Third Year'),('assembly','Assembly Language','          Third Year'),('busorg','Business Organization','          First Year'),('comgraph','Computer Graphics','          Third Year'),('comnetwork','Computer Networks','         Fourth Year'),('comoragn','Computer Arch.& Organization','          Third Year'),('compiler','Compiler Theory','         Fourth Year'),('compling','Computational Linguistics','          First Year'),('computheo','Theory of Computation','         Fourth Year'),('datast','Data Structures','         Second Year'),('DBmanag','Database Management Systems','          Third Year'),('discomp','Distributed Computing','         Fourth Year'),('elect','Electronics','          First Year'),('eng1','English Language 1','          First Year'),('eng2','English Language 2','          First Year'),('ethics','Professional Ethics & Legal Aspects','         Second Year'),('filorg','File Organization','         Second Year'),('formlang','Formal language & Automata','          Third Year'),('human','Humanities','          FirstYear'),('imgproc','Image Processing','         Fourth Year'),('introtocomp','Introduction to Computers','          First Year'),('introtoIS','Introduction to Information Systems','         Second Year'),('introtoprog','Fundamental of Structured Prog','          First Year'),('logde','Logic Design','         Second Year'),('logprog','Logic Programming','          Third Year'),('math1','Mathematics 1','          First Year'),('math2','Mathematics 2','          First Year'),('math3','Mathematics 3','         Second Year'),('math4','Mathematics 4','         Second Year'),('modsimu','Modeling & Simulation','         Fourth Year'),('neunetwork','Neural Networks','         Fourth Year'),('numcommeth','Numerical Computing Methods','          Third Year'),('oop','Object Oriented Programming','         Second Year'),('opesearch','Operation Research','         Second Year'),('OS','Operating Systems','          Third Year'),('Phys1','Physics 1','          First Year'),('Phys2','Physics 2','          First Year'),('project','Project','         Fourth Year'),('project2','Project 2','         Fourth Year'),('sciwrit','Scientific Writting ','         Second Year'),('securmeth','Computer Security Methods','         Fourth Year'),('selectopi','Selected Topics 1','         Fourth Year'),('selectopi2','Selected Topics 2','         Fourth Year'),('softeng','Software Engineering','          Third Year'),('stanaltion','Statistical Analysis & Application','         Second Year'),('stat','Probability and Statistics','         Second Year'),('sysanades','System Analysis & Design','          Third Year');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `Doctor_ID` int(11) NOT NULL,
  `Fname` varchar(20) NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `Address` varchar(80) NOT NULL,
  `E_Mail` varchar(50) NOT NULL,
  `Phone_Num` int(11) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Birth_Date` varchar(12) NOT NULL,
  `SSN` varchar(15) NOT NULL,
  PRIMARY KEY (`Doctor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'Ahmed','Taha','Mohamad','Benha','Ahmedtaha',1268101214,'male','02/02/1964','48751448512547'),(2,'diaa','ahmed','mohamad','Benha','diaaahmedmohamad',1254785481,'male','05/01/1968','15478562365987'),(3,'Zakaria','Awad','Elnagar','Toukh','zakariaawad',1245785452,'male','02/03/1963','14523654785451'),(4,'Mohamad','Elsayed','Hassan','Toukh','mohamadelsayed',1245785547,'male','03/04/1963','15475445875896'),(5,'Ahmed','Sayed','Mohamad','Qaha','ahmedsayed',1236547859,'male','04/04/1964','12547854698563'),(6,'Mohamad','Ahmed','Ali','cairo','mohamadahmed',1054785965,'male','06/03/1964','12543245189563');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relation`
--

DROP TABLE IF EXISTS `relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relation` (
  `Stu_ID` int(11) NOT NULL,
  `Doc_ID` int(11) NOT NULL,
  `Cor_code` varchar(20) NOT NULL,
  `Degree` int(11) NOT NULL,
  KEY `Course_code_idx` (`Cor_code`),
  KEY `Stu_ID_idx` (`Stu_ID`),
  KEY `Doc_ID_idx` (`Doc_ID`),
  CONSTRAINT `Course_code` FOREIGN KEY (`Cor_code`) REFERENCES `courses` (`Course_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Doc_ID` FOREIGN KEY (`Doc_ID`) REFERENCES `doctor` (`Doctor_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Stu_ID` FOREIGN KEY (`Stu_ID`) REFERENCES `student` (`Student_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relation`
--

LOCK TABLES `relation` WRITE;
/*!40000 ALTER TABLE `relation` DISABLE KEYS */;
INSERT INTO `relation` VALUES (5,1,'datast',0),(2,1,'datast',100),(1,2,'math1',100),(6,3,'elect',90),(5,2,'introtoIS',90),(1,1,'datast',100),(4,2,'math2',90),(2,1,'logde',90);
/*!40000 ALTER TABLE `relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `Student_ID` int(11) NOT NULL,
  `Fname` varchar(20) NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `Address` varchar(80) NOT NULL,
  `E_Mail` varchar(50) NOT NULL,
  `Phone_Num` int(15) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Birth_Date` varchar(12) NOT NULL,
  `Stu_year` varchar(30) NOT NULL,
  `SSN` varchar(15) NOT NULL,
  PRIMARY KEY (`Student_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Mohamad','Sobhy','Elsayed','toukh','sobhymohamad',1155861582,'male','05/11/1997','Second Year','12354251256325'),(2,'Ahmed','Ali','Mohamad','benha','ahmedali',1236547895,'male','01/03/1993','Second Year','12548759632547'),(3,'Mohamad','Fadel','Mohamad','Qaha','mohamadfadel',1004976804,'male','24/09/1997','Second Year','14257845965874'),(4,'Mohamad','Ebrahim','Gad','Qaluib','mohamadgad',1215478484,'male','07/07/1997','Second Year','14257845965874'),(5,'Mohamad','Said','Hossny','Benha','mohamadsaid',1524758456,'male','18/12/1996','Second Year','14578596547854'),(6,'Ahmed','Ali','Mohamad','cairo','ahmedali',1254125462,'male','04/05/1998','First Year','12542132658745'),(7,'Ahmed','Abdallah','Elsayed','benha','ahmedabdallah',1254562354,'male','04/03/1996','Third Year','12547895476542'),(8,'Ahmed','Abdo','Mohamad','benha','ahmedabdo',1254562354,'male','04/03/1995','Fourth Year','12545478576542'),(9,'Mona','Ahmed','Ali','benha','monaahmed',1245362587,'female','03/05/1996','Third Year','12546325984578'),(10,'Sarah','Mohamad','Yousef','toukh','sarahmohamad',1236587954,'female','05/05/1998','First Year','12525412564578'),(11,'Sayed','Mohamad','Ahmed','cairo','sayedmohamad',1147854795,'female','05/08/1995','Fourth Year','12525362598778'),(5650,'mohamed','ali','gabal','benha','mohamedgabaal',12979857,'male','28/07/1997','Second Year','8923'),(5656,'mohamed','yasser','alsayed','qalyoup','muhammedshehap',1014871215,'male','29/04/1997','Second Year','6456'),(5657,'mohamed','mansor','ali','tokh','mohamedmansor',11036477,'male','25/05/1997','Second Year','8645'),(5659,'mohamed','ebrahim','gad','benha','mohamedgaad',11036477,'male','28/01/1997','Third Year','7821');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-31 15:58:30
