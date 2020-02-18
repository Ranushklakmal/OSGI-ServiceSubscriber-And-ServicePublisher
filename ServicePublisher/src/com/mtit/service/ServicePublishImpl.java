package com.mtit.service;

public class ServicePublishImpl implements ServicePublish{

	@Override
	public String messageService(String message) {
		return "Message by service provider execute " + message;		
	}
}
