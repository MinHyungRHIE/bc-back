//package com.pap.bucketclass.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.pap.bucketclass.entity.ServiceCategory;
//import com.pap.bucketclass.service.TestService;
//
//@Controller
//public class TestController {
//
//
//	@Autowired
//	private TestService testService;
//
//	@GetMapping("/test")
//	@ResponseBody
//	@RequestMapping(
//			produces= {
//					MediaType.APPLICATION_JSON_UTF8_VALUE,
//					MediaType.APPLICATION_ATOM_XML_VALUE}
//			)
//	public List<ServiceCategory> test() {
//		return testService.totalTest();
//	}
//}
