package com.denlaku.springboot.common;

import lombok.Data;

@Data
public final class Success<T> implements Response<T> {

	private boolean status = true;
	private T data;
	private String message;

	public Success(T data) {
		this.data = data;
	}
}
