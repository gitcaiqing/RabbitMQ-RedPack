package com.sc.entity;

public class ResultModel<T> {

	public int resultCode = 0;//0成功1失败
	public T data;
	public String msg;
	public int getResultCode() {
		return resultCode;
	}
	public ResultModel(int resultCode, T data, String msg) {
		super();
		this.resultCode = resultCode;
		this.data = data;
		this.msg = msg;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
