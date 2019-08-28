package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.CustomerMyPageModel;
import com.pap.bucketclass.service.CustomerMyPageService;

@Controller
public class CustomerMyPageController {

	@Autowired
	private CustomerMyPageService customerService;
	@Autowired
	private CustomerMyPageModel customerModel;

	@GetMapping("/customer/mypage")
	public String signUpForm() {
		return "customer-mypage";
	}

	// 메인에서 이용자가 mypage 버튼을 눌렀을 때 들어오는 경로
	@GetMapping(value="/customer/mypage/{id}")
	public Member CustomerMyPage(@PathVariable("id") String memberId) {
		Member member = customerService.loadMember(memberId);
		System.out.println(member.getUsername());
		if(member.getUsername() == memberId) {
			return customerService.loadMember(memberId);
		}
		else {
			return null;
		}
	}

	// 이용자가 mypage에 들어와서 개인정보를 수정했을 때 들어오는 경로
	@PostMapping(value="/customer/mypage", 
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE})
	@ResponseBody
	public Member UpdateMypage(@RequestBody CustomerMyPageModel customerModel) {
		return null;
	}

}
