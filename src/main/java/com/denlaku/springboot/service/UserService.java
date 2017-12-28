package com.denlaku.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denlaku.springboot.dao.UserDao;
import com.denlaku.springboot.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDao UserDao;
	
	public UserVO findById(Long id) {
		return UserDao.findById(id);
	}
}
