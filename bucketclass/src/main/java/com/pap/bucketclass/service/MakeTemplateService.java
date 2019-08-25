package com.pap.bucketclass.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.ServiceCategory;
import com.pap.bucketclass.entity.ServiceTemplate;
import com.pap.bucketclass.model.CreateTemplateModel;
import com.pap.bucketclass.repository.MemberRepository;
import com.pap.bucketclass.repository.ServiceCategoryRepository;
import com.pap.bucketclass.repository.ServiceTemplateRepository;

@Service
public class MakeTemplateService{
	
	@Autowired
	private ServiceTemplateRepository serviceTemplateRepo;
	
	@Autowired
	private ServiceCategoryRepository serviceCategoryRepo;
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Transactional
	public void createTemplate(CreateTemplateModel templateModel) {
		ServiceTemplate serviceTemplate = templateModel.toServiceTemplate();
		ServiceCategory serviceCategory = templateModel.toServiceCategory();
		Member member = memberRepo.findByMemberId("quotia72");
		System.out.println(templateModel.toString());
		serviceCategoryRepo.save(serviceCategory);
		serviceTemplate.setServiceIsDelete(false);
		serviceTemplate.setServiceCategory(serviceCategory);
		serviceTemplate.setMember(member);
		serviceTemplateRepo.save(serviceTemplate);
	}
	
}
