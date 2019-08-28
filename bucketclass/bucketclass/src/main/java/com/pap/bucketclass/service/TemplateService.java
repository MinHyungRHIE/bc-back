package com.pap.bucketclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.ServiceCategory;
import com.pap.bucketclass.entity.ServiceTemplate;
import com.pap.bucketclass.model.CreateTemplateModel;
import com.pap.bucketclass.repository.MemberRepository;
import com.pap.bucketclass.repository.ServiceCategoryRepository;
import com.pap.bucketclass.repository.ServiceTemplateRepository;

@Service
public class TemplateService{
	
	@Autowired
	private ServiceTemplateRepository serviceTemplateRepo;
	
	@Autowired
	private ServiceCategoryRepository serviceCategoryRepo;
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Transactional
	public void createTemplate(CreateTemplateModel templateModel) {
		ServiceCategory serviceCategory = templateModel.toServiceCategory();
		ServiceTemplate serviceTemplate = templateModel.toServiceTemplate();
		serviceTemplate.setServiceCategory(serviceCategoryRepo.save(serviceCategory));
		serviceTemplate.setServiceIsDelete(false);
		serviceTemplate.setMember(memberRepo.findByMemberId("quotia72")); //나중에 세션으로부터 정보를 얻어올 USERNAME
		serviceTemplateRepo.save(serviceTemplate);
	}
	
}
