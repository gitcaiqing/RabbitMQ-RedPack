package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.UserRedpack;
import com.sc.mapper.UserRedpackMapper;
import com.sc.service.UserRedpackService;

@Service
public class UserRedpackServiceImpl implements UserRedpackService{
	
	@Autowired
	private UserRedpackMapper userRedpackMapper;

	/**
	 * 插入用户抢红包记录
	 */
	public int insertGradReadPack(UserRedpack userRedpack) {
		return userRedpackMapper.insertSelective(userRedpack);
	}

}
