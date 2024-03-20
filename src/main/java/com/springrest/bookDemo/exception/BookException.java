package com.springrest.bookDemo.exception;

import org.springframework.http.HttpStatus;

public class BookException {

	
	private final String massage;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	
	
	public BookException(String massage, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.massage = massage;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}
	public String getMassage() {
		return massage;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
}
