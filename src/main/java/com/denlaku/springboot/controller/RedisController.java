//package com.denlaku.springboot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.denlaku.springboot.common.Response;
//import com.denlaku.springboot.common.Success;
//
//@RestController
//@RequestMapping("/api/redis")
//public class RedisController {
//
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//
//	@GetMapping("/getByKey/{key}")
//	public Response<String> getByKey(@PathVariable("key") String key) {
//		String value = this.stringRedisTemplate.opsForValue().get(key);
//		return new Success<>(value);
//	}
//
//	@GetMapping("/setKeyValue/{key}/{value}")
//	public boolean setKeyValue(@PathVariable("key") String key, @PathVariable("value") String value) {
//		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
//		boolean bExistent = this.stringRedisTemplate.hasKey(key);
//		if (bExistent) {
//			System.out.println("this key is bExistent!");
//		} else {
//			ops.set(key, value);
//		}
//		return true;
//	}
//
//	@GetMapping("/deleteByKey/{key}")
//	public boolean deleteByKey(@PathVariable("key") String key) {
//		this.stringRedisTemplate.delete(key);
//		return true;
//	}
//}
