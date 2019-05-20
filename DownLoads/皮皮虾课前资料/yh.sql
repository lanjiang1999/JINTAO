/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - yhmisdb
*********************************************************************
*/ 

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yhmisdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yhmisdb`;

/*Table structure for table `tb_dept` */

DROP TABLE IF EXISTS `tb_dept`;

CREATE TABLE `tb_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tb_dept` */

insert  into `tb_dept`(`id`,`name`,`parent_id`,`sort`,`note`,`created`,`updated`) values (1,'集团',0,1,'集团总部','2018-10-02 09:15:14','2018-09-27 16:35:54'),(2,'财务部',1,2,'财务管理','2018-09-27 16:35:52','2018-09-27 16:34:15'),(3,'软件部',1,3,'开发软件、运维','2018-09-27 16:35:54','2018-09-27 16:34:51');

/*Table structure for table `tb_door` */

DROP TABLE IF EXISTS `tb_door`;

CREATE TABLE `tb_door` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_door` */

insert  into `tb_door`(`id`,`name`,`tel`,`created`,`updated`) values (1,'永和大王（北三环西路店）','110-62112313',NULL,NULL),(2,'永和大王（北京南站店）','007-62112323',NULL,NULL);

/*Table structure for table `tb_order` */

DROP TABLE IF EXISTS `tb_order`;

CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `door_id` int(11) DEFAULT NULL,
  `order_no` varchar(7) DEFAULT NULL,
  `order_type` varchar(50) DEFAULT NULL,
  `person_num` tinyint(4) DEFAULT NULL,
  `cashier` varchar(30) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `payment_type` varchar(30) DEFAULT NULL,
  `price` double(8,2) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_2` (`door_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`door_id`) REFERENCES `tb_door` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_order` */

insert  into `tb_order`(`id`,`door_id`,`order_no`,`order_type`,`person_num`,`cashier`,`create_time`,`end_time`,`payment_type`,`price`,`created`,`updated`) values (1,1,'P000011','堂食',1,'张静','2018-04-26 14:49:07','2018-04-17 07:24:38','微支付',8.00,NULL,NULL),(2,2,'P000001','堂食',4,'王强','2018-04-24 16:05:00','2018-04-24 16:05:00','支付宝',18.00,NULL,NULL);

/*Table structure for table `tb_order_detail` */

DROP TABLE IF EXISTS `tb_order_detail`;

CREATE TABLE `tb_order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `item` varchar(30) DEFAULT NULL,
  `price` double(8,2) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `tb_order_detail` */

insert  into `tb_order_detail`(`id`,`order_id`,`num`,`item`,`price`,`created`,`updated`) values (1,1,1,'玉米肉松蛋饼2P<br/>1X --玉米肉松蛋饼<br/>1',8.00,NULL,NULL),(2,1,1,'爆有料三谷饭团套餐<br/>1X --爆有料三谷饭团 1X ',10.00,NULL,NULL),(3,2,4,'玉米肉松蛋饼2P<br/>1 X --玉米肉松蛋饼<br/>',32.00,NULL,NULL),(8,7,1,'葱油饼豆浆套餐',2.00,NULL,NULL),(9,7,10,'饺子套餐',20.00,NULL,NULL);

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(11) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `valid` tinyint(4) DEFAULT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`dept_id`,`username`,`password`,`salt`,`email`,`mobile`,`valid`,`created`,`updated`) values (1,1,'陈集团','123456',NULL,'tony@sina.com','13572801415',1,'2018-09-30 09:32:18','2018-09-30 09:32:18'),(2,3,'牛软件','567890',NULL,'niu@sina.com','13208737172',0,'2018-10-02 09:23:19','2018-09-20 09:32:18');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
