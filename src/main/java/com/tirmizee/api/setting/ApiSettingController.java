package com.tirmizee.api.setting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.JedisPool;

@RestController

public class ApiSettingController {
	
	@Autowired
	public JedisPool jedisPool;
	
	@Autowired
	public RedisTemplate<String, Object> redisTemplate;
	
	@GetMapping(path = "/")
	public String setting() {
		System.out.println(jedisPool.getNumActive());
		return "";
	}

}
