package com.pap.bucketclass.model;

import java.io.Serializable;

public class ResponseModel implements Serializable{
	private String response;

	public String getResponse() {
		return response;
	}

	public boolean setResponse(String response) {
		this.response = response;
		return true;
	}
}
