package com.pap.bucketclass.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.Role;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.repository.MemberRepository;
import com.pap.bucketclass.repository.RoleRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	public List<Member> checkAllOfData() {
		return memberRepo.findAll();
	}
	
	public Member getMemberObj(String memberId) {
		return memberRepo.findByMemberId(memberId);
	}
	
	public Member insertMember(SignUpModel model) {
		Member member = model.toMember();
		Role role = roleRepo.findByRoleName(model.getRoleName());
		member.setRoles(Stream.of(role).collect(Collectors.toSet()));
		member.setMemberIsActive(true);
		return memberRepo.save(member);
	}
}
