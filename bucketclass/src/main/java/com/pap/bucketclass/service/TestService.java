package com.pap.bucketclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.ServiceCategory;
import com.pap.bucketclass.repository.TestCategoryRepository;

@Service
public class TestService {
	
//	@Autowired
//	private TestAddressRepository testAddressRepository;
	
	@Autowired
	private TestCategoryRepository testCategoryRepository;
	
	public List<ServiceCategory> totalTest() {
//		System.out.println(testAddressRepository.findAll().size());
//		System.out.println(testCategoryRepository.findAll().size());
		return testCategoryRepository.findAll();
	}
}
