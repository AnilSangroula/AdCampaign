package com.adCamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adCamp.model.Campaign;
import com.adCamp.repository.CampaignRepository;

@Service
public class CampaignService {
	@Autowired
	private CampaignRepository repository;

	public void registerCampaign(Campaign campaign){
		repository.save(campaign);
	}
	
	public Campaign getCampaign(String partner_id){
		return repository.findOne(partner_id);
	}
}
