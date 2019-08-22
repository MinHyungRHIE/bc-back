package com.pap.bucketclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.ServiceCreation;
import com.pap.bucketclass.repository.ServiceCreationRepository;

@Service
public class ServiceCreationService {
	
	@Autowired
	private ServiceCreationRepository serviceCreationRepo;
	
	public ServiceCreation AccessService(Long service_id) {
		return serviceCreationRepo.findByServiceId(service_id);
	}
}
