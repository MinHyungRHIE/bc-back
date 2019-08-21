package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pap.bucketclass.support.BooleanToIntegerConverter;

@Entity
@Table(name = "member", uniqueConstraints = {@UniqueConstraint(columnNames = {"member_email", "member_nickname"})})
public class Member implements UserDetails, Serializable{
	
	@Id
	@Column(name = "member_id", updatable = false, nullable = false)
	private String memberId;
	
	@JsonIgnore
	@Column(name = "member_password", nullable = false)
	private String memberPassword;
	
	@Email
	@Column(name = "member_email", unique = true, nullable = false)
	private String memberEmail;
	
	@Column(name = "member_nickname", unique = true, nullable = false)
	private String memberNickname;
	
	@Column(name = "member_join_date", nullable = false)
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	private Date memberJoinDate;
	
	@Column(name = "member_img", nullable = true)
	private String memberImg;
	
	@Column(name = "member_isActive", nullable = false)
	@Convert(converter=BooleanToIntegerConverter.class)
	private Boolean memberIsActive;
	
	@Column(name = "career", nullable = true)
	private String career;
	
	@Column(name = "certi", nullable = true)
	private String certi;
	
	@Column(name = "introduce", nullable = true)
	private String introduce;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "member_role",
			joinColumns = @JoinColumn(name = "member_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	private Set<Role> roles = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "members")
    @LazyCollection(LazyCollectionOption.EXTRA)
	private Set<ServiceCreation> serviceCreation = new HashSet<>();

	@Override
	public String getPassword() {
		return memberPassword;
	}
	
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Override
	public String getUsername() {
		return memberId;
	}
	
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public Date getMemberJoinDate() {
		return memberJoinDate;
	}

	public void setMemberJoinDate(Date memberJoinDate) {
		this.memberJoinDate = memberJoinDate;
	}

	public String getMemberImg() {
		return memberImg;
	}

	public void setMemberImg(String memberImg) {
		this.memberImg = memberImg;
	}

	public boolean isMemberIsActive() {
		return memberIsActive;
	}

	public void setMemberIsActive(boolean memberIsActive) {
		this.memberIsActive = memberIsActive;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCerti() {
		return certi;
	}

	public void setCerti(String certi) {
		this.certi = certi;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	@JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : getRoles()) {
            authorities.addAll(role.getPrivileges());
        }
        return authorities;
    }

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	
}