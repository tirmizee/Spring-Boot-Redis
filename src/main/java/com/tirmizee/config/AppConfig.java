package com.tirmizee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class AppConfig {

	@Bean
	public JedisPool jedisPool() {
		return new JedisPool(new JedisPoolConfig(),"localhost", 6379);
	}
	
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
	  final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
	  template.setConnectionFactory(jedisConnectionFactory);
	  template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
	  return template;
	}
	
}
