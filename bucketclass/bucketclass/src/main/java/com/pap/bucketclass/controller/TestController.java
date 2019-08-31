package com.pap.bucketclass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.Services;
import com.pap.bucketclass.model.QueryServiceModel;
import com.pap.bucketclass.model.RequestModel;
import com.pap.bucketclass.model.ResponseModel;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.service.ListingService;
import com.pap.bucketclass.service.MemberService;
import com.pap.bucketclass.service.ServiceRegistSerivce;
import com.pap.bucketclass.service.TemplateService;

@Controller
public class TestController {
	/*********************
	 *TEST*
	 *********************/

	@Autowired
	MemberService memberService;

	@Autowired
	TemplateService makeTemplateService;

	@Autowired
	ListingService listingService; 
	
	@Autowired
	ServiceRegistSerivce serviceRegistSerivce;

	@RequestMapping(
			path="/test/1",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody RequestModel reqTest(@RequestBody RequestModel model) {
		System.out.println(model.toString());
		return model;
	}

	@RequestMapping(
			path="/test/2",
			method= RequestMethod.GET,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody List<Member> reqTest2() {
		return memberService.selectAll();
	}
	
	@RequestMapping(
			path="/test/3",
			method= RequestMethod.GET)
	public String reqTest3() {
		return "index";
	}
	
	@RequestMapping(
			path="/test/4",
			method= RequestMethod.POST)
	@ResponseBody
	public QueryServiceModel reqTest4(QueryServiceModel qsm) {
		return qsm;
	}
	
	@RequestMapping(
			path="/test/img1",
			method= RequestMethod.GET) 
	public String reqTest5() {
		return "imageUploadTest";
	}
}
