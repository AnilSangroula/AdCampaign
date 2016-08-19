package com.adCamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adCamp.exceptions.CampaignExistsException;
import com.adCamp.model.Campaign;
import com.adCamp.model.User;
import com.adCamp.service.CampaignService;

import org.springframework.web.bind.annotation.RequestMethod;;

@RestController
public class CampaignController {
	
	@Autowired
	private CampaignService campainService;

	@RequestMapping(value="/ad/{partner_id}",method=RequestMethod.GET)
	public ResponseEntity<Campaign> getCampaign(@PathVariable("partner_id")String partner_id){
		Campaign campaign = campainService.getCampaign(partner_id);
		if(campaign != null){
			return new ResponseEntity<Campaign>(campaign,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/ad",method=RequestMethod.POST)
	public ResponseEntity<Campaign> addCampaign(@RequestBody Campaign campaign){
//		System.out.println(campaign);
		try{
			campainService.registerCampaign(campaign);
			return new ResponseEntity<Campaign>(HttpStatus.OK);
		}catch (CampaignExistsException e) {
			return new ResponseEntity<Campaign>(HttpStatus.CONFLICT);
		}
		
		
	}
	
}
