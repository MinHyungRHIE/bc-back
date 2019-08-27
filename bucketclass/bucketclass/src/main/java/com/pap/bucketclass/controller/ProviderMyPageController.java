package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.model.ProviderMyPageModel;
import com.pap.bucketclass.service.ProviderMyPageService;

@Controller
public class ProviderMyPageController {
	
//	@Autowired
//	private ProviderMyPageService providerService;
	
	
	@GetMapping("/provider/mypage")
	public String providerMyPage() {
		return "provider-mypage";
	}
	
	
//	@RequestMapping(path="/provider/mypage", method=RequestMethod.POST,
//			produces= {
//					MediaType.APPLICATION_JSON_UTF8_VALUE,
//					MediaType.APPLICATION_ATOM_XML_VALUE})
//	@ResponseBody
//	public String ProviderMyPage(@RequestBody ProviderMyPageModel model) {
//		return "provider-mypage";
//	}
	
}
