#创建抢红包数据库
CREATE DATABASE db_redpack CHARACTER SET UTF8;

#创建用户发红包记录表
CREATE TABLE tb_redpack(
	id int not null AUTO_INCREMENT,
	userId varchar(32) not null comment '发红包用户',
	amount decimal(10,2) not null comment '红包金额',
	unitAmount decimal(10,2) not null comment '单个红包金额',
	total int not null comment '红包个数',
	remain int not null comment '红包剩余个数',
	sendDate datetime not null comment '发红包时间',
	version int default 0 not null comment '版本控制，扩展乐观锁使用',
	primary key(id)
);

#创建用户抢红包记录
CREATE TABLE tb_user_redpack(
	id int not null AUTO_INCREMENT,
	userId varchar(32) not null comment '抢红包用户',
	redpackId int not null comment '发红包记录id',
	amount decimal(10,2) not null comment '抢的红包金额',
	grabDate datetime not null comment '抢红包时间',
	version int default 0 not null comment '版本控制，扩展乐观锁使用',
	primary key(id)
);

#插入测试数据
INSERT INTO tb_redpack(userId,amount,unitAmount,total,remain,sendDate)
VALUES("999999",100000.00,100.00,1000,1000,now());


