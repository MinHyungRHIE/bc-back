package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pap.bucketclass.repository.MemberRepository;

@Controller
public class LoginController {
	
	@RequestMapping(
			value="/login",
			method=RequestMethod.GET
			)
	public String loginForm() {
		return "member-login";
	}
}
