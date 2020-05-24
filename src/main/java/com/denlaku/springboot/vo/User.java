package com.denlaku.springboot.vo;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private Long id;
	private String name;
	private Integer age;
	private String sex;

	private Date createdAt;
	private Date updatedAt;

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
