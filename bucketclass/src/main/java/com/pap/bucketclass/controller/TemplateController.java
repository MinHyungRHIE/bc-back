package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.ServiceTemplate;
import com.pap.bucketclass.model.CreateTemplateModel;
import com.pap.bucketclass.model.ResponseModel;
import com.pap.bucketclass.service.ListingService;
import com.pap.bucketclass.service.MemberService;
import com.pap.bucketclass.service.ServiceRegistSerivce;
import com.pap.bucketclass.service.TemplateService;

@Controller
public class TemplateController {
	
	@Autowired
	MemberService memberService;

	@Autowired
	TemplateService templateService;

	@Autowired
	ListingService listingService; 
	
	@Autowired
	ServiceRegistSerivce serviceRegistSerivce;
	
	@RequestMapping(
			path="/provider/add-service",
			method= RequestMethod.GET)
	public String templateForm() {
		return "dashboard-add-listing";
	}
	
	@RequestMapping(
			path="/provider/add-service",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE	
			})
	public @ResponseBody ResponseModel createTemplate(@RequestBody CreateTemplateModel model, Principal principal) {
		ServiceTemplate getService = templateService.createTemplate(model, principal);
		ResponseModel resModel = new ResponseModel();
		resModel.setRes("success");
		return resModel;
	}
	
}
