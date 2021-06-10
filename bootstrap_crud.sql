CREATE DATABASE /*!32312 IF NOT EXISTS*/`springboot` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `springboot`;

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `truename` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(100) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `update_user` varchar(100) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`password`,`email`,`truename`,`create_time`,`create_user`,`update_time`,`update_user`) values (1,'zou','zou','1565453341@qq.com','邹祥发',NULL,NULL,'2021-05-27 10:52:24',NULL);

/*Table structure for table `login_user` */

DROP TABLE IF EXISTS `login_user`;

CREATE TABLE `login_user` (
                              `id` int(11) NOT NULL AUTO_INCREMENT,
                              `loginName` varchar(50) DEFAULT NULL COMMENT '登录账号',
                              `loginPwd` varchar(100) DEFAULT NULL COMMENT '登录密码',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户登录表';

/*Data for the table `login_user` */

insert  into `login_user`(`id`,`loginName`,`loginPwd`) values (1,'zou','zou');

