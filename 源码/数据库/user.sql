/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.5.59 : Database - user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `user`;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `userName` varchar(10) DEFAULT NULL,
  `userID` varchar(10) NOT NULL,
  `userPassword` varchar(16) DEFAULT NULL,
  `userSex` int(1) DEFAULT NULL,
  `userAddress` varchar(30) DEFAULT NULL,
  `userPhoneNumber` varchar(15) DEFAULT NULL,
  `userRole` int(1) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`userName`,`userID`,`userPassword`,`userSex`,`userAddress`,`userPhoneNumber`,`userRole`) values 
('夏夏','20165276','321',1,'沈阳','15772719279',1),
('赵煜','20165277','123',1,'昆明','18640378235',1),
('wqf','20165288','123456789',1,'NEU','18845268956',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
