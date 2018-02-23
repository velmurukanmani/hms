/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50141
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50141
File Encoding         : 65001

Date: 2018-02-24 01:02:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `branch`
-- ----------------------------
DROP TABLE IF EXISTS `branch`;
CREATE TABLE `branch` (
  `KEY` int(11) NOT NULL AUTO_INCREMENT,
  `BRANCH_ID` varchar(10) NOT NULL DEFAULT '',
  `BRANCH_NAME` varchar(50) DEFAULT NULL,
  `COUNTRY` varchar(50) DEFAULT NULL,
  `STATE` varchar(50) DEFAULT NULL,
  `ADDRESS` varchar(200) DEFAULT NULL,
  `PINCODE` int(7) DEFAULT NULL,
  `MOBILE` int(11) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`KEY`,`BRANCH_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of branch
-- ----------------------------

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `KEY` int(11) NOT NULL AUTO_INCREMENT,
  `DEPARTMENT_ID` varchar(10) DEFAULT NULL,
  `DEPARTMENT_NAME` varchar(50) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `designation`
-- ----------------------------
DROP TABLE IF EXISTS `designation`;
CREATE TABLE `designation` (
  `KEY` int(11) NOT NULL AUTO_INCREMENT,
  `DESIGNATION_ID` varchar(10) DEFAULT NULL,
  `DESIGNATION_NAME` varchar(50) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of designation
-- ----------------------------

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `KEY` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_ID` varchar(10) DEFAULT NULL,
  `ORG_ID` varchar(10) DEFAULT NULL,
  `BRANCH_ID` varchar(10) DEFAULT NULL,
  `DEPARTMENT_ID` varchar(10) DEFAULT NULL,
  `DESIGNATION_ID` varchar(10) DEFAULT NULL,
  `FIRSTNAME` varchar(50) DEFAULT NULL,
  `LASTNAME` varchar(50) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `MOBILE` int(11) DEFAULT NULL,
  `LANDLINE` varchar(20) DEFAULT NULL,
  `JOINING_DATE` date DEFAULT NULL,
  `REPORTING_TO` varchar(10) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for `organisation`
-- ----------------------------
DROP TABLE IF EXISTS `organisation`;
CREATE TABLE `organisation` (
  `KEY` int(11) NOT NULL AUTO_INCREMENT,
  `ORG_ID` varchar(10) DEFAULT NULL,
  `ORG_NAME` varchar(50) DEFAULT NULL,
  `ABOUT_US` varchar(500) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of organisation
-- ----------------------------

-- ----------------------------
-- Table structure for `test_employee`
-- ----------------------------
DROP TABLE IF EXISTS `test_employee`;
CREATE TABLE `test_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `joining_date` date NOT NULL,
  `salary` double NOT NULL,
  `ssn` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ssn` (`ssn`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of test_employee
-- ----------------------------
INSERT INTO `test_employee` VALUES ('1', 'Velmurugan', '2018-02-01', '10000', '1');
INSERT INTO `test_employee` VALUES ('2', 'Amudha', '2018-02-02', '20000', '2');
INSERT INTO `test_employee` VALUES ('3', 'Kanishka', '2018-02-03', '30000', '3');
INSERT INTO `test_employee` VALUES ('4', 'Magizhini', '2018-02-06', '200000', '4');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `KEY` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `USER_TYPE` char(1) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `MODIFIED_BY` varchar(50) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
