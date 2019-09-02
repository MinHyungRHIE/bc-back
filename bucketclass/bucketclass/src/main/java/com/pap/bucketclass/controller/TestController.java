package com.pap.bucketclass.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.pap.bucketclass.entity.Role;
import com.pap.bucketclass.entity.Services;
import com.pap.bucketclass.model.ResultItems;
import com.pap.bucketclass.model.TestModel;
import com.pap.bucketclass.service.ListingService;
import com.pap.bucketclass.service.MemberService;
import com.pap.bucketclass.service.ServiceRegistSerivce;
import com.pap.bucketclass.service.TemplateService;

@Controller
public class TestController {
	/*********************
	 *TEST*
	 *********************/

	@Autowired
	MemberService memberService;

	@Autowired
	TemplateService makeTemplateService;

	@Autowired
	ListingService listingService; 
	
	@Autowired
	ServiceRegistSerivce serviceRegistSerivce;

	@RequestMapping(
			path="/test/service-listing",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody ResultItems<Services> likeMethodTester(
			@RequestBody(required=false)  TestModel queryModel) {
		int size = 3, page = 1; //default
		
		System.out.println("--------------------------------");
		System.out.println(queryModel.getServiceTitle());
		System.out.println(queryModel.getServicePrice());
		System.out.println("--------------------------------");
		String searchingServiceTitle = null;
		String searchingServicePrice = null;
		
		//검색 : 키워드, 카테고리 대분류(1)
		if(queryModel != null) { //커멘드 객체가 null이 아니면, 즉 JSON을 받으면
			if(queryModel.getServiceTitle() != null) {
				System.out.println("if");
				searchingServiceTitle = queryModel.getServiceTitle(); //키워드 검색 value
			}if(queryModel.getServicePrice() !=null) {
				searchingServicePrice = queryModel.getServicePrice(); //카테고리 검색 value
			}
		}
		System.out.println("--------------------------------");
		System.out.println(searchingServiceTitle);
		System.out.println(searchingServicePrice);
		System.out.println("--------------------------------");
		
		//정렬 : (기본) 최근 등록순
		String defaultSort = "serviceModifiedDate";
		Pageable pageable = PageRequest.of(page - 1, size, Sort.by(defaultSort).descending());
//		Page<Services> serviceList = listingService.listPageable(pageable);
		Page<Services> serviceList = listingService.searchingListAndPageableTest(searchingServiceTitle, searchingServicePrice, pageable);
		return new ResultItems<Services>(serviceList.stream().collect(Collectors.toList()), page, size, serviceList.getTotalElements());
	}


//	@RequestMapping(
//			value = "/test/uploadFileAndModel",
//			method = RequestMethod.POST)
//	public Role uploadFileAndModel(
//			@RequestParam(required = false) Role role,
//			@RequestParam(required = false) MultipartFile file) {
//		return null;
//	}
//
//
//	@RequestMapping(
//			value = "/test/uploadFileAndModel",
//			method = RequestMethod.POST)
//	public Role uploadFileAndModel2(
//			@ModelAttribute TestModel testModel) {
//		return null;
//	}
}
