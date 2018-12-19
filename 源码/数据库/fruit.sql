/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.5.59 : Database - fruit
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fruit` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fruit`;

/*Table structure for table `fruits` */

DROP TABLE IF EXISTS `fruits`;

CREATE TABLE `fruits` (
  `fruitID` varchar(6) NOT NULL,
  `fruitName` varchar(20) NOT NULL,
  `fruitPrice` float NOT NULL,
  `fruitReserve` int(5) DEFAULT '0',
  `fruitPurchasePrice` float DEFAULT NULL,
  `fruitDescription` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`fruitID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fruits` */

insert  into `fruits`(`fruitID`,`fruitName`,`fruitPrice`,`fruitReserve`,`fruitPurchasePrice`,`fruitDescription`) values 
('100000','百香果',7,14,4,'200g*1份 富含维生素'),
('100001','大草莓',22,26,18,'345g*1份 15-28颗每盒'),
('100002','大樱桃',24,3,18,'250g*1份 鲜嫩多汁'),
('100003','红柚',17,12,12,'2个*1份 圆润饱满'),
('100004','火龙果',15,15,10,'2个*1份 富含花青素'),
('100005','金桔',10,19,7,'500g*1份 15g以上/个'),
('100006','橘子',16,7,13,'1kg*1份 140g以上/个'),
('100007','猕猴桃',26,8,22,'10个*1份 冷藏保存'),
('100008','牛油果',14,6,11,'2个*1份 130g以上/个'),
('100009','苹果',16,15,13,'4个*1份 200g以上/个'),
('100010','青芒',20,20,15,'4个*1份 200g以上/个'),
('100011','蛇果',17,17,13,'4个*1份 约190g/个');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
