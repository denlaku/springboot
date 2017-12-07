package com.denlaku.boot.base.vo;

import java.util.Date;

import lombok.Data;

@Data
public class UserVO {

	private Long id;
	private String name;
	private Long age;
	private Date createDate;
	private Date updateDate;
}
