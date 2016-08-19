package com.adCamp.exceptions;

public class CampaignExistsException extends RuntimeException{
	
	public CampaignExistsException(){}
	
	public CampaignExistsException(String message)
	{
		super(message);
	}
}
