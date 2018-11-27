package com.sc.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.RedpackMapper;
import com.sc.service.RedpackService;

@Service
public class RedpackServiceImpl implements RedpackService{

	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private RedpackMapper redpackMapper;
	
	//产生抢红包消息，消息内容为用户id
	public void sendGradRedPackMsg(String userid) {
		rabbitTemplate.convertAndSend("info", userid);
	}

	/**
	 * 获取红包剩余个数
	 * @param id
	 * @return
	 */
	public int getRedPackRemain(Integer id) {
		return redpackMapper.selectRemainByPrimaryKey(id);
	}

	/**
	 * 扣减红包剩余个数
	 */
	public int deducteRedPack(Integer id) {
		return redpackMapper.updateRemainRedPack(id);
	}

}
