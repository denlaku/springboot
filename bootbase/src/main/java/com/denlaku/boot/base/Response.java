package com.denlaku.boot.base;

import lombok.Data;

@Data
public abstract class Response<T> {
	private boolean status;
	private String message;
	private T data;
}
