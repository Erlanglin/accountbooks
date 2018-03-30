-- 创建数据库
CREATE DATABASE account_books;

-- 创建基佬表（消费者也是付款者）
CREATE TABLE `boss` (
  `boss_id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '基佬名字',
  `accounts` int(11) NOT NULL COMMENT '账目',
  `remarks` varchar(256) DEFAULT NULL COMMENT '消费备注',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
  PRIMARY KEY (`boss_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='基佬表';

-- 初始化基佬数据
INSERT INTO `boss` (`boss_id`, `name`, `accounts`, `remarks`, `update_time`)
VALUES
	(1, '帅哥林', 0,null,'2018-3-30'),
	(2, '菜鸡巍', 0,null,'2018-3-30'),
	(3, '优秀煌', 0,null,'2018-3-30'),
	(4, '保健洁', 0,null,'2018-3-30'),
	(5, '单身康', 0,null,'2018-3-30');

-- 创建账单表
CREATE TABLE `accounts` (
  `accounts_id` int(20) NOT NULL AUTO_INCREMENT,
  `boss_id` int(20) NOT NULL COMMENT '付款人ID',
  `consumers_id` int(20) NOT NULL COMMENT '消费者ID',
  `activity_name` varchar(100) NOT NULL COMMENT '活动名称',
  `monetary` int(20) NOT NULL COMMENT '消费金额',
  `activity_time` date DEFAULT NULL COMMENT '活动时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
  PRIMARY KEY (`accounts_id`),
  FOREIGN KEY(boss_id) REFERENCES boss(boss_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账单表';

-- 初始化账单数据
INSERT INTO `accounts` (`accounts_id`, `boss_id`, `consumers_id`,`activity_name`, `monetary`, `activity_time`, `update_time`)
VALUES
  (1, 1, 12345, '吃饭', 500, '2018-3-30', '2018-3-30');