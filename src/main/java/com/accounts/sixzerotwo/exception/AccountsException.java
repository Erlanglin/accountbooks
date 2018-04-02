package com.accounts.sixzerotwo.exception;

/**
 * 预约业务异常
 */
public class AccountsException extends RuntimeException {

	public AccountsException(String message) {
		super(message);
	}

	public AccountsException(String message, Throwable cause) {
		super(message, cause);
	}

}
