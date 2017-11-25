package com.tl.boot.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tl.boot.base.dao.UserDao;
import com.tl.boot.base.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDao UserDao;
	
	public UserVO findById(Long id) {
		return UserDao.findById(id);
	}
}
