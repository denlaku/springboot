package com.denlaku.springboot.common;

public final class Error<T> implements Return<T> {
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

	public boolean isStatus() {
		return status;
	}

	public Object getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}
}
