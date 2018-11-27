package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.UserRedpack;
import com.sc.service.GrabRedPackService;
import com.sc.service.RedpackService;
import com.sc.service.UserRedpackService;

@Service
public class GrabRedPackServiceImpl implements GrabRedPackService{
	
	private static final Logger log = LoggerFactory.getLogger(GrabRedPackServiceImpl.class);
	
	private static final int redpackId = 1;
	private static final String amount = "10.00";
	
	@Autowired
	private RedpackService redpackService;
	@Autowired
	private UserRedpackService userRedpackService;

	public void grabRedPack(String userId) {
		try {
			//1.查询红包剩余个数是否大于0
			int remain = redpackService.getRedPackRemain(redpackId);
			if(remain > 0) {
				//2.扣减红包个数
				int result = redpackService.deducteRedPack(redpackId);
				if(result > 0) {
					//3.新增用户抢红包记录
					UserRedpack userRedpack = new UserRedpack();
					userRedpack.setUserid(userId);
					userRedpack.setRedpackid(redpackId);
					userRedpack.setGrabdate(new Date());
					userRedpack.setAmount(new BigDecimal(amount));
					userRedpackService.insertGradReadPack(userRedpack);
				}
				
			}
			//异步通知用户抢红包成功
		} catch (Exception e) {
			log.error("处理抢单异常："+e.getMessage());
			throw new RuntimeException("处理抢单异常");
		}
	}
	
}
