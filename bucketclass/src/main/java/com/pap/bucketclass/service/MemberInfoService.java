package com.pap.bucketclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.repository.MemberRepository;

@Service
public class MemberInfoService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	public List<Member> checkAllOfData() {
		return memberRepo.findAll();
	}
	
	public Member getMemberObj(String memberId) {
		return memberRepo.findByMemberId(memberId);
	}
}
