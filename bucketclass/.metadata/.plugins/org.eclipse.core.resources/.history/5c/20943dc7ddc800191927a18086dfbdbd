package com.pap.bucketclass.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.ProviderMyPageModel;
import com.pap.bucketclass.repository.MemberRepository;
import com.pap.bucketclass.repository.RoleRepository;

public class ProvideMyPageService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Transactional
	public Member myPageMember(ProviderMyPageModel providerMypage) {
		Member member = providerMypage.pageMember();
		return null;
	}
	
	
}
