package com.denlaku.boot.base;

public final class Error<T> extends Response<T> {
	public Error(String message) {
		this.setMessage(message);
	}

	public Error(String message, T data) {
		this(message);
		this.setData(data);
	}
}
