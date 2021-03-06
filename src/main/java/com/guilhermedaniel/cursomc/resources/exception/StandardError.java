package com.guilhermedaniel.cursomc.resources.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Instant instant;
	
	public StandardError() {
	}

	public StandardError(Integer status, String msg, Instant instant) {
		super();
		this.status = status;
		this.msg = msg;
		this.instant = instant;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}
}
