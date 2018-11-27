package com.sc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.entity.ResultModel;
import com.sc.service.CommonMqService;
import com.sc.service.impl.CommonMqServiceImpl;

@Controller
@RequestMapping("redpack")
public class GrabRedPackController {
	
	private static final Logger log = LoggerFactory.getLogger(CommonMqServiceImpl.class);
	
	@Autowired
	private CommonMqService commonMqService;
	
	@RequestMapping("grab")
	@ResponseBody
	public ResultModel<String> grab(String userid){
		try {
			commonMqService.sendGradRedPack(userid);
			return new ResultModel<String>(0, userid, "抢红包成功");
		} catch (Exception e) {
			e.printStackTrace();
			log.error("用户："+userid+" 抢红包失败");
			return new ResultModel<String>(0, userid, "抢红包失败");
		}
	}

}
