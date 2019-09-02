package com.pap.bucketclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pap.bucketclass.entity.ServiceAddress;
import com.pap.bucketclass.entity.ServiceTemplate;
import com.pap.bucketclass.entity.Services;
import com.pap.bucketclass.model.PostServiceModel;
import com.pap.bucketclass.repository.MemberRepository;
import com.pap.bucketclass.repository.ServiceAddressRepository;
import com.pap.bucketclass.repository.ServiceRepository;
import com.pap.bucketclass.repository.ServiceTemplateRepository;

@Service
public class ServiceRegistSerivce {
	@Autowired
	private ServiceTemplateRepository serviceTemplateRepo;
	
	@Autowired
	private ServiceRepository serviceRepo;
	
	@Autowired
	private ServiceAddressRepository serviceAddressRepo;
	
	@Autowired
	private MemberRepository memberRepo;
		
	@Transactional
	public ServiceTemplate selectOneServiceTemplate(Long serviceTemplateId) {
		return serviceTemplateRepo.findByServiceTemplateId(serviceTemplateId);
	}
	
	@Transactional
	public Services insertServices(PostServiceModel model, Long serviceTemplateId) {
		//There's no relation between services and serviceTemplate, just need data.
		System.out.println(model);
		Services services = new Services();
		services.setNewDataToPostService(model);
		System.out.println("22312312312312312312");
		ServiceTemplate serviceTemplate = serviceTemplateRepo.findByServiceTemplateId(serviceTemplateId);
		System.out.println("32312312312312312312");
		services.setDateFromTemplate(serviceTemplate); 
		System.out.println("42312312312312312312");
		
		ServiceAddress savedServiceAddress = serviceAddressRepo.save(model.toServiceAddress());
		System.out.println("52312312312312312312");
		services.setServiceAddress(savedServiceAddress);
		System.out.println("62312312312312312312");
		services.setServiceRegisterIsActive(true);
		System.out.println("72312312312312312312");
		
		services.setServiceCategory(serviceTemplate.getServiceCategory());
		System.out.println("82312312312312312312");
		services.setMemberId(serviceTemplate.getMember().getUsername());
		System.out.println("92312312312312312312");
		
		return serviceRepo.save(services);
	}
}
