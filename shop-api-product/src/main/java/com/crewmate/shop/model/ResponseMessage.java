package com.crewmate.shop.model;

import lombok.Data;

@Data
public class ResponseMessage {

	private String responseMessage;
	
	private int resultCode;
	
	private Object data;
	
	
}
