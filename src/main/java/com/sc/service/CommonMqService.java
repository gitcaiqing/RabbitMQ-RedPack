package com.sc.service;

public interface CommonMqService {

	//插入用户抢红包信息，信息内容为用户id
	void sendGradRedPack(String userid);
}
