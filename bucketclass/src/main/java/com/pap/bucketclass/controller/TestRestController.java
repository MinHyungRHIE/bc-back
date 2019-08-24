package com.pap.bucketclass.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.model.TestCommand;
import com.pap.bucketclass.service.MemberService;
import com.pap.bucketclass.service.ServiceCreationService;

@Controller
public class TestRestController {

	@Autowired
	ServiceCreationService serviceCreationSerivce;
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(
			path="/test",
			method=RequestMethod.GET,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
					}
			)
//	@ResponseBody
//	public TestCommand test(@RequestBody TestCommand testC) {
//		System.out.println("access to RestController Post-Mapping");
//		
//		return testC;
//	}
	@ResponseBody
	public Set<TestCommand> test() {
		System.out.println("access to RestController Post-Mapping");
//		Long num = new Long(1);
//		ServiceCreation sc = serviceCreationSerivce.AccessService(num);
//		System.out.println(sc.getServiceTitle());
//		System.out.println(sc.getMembers().isEmpty());
//		System.out.println(sc.getServiceAddress().getAddressDetail());
//		System.out.println(sc.getServiceCategory().getCategorySubject());
//		System.out.println(sc.getServiceRegistrations().isEmpty());
		Set<TestCommand> tcs = new HashSet<>();
		tcs.add(new TestCommand().setEmail("sodaisa@naver.com").setName("이민형"));
		tcs.add(new TestCommand().setEmail("bosabi@google.com").setName("김민형"));
		tcs.add(new TestCommand().setEmail("quotia72@hanmail.com").setName("오민형"));
		return tcs;
	}
	
	
	
}
