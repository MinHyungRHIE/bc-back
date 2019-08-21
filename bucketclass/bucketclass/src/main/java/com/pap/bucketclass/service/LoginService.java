package com.pap.bucketclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.model.LoginModel;
import com.pap.bucketclass.repository.MemberRepository;

@Service
public class LoginService {

	@Autowired
	private MemberRepository memberRepo;
	@Autowired
	private LoginModel loginModel;
	
	public boolean loginCheck(String memberId, String memberPassword) {
		if(memberRepo.findById(memberId) == null) {
			return false;
		}
		if(!memberRepo.findByPassword(memberPassword).equals(loginModel.getMemberPassword())) {
			return false;
		}
		return true;
	}
	
}
