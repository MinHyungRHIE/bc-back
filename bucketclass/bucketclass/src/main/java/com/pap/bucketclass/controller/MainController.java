package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
    public String index(Principal principal) {
        return "main";
    }
	
}
