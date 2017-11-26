package com.tl.boot.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tl.boot.base.Response;
import com.tl.boot.base.Success;
import com.tl.boot.base.service.UserService;
import com.tl.boot.base.vo.UserVO;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/findById/{id}")
	public Response<UserVO> findById(@PathVariable("id") Long id) {
		UserVO user = userService.findById(id);
		return new Success<>(user);
	}
}
