//package com.pap.bucketclass.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.pap.bucketclass.model.CreateTemplateModel;
//import com.pap.bucketclass.service.MakeTemplateService;
//
//@Controller
//public class TemplateController {
//	
//	@Autowired
//	MakeTemplateService makeTemplateService;
//	
//	@RequestMapping(
//			path="/test",
//			method=RequestMethod.GET,
//			produces= {
//					MediaType.APPLICATION_JSON_UTF8_VALUE,
//					MediaType.APPLICATION_ATOM_XML_VALUE
//					}
//			)
////	public CreateTemplateModel create(@RequestBody CreateTemplateModel templateModel) {
////		makeTemplateService.createTemplate(templateModel);
////		return templateModel;
////	}
//	public CreateTemplateModel create(@RequestBody CreateTemplateModel templateModel) {
//		templateModel.toString();
//		return templateModel;
//	}
//}
