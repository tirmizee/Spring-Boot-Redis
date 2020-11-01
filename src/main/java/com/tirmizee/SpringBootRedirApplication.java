package com.tirmizee;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootApplication
public class SpringBootRedirApplication implements CommandLineRunner{

	@Autowired
	public ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedirApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		@SuppressWarnings("unchecked")
		RedisTemplate<String, Object> redisObjectTemplate = context.getBean("redisObjectTemplate", RedisTemplate.class);
		
		SetOperations<String, Object> setOperations = redisObjectTemplate.opsForSet();
		setOperations.add("NAMES", "Pratya", "Tirmizee");
		setOperations.add("NAMES", "C");
		
		@SuppressWarnings("unchecked")
		RedisTemplate<String, String> redisStringTemplate = context.getBean("redisStringTemplate", RedisTemplate.class);
		
		ValueOperations<String, String> valueOperations = redisStringTemplate.opsForValue();
		valueOperations.setIfAbsent("ID", "56161177");
		
		HashOperations<String, String, Object> hashOperations = redisStringTemplate.opsForHash();
		hashOperations.put("MAP", "useId", 12345);
		hashOperations.put("MAP", "userName", "Pratya");
		
	}
 
}
