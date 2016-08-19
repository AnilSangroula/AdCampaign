package com.adCamp.model;

public class Campaign {
	
	private long id;
	
	private long duration;
	
	private String ad_content;
	
	private User partner;

	public long getId() {
		return id;
	}
	

	public User getPartner() {
		return partner;
	}


	public void setPartner(User partner) {
		this.partner = partner;
	}


	public void setId(long id) {
		this.id = id;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getAd_content() {
		return ad_content;
	}

	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}
	
	@Override
	public String toString(){
		return "{"+id+", " + duration + " , "+ad_content+", "+partner.getId()+"}";
	}
	

}
