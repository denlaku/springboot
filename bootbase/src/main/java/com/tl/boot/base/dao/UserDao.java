package com.tl.boot.base.dao;

import com.tl.boot.base.vo.UserVO;

public interface UserDao {
	public UserVO findById(Long id);
}
