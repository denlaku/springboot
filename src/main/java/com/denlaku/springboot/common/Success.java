package com.denlaku.springboot.common;

public final class Success<T> implements Return<T> {

	private boolean status = true;
	private T data;
	private String message;

	public Success(T data) {
		this.data = data;
	}

	public boolean isStatus() {
		return status;
	}

	public T getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}
}
