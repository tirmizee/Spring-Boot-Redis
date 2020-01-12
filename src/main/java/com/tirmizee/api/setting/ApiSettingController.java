package com.tirmizee.api.setting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiSettingController {
	
	@Autowired
	public RedisTemplate<String, Object> redisTemplate;
	
	@GetMapping(path = "/")
	public String ssss() {
		return "";
	}

}
