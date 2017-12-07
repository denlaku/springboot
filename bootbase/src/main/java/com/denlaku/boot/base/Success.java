package com.denlaku.boot.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public final class Success<T> extends Response<T> {
	private T data;

	public Success(T data) {
		this.setStatus(true);
		this.setData(data);
	}

	public Success(T data, String message) {
		this(data);
		this.setMessage(message);
	}
}
