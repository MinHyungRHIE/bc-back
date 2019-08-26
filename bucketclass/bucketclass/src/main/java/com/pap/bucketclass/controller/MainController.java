package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
    public String index(Principal principal) {
        System.out.println(principal.getName());
        return "index";
    }
	
}
