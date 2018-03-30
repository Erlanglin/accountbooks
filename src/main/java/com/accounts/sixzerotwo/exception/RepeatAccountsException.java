package com.accounts.sixzerotwo.exception;

/**
 * 重复预约异常
 */
public class RepeatAccountsException extends RuntimeException {

	public RepeatAccountsException(String message) {
		super(message);
	}

	public RepeatAccountsException(String message, Throwable cause) {
		super(message, cause);
	}

}
