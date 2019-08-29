package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.RequestModel;
import com.pap.bucketclass.service.CustomerMyPageService;
import com.pap.bucketclass.service.LocalMemberDetailsService;

@Controller
public class CustomerMyPageController {

	@Autowired
	private CustomerMyPageService customerService;

	@Autowired
	private LocalMemberDetailsService memberDetailsService;

	// 메인에서 이용자가 mypage 버튼을 눌렀을 때 들어오는 경로
	@PreAuthorize("hasRole('ROLE_CUSTOMER')")
	@GetMapping(value="/customer/mypage")
	public String CustomerMyPage(Principal principal, ModelMap model) {
		if(principal != null) {
			System.out.println(principal.getName());
		}
		Member member = (Member) memberDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("member", member);
		return "customer-mypage";
	}

	 //페이지 전환 후, 프로필 정보에 나타낼 멤버 정보 보내기
	@PostMapping(value="/customer/mypage", 
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE})
	@ResponseBody
	public Member UpdateMypage(@RequestBody RequestModel model, Principal principal) {
		Member member = customerService.loadMember(principal.getName());
		if(member != null) {
			return member;
		}
		return null;
	}

}
