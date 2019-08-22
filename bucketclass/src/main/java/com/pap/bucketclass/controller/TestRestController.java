package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.ServiceCreation;
import com.pap.bucketclass.service.ServiceCreationService;

@Controller
public class TestRestController {

	@Autowired
	ServiceCreationService serviceCreationSerivce;
	
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
	public ServiceCreation test() {
		System.out.println("access to RestController Post-Mapping");
		Long num = new Long(1);
		ServiceCreation sc = serviceCreationSerivce.AccessService(num);
		System.out.println(sc.getServiceTitle());
		System.out.println(sc.getMembers().isEmpty());
		System.out.println(sc.getServiceAddress().getAddressDetail());
		System.out.println(sc.getServiceCategory().getCategorySubject());
		System.out.println(sc.getServiceRegistrations().isEmpty());
		return sc;
	}
	
	
	
}
