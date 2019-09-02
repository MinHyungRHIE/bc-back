package com.pap.bucketclass.controller;

import java.security.Principal;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.ServiceTemplate;
import com.pap.bucketclass.entity.Services;
import com.pap.bucketclass.model.CreateTemplateModel;
import com.pap.bucketclass.model.PostServiceModel;
import com.pap.bucketclass.model.QueryServiceModel;
import com.pap.bucketclass.model.ResponseModel;
import com.pap.bucketclass.model.ResultItems;
import com.pap.bucketclass.service.ListingService;
import com.pap.bucketclass.service.MemberService;
import com.pap.bucketclass.service.ServiceRegistSerivce;
import com.pap.bucketclass.service.TemplateService;

@Controller
public class ServicesController {
	
	@Autowired
	MemberService memberService;

	@Autowired
	TemplateService templateService;

	@Autowired
	ListingService listingService; 

	@Autowired
	ServiceRegistSerivce serviceRegistService;

	/*************************
	 * public 기본 실제 서비스 검색 *
	 **************************/
	@RequestMapping(
			path="/service-listing",
			method= RequestMethod.GET)
	public String formServiceList() {
		return "listings-list-full-width";
	}
	
	@RequestMapping(
			path="/service-listing",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody ResultItems<Services> getAllService(
			@RequestBody(required=false)  QueryServiceModel queryModel,
			@RequestParam(
					name="serviceTitle",
					required=false) String serviceTitle,
			@RequestParam(
					name="categorySubject",
					required=false) String categorySubject) {
		int size = 5, page = 1; //default
		//정렬 : (기본) 최근 등록순
		String defaultSort = "serviceModifiedDate";
		if(Optional.ofNullable(serviceTitle).isPresent()){
			System.out.println("param serviceTitle exists");
			queryModel.setServiceTitle(serviceTitle);
		}
		if(Optional.ofNullable(categorySubject).isPresent()) {
			queryModel.setCategorySubject(categorySubject);
		}
		Pageable pageable = PageRequest.of(page - 1, size, Sort.by(defaultSort).descending());
		Page<Services> serviceList = listingService.searchingListAndPageable(queryModel, pageable);
		return new ResultItems<Services>(serviceList.stream().collect(Collectors.toList()), page, size, serviceList.getTotalElements());
	}
	
	@RequestMapping(
			path="/service-listing/{page}",
			method= RequestMethod.GET, //POST로 바꿔야함
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody ResultItems<Services> changePage(
			@PathVariable(
					name="page",
					required=false) String pageStr,
			@RequestBody(required=false) QueryServiceModel queryModel) {
		int size = 5; int page = 1;
		if(pageStr != null) {
			page = Integer.parseInt(pageStr);
		}
		queryModel = Optional.ofNullable(queryModel).orElse(new QueryServiceModel());
		//검색 : 키워드, 카테고리 대분류(1), 소분류(4)
		//정렬 : 최근순, 높은 가격순, 낮은 가격순
		String sortByName = "serviceModifiedDate"; 
		Pageable pageable = PageRequest.of(page - 1, size, Sort.by(sortByName).descending()); //default
		if(queryModel.getOrderBy() != null && queryModel.getOrderBy().equals("최근 등록순")) {
			sortByName = "serviceModifiedDate";
			pageable = PageRequest.of(page - 1, size, Sort.by(sortByName).descending());
		}else if(queryModel.getOrderBy() != null && queryModel.getOrderBy().equals("높은 가격순")) {
			sortByName = "servicePrice";
			pageable = PageRequest.of(page - 1, size, Sort.by(sortByName).descending());
		}else if(queryModel.getOrderBy() != null && queryModel.getOrderBy().equals("낮은 가격순")) {
			sortByName = "servicePrice";
			pageable = PageRequest.of(page - 1, size, Sort.by(sortByName).ascending());
		}
		
		Page<Services> serviceList = listingService.searchingListAndPageable(queryModel, pageable);
		return new ResultItems<Services>(serviceList.stream().collect(Collectors.toList()), page, size, serviceList.getTotalElements());
	}
	/*******************************
	 * [PROVIDER] 개인 실제 서비스 검색 *
	 ********************************/
	
	/*******************
	 * 서비스 템플릿  등록 *
	 ********************/
	@RequestMapping(
			path="/provider/add-service",
			method= RequestMethod.GET)
	public String templateForm() {
		return "dashboard-add-listing";
	}
	
	@RequestMapping(
			path="/provider/add-service",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE	
			})
	public @ResponseBody ResponseModel createTemplate(@RequestBody CreateTemplateModel model, Principal principal) {
		ServiceTemplate getService = templateService.createTemplate(model, principal);
		ResponseModel resModel = new ResponseModel();
		if (getService != null) {resModel.setRes("success");}else{resModel.setRes("fail");}
		return resModel;
	}
	
	/*****************
	 * 서비스 진짜  등록 *
	 ******************/
	@RequestMapping(
			path="/provider/my-template/{serviceTemplateId}/regist",
			method= RequestMethod.GET)
	public String createServiceForm(@PathVariable("serviceTemplateId") Long serviceTemplateId) {
		return "dashboard-registration-listings";
	}
	
	@RequestMapping(
			path="/provider/my-template/{serviceTemplateId}/regist",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody ResponseModel createService(
			@RequestBody PostServiceModel model,
			@PathVariable("serviceTemplateId") Long serviceTemplateId) {
		ResponseModel resModel = new ResponseModel();
		Services service =  serviceRegistService.insertServices(model, serviceTemplateId);
		System.out.println(service);
		if(service !=null) {
			resModel.setRes("success");
		}else {
			resModel.setRes("fail");
		}
		System.out.println(resModel.getRes());
		return resModel;
	}
	
	
	
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////


	/***************************
	 *실제 서비스 검색(리스트 페이지 + 정렬)*
	 ***************************/
//	@RequestMapping(
//			path="/service-listing/{page}",
//			method= RequestMethod.POST,
//			produces= {
//					MediaType.APPLICATION_JSON_UTF8_VALUE,
//					MediaType.APPLICATION_ATOM_XML_VALUE
//			})
//	public @ResponseBody ResultItems<Services> pageableService(
//			@PathVariable("page") int page,
//			@RequestBody QueryServiceModel queryModel) {
//		int size = 3;
//		Pageable pageable = PageRequest.of(page - 1, size, Sort.by("servicePrice").descending());
//		Page<Services> serviceList = listingService.listPageable(pageable);
//		System.out.println(serviceList.getSize());
//		return new ResultItems<Services>(serviceList.stream().collect(Collectors.toList()), page, size, serviceList.getTotalElements());
//	}

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
	
	/*************************************************
	 *제공자 전용 페이지에서 서비스 검색(리스트 페이지 + 정렬)*
	 **************************************************/
	@RequestMapping(
			path="/provider/service-listing",
			method= RequestMethod.GET)
	public String providerServiceListForm() {
		return "my-listing";
	}
	
	@RequestMapping(
			path="/provider/service-listing/{page}",
			method= RequestMethod.POST,
			produces= {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE
			})
	public @ResponseBody ResultItems<Services> pageableService(
			@PathVariable(
                    name = "page",
                    required = false) String pageStr,
			@RequestBody QueryServiceModel queryModel) {
		int size = 3;
		int page = 1; //defaultValue
		if(pageStr != null) {
			page = Integer.parseInt(pageStr);
		}
		Pageable pageable = PageRequest.of(page - 1, size, Sort.by("servicePrice").ascending());
		Page<Services> serviceList = listingService.listPageable(pageable);
		return new ResultItems<Services>(serviceList.stream().collect(Collectors.toList()), page, size, serviceList.getTotalElements());
	}
}
