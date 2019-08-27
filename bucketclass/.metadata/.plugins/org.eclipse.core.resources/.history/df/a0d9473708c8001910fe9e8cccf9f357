package com.pap.bucketclass.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.model.ResponseModel;

@Controller
public class LoginController {
	
	@RequestMapping(
			value="/login",
			method=RequestMethod.GET
			)
	public String loginForm() {
		return "member-login";
	}
	
	@RequestMapping(
			path="/login",
			method=RequestMethod.POST,
			produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public String login() {
		ResponseModel resObj = new ResponseModel();
		return "index";
	}
	
}
