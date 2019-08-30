package com.pap.bucketclass.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.ProviderMyPageModel;
import com.pap.bucketclass.repository.MemberRepository;

@Service
public class ProviderMyPageService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Transactional
	public Member myPageMember(ProviderMyPageModel providerMypage) {
		Member member = providerMypage.pageMember();
		return null;
	}
	
	@Transactional
	public Member loadMember(String memberId) {
		Optional<Member> member = memberRepo.findById(memberId);
			return member.get();
	}
	
}
