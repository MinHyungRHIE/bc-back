package com.pap.bucketclass.model;

import java.io.Serializable;

import com.pap.bucketclass.entity.Member;

public class ProviderMyPageModel implements Serializable{
	private String memberPassword;
	private String memberEmail;
	private String memberNickname;
	private String memberImg;
	private String introduce;
	
	
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getMemberImg() {
		return memberImg;
	}
	public void setMemberImg(String memberImg) {
		this.memberImg = memberImg;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	public Member pageMember() {
		Member member = new Member();
		member.setMemberPassword(memberPassword);
		member.setMemberEmail(memberEmail);
		member.setMemberNickname(memberNickname);
		member.setMemberImg(memberImg);
		member.setIntroduce(introduce);
		
		return member;
	}
}
