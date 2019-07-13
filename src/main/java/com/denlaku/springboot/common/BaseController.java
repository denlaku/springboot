package com.denlaku.springboot.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected <T> Return<T> success(T data) {
		return new Success<T>(data);
	}

	protected <T> Return<T> error(String message) {
		return new Error<T>(message);
	}

	protected <T> Return<T> error(String message, Object data) {
		return new Error<T>(message, data);
	}

}
