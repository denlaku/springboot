package com.denlaku.springboot.common;

import lombok.Data;

@Data
public final class Error<T> implements Response<T> {
	private boolean status;
	private Object data;
	private String message;

	public Error(String message) {
		this.message = message;
	}

	public Error(String message, Object data) {
		this.data = data;
		this.message = message;
	}
}
