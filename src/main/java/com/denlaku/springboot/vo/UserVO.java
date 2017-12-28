package com.denlaku.springboot.vo;

import java.util.Date;

import lombok.Data;

@Data
public class UserVO {
	private Long id;
	private String name;
	private Integer age;
	private String sex;

	private Date createDate;
	private Date updateDate;

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
