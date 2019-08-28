package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.service.ProviderMyPageService;

@RestController
public class ProviderMyPageController {
	
	@Autowired
	private ProviderMyPageService providerService;
	
	
//	@GetMapping("/provider/mypage")
//	public String providerMyPage() {
//		return "provider-mypage";
//	}
	
	@GetMapping(value="/provider/mypage/{id}",
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE})
	public Member ProviderMyPage(@RequestParam("id") String memberId) {
		return providerService.loadMember(memberId);
	}
}
