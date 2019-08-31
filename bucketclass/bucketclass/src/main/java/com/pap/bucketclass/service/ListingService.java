package com.pap.bucketclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pap.bucketclass.entity.Services;
import com.pap.bucketclass.repository.ServiceAddressRepository;
import com.pap.bucketclass.repository.ServiceCategoryRepository;
import com.pap.bucketclass.repository.ServiceRepository;

@Service
public class ListingService {
	
	@Autowired
	ServiceAddressRepository serviceAddressRepo;
	
	@Autowired
	ServiceCategoryRepository serviceCategoryRepo;
	
	@Autowired
	ServiceRepository ServiceRepo;
	
    @Transactional(readOnly = true)
    public Page<Services> listPageable(Pageable pageable) {
        return ServiceRepo.findAll(pageable);
    }
	
    @Transactional(readOnly = true)
    public List<Services> listOfService() {
        return ServiceRepo.findAll();
    }
    
    @Transactional(readOnly = true)
    public Services selectOneService(Long serviceId) {
        return ServiceRepo.findByServiceId(serviceId);
    }
    
}
