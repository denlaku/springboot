package com.denlaku.springboot.dao;

import com.denlaku.springboot.vo.UserVO;

public interface UserDao {
	public UserVO findById(Long id);
}
