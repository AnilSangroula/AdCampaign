package com.adCamp.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.adCamp.exceptions.CampaignExistsException;
import com.adCamp.model.Campaign;
import com.adCamp.model.User;

@Repository
public class CampaignRepository {

	Map<String, Campaign> campaings = new HashMap<>();
	public CampaignRepository(){
		Campaign campaign = new Campaign();
		campaign.setId(1000);
		
		User partner = new User();
		partner.setId("flood-campaign");
		campaign.setPartner(partner);
		
		campaign.setDuration(1000000);
		
		campaign.setAd_content("Money is being collected.....");
		
		campaings.put("flood-campaign", campaign);
	}
	public void save(Campaign campaign){
		if(campaings.containsKey(campaign.getPartner().getId())){
			throw new CampaignExistsException();
		}
		campaings.put(campaign.getPartner().getId(), campaign);
	}
	
	public Campaign findOne(String partner_id){
		return campaings.get(partner_id);
	}
	
}
