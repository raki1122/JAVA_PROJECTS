package com.example.SchoolApplication.CustomExce;

import java.time.LocalDateTime;

public class ErrorDetails {
  public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
private String msg;
  private LocalDateTime timeStamp;
  private String Details;
public ErrorDetails(String msg, LocalDateTime timeStamp, String details) {
	super();
	this.msg = msg;
	this.timeStamp = timeStamp;
	Details = details;
}
  
}
