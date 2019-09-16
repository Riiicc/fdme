package com.fdme.entity;

import java.io.Serializable;


public class Result<T> implements Serializable{


	private static final long serialVersionUID = 7650695707116120916L;
	private String code = "200";

    private String message;

    private T data;

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result buildSuccess(T data) {
        return new Result(data);
    }
    public static <T> Result buildSuccess() {
        return new Result();
    }

    public static Result buildFail(String code, String message) {
        return new Result(code, message);
    }

    @Override
    public String toString() {
        return "{'ResultDto':{" +
                "'code':" + code +
                ", 'message':'" + message + '\'' +
                ", 'data':" + data +"}";
    }
}
