package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="service_creation")
public class ServiceCreation implements Serializable { 
	
	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long serviceId;
	
	@Column(name="service_title")
	@NotNull
	private String serviceTitle;
	
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
	private ServiceAddress serviceAddress;
	
	@Column(name="account_bank")
	private String accountBank;
	
	@Column(name="account_number")
	private String accountNumber;
	
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    ServiceCategory serviceCategory;
	
	@Column(name="service_isDelete")
	@NotNull
	private Boolean serviceIsDelete;
	
	@Column(name="hashTag")
	private String hashtag; //JSON
	
	@Column(name="service_modified_date")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceModifiedDate;
	
	@Column(name="service_img_url")
	private String serviceImgUrl; //JSON
	
	@Column(name="service_description")
	private String serviceDescription;
	
	//member_id String
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "member_service_creation",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
	private Set<ServiceCategory> members = new HashSet<>();

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public ServiceAddress getServiceAddress() {
		return serviceAddress;
	}

	public void setServiceAddress(ServiceAddress serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public String getAccountBank() {
		return accountBank;
	}

	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public ServiceCategory getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(ServiceCategory serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public Boolean getServiceIsDelete() {
		return serviceIsDelete;
	}

	public void setServiceIsDelete(Boolean serviceIsDelete) {
		this.serviceIsDelete = serviceIsDelete;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public Date getServiceModifiedDate() {
		return serviceModifiedDate;
	}

	public void setServiceModifiedDate(Date serviceModifiedDate) {
		this.serviceModifiedDate = serviceModifiedDate;
	}

	public String getServiceImgUrl() {
		return serviceImgUrl;
	}

	public void setServiceImgUrl(String serviceImgUrl) {
		this.serviceImgUrl = serviceImgUrl;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public Set<ServiceCategory> getMembers() {
		return members;
	}

	public void setMembers(Set<ServiceCategory> members) {
		this.members = members;
	}
	
    
}
