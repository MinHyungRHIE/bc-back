package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.ResponseModel;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.service.MemberService;

@Controller
public class SignUpController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(
			value="/login",
			method=RequestMethod.GET
			)
	public String loginForm() {
		return "login111";
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
	public ResponseModel create(@RequestBody SignUpModel model) {
		System.out.println(model.toString());
		ResponseModel resObj = new ResponseModel();
		try {
			Member member = memberService.insertMember(model);
			resObj.setResponse("success");
			return resObj;
		}catch(Exception e) {
			resObj.setResponse("fail");
			return resObj;
		}
	}
	
	@RequestMapping(
			path="/test",
			method=RequestMethod.GET
			)
	public String goToMain() {
		System.out.println("들어왔나");
		return "login";
	}
	

}
