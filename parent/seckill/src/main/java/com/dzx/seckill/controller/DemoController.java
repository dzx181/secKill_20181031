package com.dzx.seckill.controller;

import com.dzx.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengzhenxiang
 * @Date 2018/10/30 15:51
 * @Version
 * demo
 */
@RestController
public class DemoController {
	@Autowired
	private UserService userService;

	@Autowired
	private StringRedisTemplate redisTemplate;

	@GetMapping("/get")
	public String test(){
		redisTemplate.opsForValue().set("dzx","1");
		String  str = redisTemplate.opsForValue().get("dzx");
		return str;
	}
}
