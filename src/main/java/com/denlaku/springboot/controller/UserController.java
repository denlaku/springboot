package com.denlaku.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denlaku.springboot.common.BaseController;
import com.denlaku.springboot.common.Return;
import com.denlaku.springboot.service.UserService;
import com.denlaku.springboot.vo.User;

@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@GetMapping("/get")
	public Return<User> get(Long id) {
		User user = null;
		try {
			user = userService.findById(id);
		} catch (Exception e) {
			String message = e.getMessage();
			logger.error(message);
			return error(message);
		}
		return success(user);
	}
}
