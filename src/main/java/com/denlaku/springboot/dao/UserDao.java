package com.denlaku.springboot.dao;

import com.denlaku.springboot.vo.User;

public interface UserDao {
	public User findById(Long id);
}
