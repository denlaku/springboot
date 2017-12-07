package com.denlaku.boot.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public final class Error<T> extends Response<T> {
	private Object data;
	public Error(String message) {
		this.setMessage(message);
	}

	public Error(String message, Object data) {
		this(message);
		this.setData(data);
	}
}
