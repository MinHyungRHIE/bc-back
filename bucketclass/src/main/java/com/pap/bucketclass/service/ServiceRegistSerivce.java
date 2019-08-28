package com.pap.bucketclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	
}
