//package com.pap.bucketclass.controller;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.pap.bucketclass.model.TestCommand;
//import com.pap.bucketclass.service.MemberInfoService;
//
//@Controller
//public class TestRestController {
//
//	@Autowired
//	MemberInfoService memberService;
//	
//	@RequestMapping(
//			path="/test",
//			method=RequestMethod.GET,
//			produces= {
//					MediaType.APPLICATION_JSON_UTF8_VALUE,
//					MediaType.APPLICATION_ATOM_XML_VALUE
//					}
//			)
//	@ResponseBody
//	public Set<TestCommand> test() {
//		System.out.println("access to RestController Get-Mapping");
//
//		Set<TestCommand> tcs = new HashSet<>();
//		tcs.add(new TestCommand().setEmail("sodaisa@naver.com").setName("이민형"));
//		tcs.add(new TestCommand().setEmail("bosabi@google.com").setName("김민형"));
//		tcs.add(new TestCommand().setEmail("quotia72@hanmail.com").setName("오민형"));
//		return tcs;
//	}
//	
//	
//	
//}
