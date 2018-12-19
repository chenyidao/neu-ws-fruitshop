/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.5.59 : Database - order
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `order`;

/*Table structure for table `orderitems` */

DROP TABLE IF EXISTS `orderitems`;

CREATE TABLE `orderitems` (
  `orderItemID` varchar(20) NOT NULL,
  `orderItemQuantity` int(11) NOT NULL DEFAULT '0',
  `orderID` varchar(20) NOT NULL,
  `fruitID` varchar(11) NOT NULL,
  PRIMARY KEY (`orderID`),
  CONSTRAINT `orderitems_ibfk_1` FOREIGN KEY (`orderID`) REFERENCES `orders` (`orderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderitems` */

insert  into `orderitems`(`orderItemID`,`orderItemQuantity`,`orderID`,`fruitID`) values 
('201812050925585101',1,'20181205092558510','100001'),
('201812050928342301',1,'20181205092834230','100001'),
('201812051035228221',1,'20181205103522822','100002'),
('201812070347129231',2,'20181207034712923','100000'),
('201812090239069431',2,'20181209023906943','100007');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orderID` varchar(17) NOT NULL,
  `userID` varchar(10) NOT NULL,
  `orderTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `orderDeliveryTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `orderDeliveryAddress` varchar(30) NOT NULL,
  `orderDeliveryName` varchar(10) NOT NULL,
  `orderDeliveryPhoneNumber` varchar(20) NOT NULL,
  `orderMoney` float NOT NULL,
  `orderPayState` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`orderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`orderID`,`userID`,`orderTime`,`orderDeliveryTime`,`orderDeliveryAddress`,`orderDeliveryName`,`orderDeliveryPhoneNumber`,`orderMoney`,`orderPayState`) values 
('20181205092558510','20165277','2018-12-05 09:25:58','2018-02-24 14:00:00','昆明','赵煜','18640378235',22,0),
('20181205092834230','20165277','2018-12-05 09:28:34','2018-02-24 14:00:00','昆明','赵煜','18640378235',22,0),
('20181205103522822','20165277','2018-12-05 10:35:22','2018-02-24 14:00:00','昆明','赵煜','18640378235',24,0),
('20181207034712923','20165277','2018-12-07 03:47:12','2018-02-24 14:00:00','昆明','赵煜','18640378235',14,0),
('20181209023906943','20165277','2018-12-09 02:39:06','2018-02-24 14:00:00','昆明','赵煜','18640378235',84,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
