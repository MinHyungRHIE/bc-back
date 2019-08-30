package com.pap.bucketclass.service;

import static com.pap.bucketclass.util.RoleFilter.containRoleByName;

import java.util.Iterator;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.Role;
import com.pap.bucketclass.repository.MemberRepository;

@Service
public class CustomerMyPageService {
	
	@Autowired
	private LocalMemberDetailsService memberDetailsService;
	@Autowired
	private MemberRepository memberRepo;

	@Transactional
	public Member loadMember(String memberId) {
		Member member = (Member) memberDetailsService.loadUserByUsername(memberId);
		System.out.println(memberDetailsService.loadUserByUsername(memberId).getUsername());
		Member found = null;
		if(containRoleByName(member.getRoles(), "ROLE_CUSTOMER")) {
			found = memberRepo.findByMemberId(memberId);
		}else {
			throw new AccessDeniedException("403 error");
		}
		return found;
	}
}
