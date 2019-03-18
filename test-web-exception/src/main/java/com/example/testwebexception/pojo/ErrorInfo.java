package com.example.testwebexception.pojo;

import java.util.Date;

/**
 * Created by hanqb on 2018-5-31.
 */

@lombok.Data
public class ErrorInfo<T> {

	public static final Integer OK = 0;
	public static final Integer ERROR = 500;

	private String errorCode;
	private String message;
	private String url;
	private T data;
	private Date errorDate;
	private String errorId;
}
