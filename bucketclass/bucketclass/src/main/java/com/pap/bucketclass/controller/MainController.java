package com.pap.bucketclass.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.Role;

@Controller
public class MainController {

	@GetMapping("/")
	public String loginToMain(Authentication auth, ModelMap modelMap) {
		if(auth != null) {
			Object principal = auth.getPrincipal();
			Set<Role> userRole = new HashSet<>();
			if(principal != null && principal instanceof Member){
				userRole = ((Member)principal).getRoles();
			}
			System.out.println(userRole);
			String roleStr = null; 
			Iterator<Role> itr = userRole.iterator();
			while(itr.hasNext()) {
				roleStr = itr.next().getRoleName();
			}

			modelMap.addAttribute("rolename", roleStr);
			modelMap.addAttribute("nick",((Member)principal).getMemberNickname());
			return "main";
		}
		return "main";
	}

}
