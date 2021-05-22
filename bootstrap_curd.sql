/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : bootstrap_curd

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2020-12-19 16:01:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('2', '112', null, '222', '222', null, null, '2020-12-19 12:28:00', null);
INSERT INTO `tb_user` VALUES ('3', '33', null, '33', '33', null, null, null, null);
INSERT INTO `tb_user` VALUES ('4', '55', null, '55', '', null, null, null, null);
INSERT INTO `tb_user` VALUES ('5', '55', null, '55', '55', null, null, null, null);
INSERT INTO `tb_user` VALUES ('6', '55', null, '55s', 'aaa', null, null, null, null);
INSERT INTO `tb_user` VALUES ('7', '55', null, '55', '', null, null, null, null);
INSERT INTO `tb_user` VALUES ('8', '55', null, '55', '', null, null, null, null);
INSERT INTO `tb_user` VALUES ('9', '55', null, '55', '', null, null, null, null);
INSERT INTO `tb_user` VALUES ('11', '55', null, '55', '', null, null, null, null);
INSERT INTO `tb_user` VALUES ('12', 'dfsa', null, 'sdf', 'sdf', null, null, null, null);
INSERT INTO `tb_user` VALUES ('13', 'dfg', null, 'dfg', 'dfg', null, null, null, null);
INSERT INTO `tb_user` VALUES ('14', 'sss', null, 'sss', 'ss', null, null, null, null);
INSERT INTO `tb_user` VALUES ('15', 'bb', null, 'bb', 'b', null, null, null, null);
INSERT INTO `tb_user` VALUES ('16', 'cc', null, 'cc', 'cc', null, null, null, null);
INSERT INTO `tb_user` VALUES ('17', 'dd', null, 'dd', 'dd', '2020-12-19 12:22:44', null, '2020-12-19 12:22:44', null);
INSERT INTO `tb_user` VALUES ('18', 'bbbb', null, 'bbbb', 'bbb', '2020-12-19 12:27:05', null, '2020-12-19 12:27:05', null);
INSERT INTO `tb_user` VALUES ('19', 'ffff', null, 'fff', 'fff', '2020-12-19 12:28:08', null, '2020-12-19 12:28:08', null);
