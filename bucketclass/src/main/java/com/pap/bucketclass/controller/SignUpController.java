package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.service.MemberService;

@Controller
public class SignUpController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(
			path="/login",
			method=RequestMethod.GET
			)
	public String loginForm() {
		return "login";
	}
	
	@RequestMapping(
			path="/signup",
			method=RequestMethod.GET
			)
	public String signUpForm() {
		return "signup";
	}
	
	@RequestMapping(
			path="/signup",
			method=RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
					}
			)
	@ResponseBody
	public String create(@RequestBody SignUpModel model) {
		System.out.println(model.toString());
		try {
			Member member = memberService.insertMember(model);
			return "success";
		}catch(Exception e) {
			return "fail";
		}
	}
	
	@RequestMapping(
			path="/",
			method=RequestMethod.GET,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
					}
			)
	public String goToMain() {
		return "index";
	}
}
