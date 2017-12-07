package com.denlaku.boot.base;

public final class Success<T> extends Response<T> {
	public Success(T data) {
		this.setStatus(true);
		this.setData(data);
	}
	public Success(T data, String message) {
		this(data);
		this.setMessage(message);
	}
}
