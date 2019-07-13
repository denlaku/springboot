package com.denlaku.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.denlaku.springboot.common.Return;
import com.denlaku.springboot.vo.UserVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

	@Autowired
	private UserController userController;
	
	@Test
	public void testFindById() {
		Return<UserVO> findById = userController.findById(1L);
		System.out.println(findById);
	}

}
