package com.sc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.service.CommonMqService;

@Service
public class CommonMqServiceImpl implements CommonMqService{
	
	private static final Logger log = LoggerFactory.getLogger(CommonMqServiceImpl.class);

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	/**
	 * 发送消息
	 */
	public void sendGradRedPack(String userid) {
		try {
			rabbitTemplate.convertAndSend("info", userid);
		} catch (AmqpException e) {
			log.error("发送用户抢红包进入消息队列异常："+e.getMessage());
			e.printStackTrace();
		}
	}

}
