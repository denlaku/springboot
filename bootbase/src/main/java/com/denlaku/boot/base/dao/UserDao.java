package com.denlaku.boot.base.dao;

import com.denlaku.boot.base.vo.UserVO;

public interface UserDao {
	public UserVO findById(Long id);
}
