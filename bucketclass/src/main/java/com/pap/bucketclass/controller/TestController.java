package com.pap.bucketclass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.Services;
import com.pap.bucketclass.model.PostServiceModel;
import com.pap.bucketclass.model.CreateTemplateModel;
import com.pap.bucketclass.model.RequestModel;
import com.pap.bucketclass.model.ResponseModel;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.service.ListingService;
import com.pap.bucketclass.service.MemberService;
import com.pap.bucketclass.service.ServiceRegistSerivce;
import com.pap.bucketclass.service.TemplateService;

@Controller
public class TESTController {


	@Autowired
	MemberService memberService;

	@Autowired
	TemplateService makeTemplateService;

	@Autowired
	ListingService listingService; 
	
	@Autowired
	ServiceRegistSerivce serviceRegistSerivce;
	
	/***********
	 *로그인 테스트*
	 ***********/
	@RequestMapping(
			value="/login",
			method=RequestMethod.GET
			)
	public String loginForm() {
		return "login";
	}

	/*************
	 *회원가입 테스트*
	 *************/
	@RequestMapping(
			path="/signup",
			method=RequestMethod.GET
			)
	public String signUpForm() {
		return "index";
	}

	@RequestMapping(
			path="/signup",
			method=RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody ResponseModel create(@RequestBody SignUpModel model) {
		System.out.println(model.toString());
		ResponseModel resObj = new ResponseModel();
		try {
			Member member = memberService.insertMember(model);
			resObj.setRes("success");
			return resObj;
		}catch(Exception e) {
			resObj.setRes("fail");
			return resObj;
		}
	}

	/********************
	 *서비스 템플릿 등록 테스트*
	 ********************/
	@RequestMapping(
			path="/template-register",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody CreateTemplateModel createTemplate(@RequestBody CreateTemplateModel model) {
		makeTemplateService.createTemplate(model);
		return model;
	}

	/*******************
	 *서비스 실제  등록 테스트*
	 *******************/
	@RequestMapping(
			path="/service-register",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody PostServiceModel createService(@RequestBody PostServiceModel model) {
		System.out.println(model.toString());
		return model;
	}

	/********************
	 *실제 서비스 검색 테스트*
	 ********************/
	@RequestMapping(
//			path="/service-listing/{page}",
			path="/service-listing",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody List<Services> getAllService() {
		return listingService.listOfService();
	}
	
	
//	public @ResponseBody QueryServiceModel getAllService(
//			@PathVariable int page,
//			@RequestBody QueryServiceModel queryModel) {
//		int size = 3;
//		Pageable pageable = PageRequest.of(page - 1, size, Sort.by("service_price").descending());
//		Page<ServiceListModel> todoList = listingService.listOfTodo(pageable);
//
//		modelMap.put("items", todoList.stream().collect(Collectors.toList()));
//		modelMap.put("page", page);
//		modelMap.put("size", size);
//		modelMap.put("totalCount", todoList.getTotalElements());
//		return queryModel;
//	}

	/*********************
	 *Request Model 테스트*
	 *********************/
	@RequestMapping(
			path="/rmtest",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody RequestModel reqTest(@RequestBody RequestModel model) {
		System.out.println(model.toString());
		return model;
	}

	@RequestMapping(
			path="/rmtest/test",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody List<Member> reqTest2(@RequestBody RequestModel model) {
		return memberService.selectAll();
	}
}
