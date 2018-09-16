/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.5.54 : Database - online_exam_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`online_exam_system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `online_exam_system`;

/*Table structure for table `lesson` */

DROP TABLE IF EXISTS `lesson`;

CREATE TABLE `lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `lesson` */

insert  into `lesson`(`id`,`name`,`createtime`) values (1,'数学','2017-05-16'),(2,'语文','2017-05-16'),(15,'英语','2017-08-05');

/*Table structure for table `manager` */

DROP TABLE IF EXISTS `manager`;

CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `authority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `manager` */

insert  into `manager`(`id`,`name`,`password`,`authority`) values (1,'AA','66','super'),(2,'BB','66','super'),(3,'CC','66','simple'),(4,'DD','66','super'),(12,'EE','66','simple');

/*Table structure for table `questions` */

DROP TABLE IF EXISTS `questions`;

CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `taotiid` int(11) DEFAULT NULL,
  `optiona` varchar(255) DEFAULT NULL,
  `optionb` varchar(255) DEFAULT NULL,
  `optionc` varchar(255) DEFAULT NULL,
  `optiond` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `questions_ibfk_2` (`taotiid`),
  CONSTRAINT `questions_ibfk_2` FOREIGN KEY (`taotiid`) REFERENCES `taoti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

/*Data for the table `questions` */

insert  into `questions`(`id`,`subject`,`type`,`createtime`,`taotiid`,`optiona`,`optionb`,`optionc`,`optiond`,`answer`,`note`) values (12,'语文难不难？','单选','2017-08-05 16:25:26',3,'难','不难','一般般','很简单','A',''),(13,'语文为什么难？','多选','2017-08-05 18:22:51',3,'老师太凶了','看不懂文言文','我是理科男','情商不高','A,B,C',NULL),(14,'以下哪些是柳宗元的诗？','多选','2017-08-05 18:25:18',3,'捕蛇者说','静夜思','永州八记','咏鹅','A,C',NULL),(15,'柳宗元被贬在哪里的时候作了很多诗？','单选','2017-08-05 18:32:23',3,'永州','长沙','南昌','柳州','A',NULL),(16,'历史上最快的人的是谁？','单选','2017-08-05 18:32:59',3,'曹操','张飞','关羽','刘备','A',NULL),(17,'《静夜思》是谁写的？','单选','2017-08-05 18:35:06',3,'柳宗元','周敦颐','老子','李白','D',NULL),(18,'《爱莲说》是谁写的？','单选','2017-08-05 18:36:21',3,'柳宗元','周敦颐','李白','陶渊明','B',NULL),(19,'以下哪个词语是形容友情的？','单选','2017-08-05 18:39:33',3,'情意绵绵','情同手足','海枯石烂','天涯海角','B',NULL),(20,'1+1等于多少？','单选','2017-08-05 18:40:35',4,'1','2','3','4','B',NULL),(21,'2+2等于多少？','单选','2017-08-05 18:40:57',4,'1','2','3','4','D',NULL),(22,'11+11等于多少？','单选','2017-08-05 18:41:28',4,'11','33','22','44','C',NULL),(23,'66+66等于多少？','单选','2017-08-05 18:42:06',4,'132','145','142','162','A',NULL),(24,'77+11等于多少？','单选','2017-08-05 18:43:03',4,'22','33','88','143','C',NULL),(25,'6+1等于多少？','单选','2017-08-05 18:43:39',4,'1','3','5','7','D',NULL),(26,'比3小的数是？','多选','2017-08-05 18:44:11',4,'1','2','3','4','A,B',NULL),(27,'比5大的数是？','多选','2017-08-05 18:44:37',4,'2','4','6','8','C,D',NULL),(28,'my是什么意思？','单选','2017-08-05 18:47:25',5,'你的','我的','你们的','我们的','B',NULL),(29,'he是什么意思？','单选','2017-08-05 18:48:07',5,'你','我','他','她','C',NULL),(30,'her是什么意思？','单选','2017-08-05 18:49:34',5,'你','我','他','她','D',NULL),(31,'I是第几人称？','单选','2017-08-05 18:50:23',5,'第一人称','第二人称','第三人称','第四人称','A',NULL),(32,'want是什么意思？','单选','2017-08-05 18:51:11',5,'想要','得到','我们','全部','A',NULL),(33,'love是什么意思？','单选','2017-08-05 18:51:58',5,'恨','爱','交','加','B',NULL),(34,'以下哪些是第三人称','多选','2017-08-05 18:52:47',5,'he','her','we','I','A,B',NULL),(35,'以下哪些是打招呼用语？','多选','2017-08-05 18:53:52',5,'hi','hey','like','would','A,B',NULL);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `jointime` date DEFAULT NULL,
  `profesion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`password`,`sex`,`jointime`,`profesion`) values (2,'AA','66','男','2017-05-15','养牛'),(3,'BB','66','男','2017-08-05','养牛');

/*Table structure for table `studentresult` */

DROP TABLE IF EXISTS `studentresult`;

CREATE TABLE `studentresult` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examnumber` varchar(255) DEFAULT NULL,
  `lessonid` int(11) DEFAULT NULL,
  `resingle` int(11) DEFAULT NULL,
  `resmore` int(11) DEFAULT NULL,
  `restotal` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `studentresult_ibfk_1` (`lessonid`),
  CONSTRAINT `studentresult_ibfk_1` FOREIGN KEY (`lessonid`) REFERENCES `lesson` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `studentresult` */

insert  into `studentresult`(`id`,`examnumber`,`lessonid`,`resingle`,`resmore`,`restotal`,`createtime`) values (1,'CN201708062',1,60,40,100,'2017-08-06 08:15:41'),(2,'CN201708062',1,40,20,60,'2017-08-06 08:16:21'),(3,'CN201708062',2,60,40,100,'2017-08-06 08:16:57'),(4,'CN201708062',2,50,20,70,'2017-08-06 08:17:48'),(5,'CN201708062',15,60,40,100,'2017-08-06 08:18:43'),(6,'CN201708062',15,40,20,60,'2017-08-06 08:19:15'),(7,'CN201708062',1,60,40,100,'2017-08-06 11:16:14');

/*Table structure for table `taoti` */

DROP TABLE IF EXISTS `taoti`;

CREATE TABLE `taoti` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `lessonid` int(11) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `taoti_ibfk_1` (`lessonid`),
  CONSTRAINT `taoti_ibfk_1` FOREIGN KEY (`lessonid`) REFERENCES `lesson` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `taoti` */

insert  into `taoti`(`id`,`name`,`lessonid`,`createtime`) values (3,'2017年语文期末测试卷一',2,'2017-08-05'),(4,'2017年数学期末测试卷一',1,'2017-08-05'),(5,'2017年英语期末测试卷一',15,'2017-08-05');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
