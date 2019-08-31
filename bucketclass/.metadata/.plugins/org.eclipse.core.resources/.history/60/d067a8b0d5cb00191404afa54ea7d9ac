package com.pap.bucketclass.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pap.bucketclass.entity.ServiceCategory;
import com.pap.bucketclass.entity.ServiceTemplate;

public class CreateTemplateModel implements Serializable{
	
	@JsonProperty("service_title")
	private String serviceTitle;
	
	@JsonProperty("account_bank")
	private String accountBank;
	
	@JsonProperty("account_number")
	private String accountNumber;
	
	@JsonProperty("hashTag")
//	private List<String> hashTag;
	private String hashTag;
	
	@JsonProperty("service_img_uri")
//	private List<String> serviceImgUri;
	private String serviceImgUri;
	
	@JsonProperty("service_description")
	private String serviceDescription;
	
	@JsonProperty("category_subject")
	private String categorySubject;
	
	@JsonProperty("category_type")
	private String categoryType;
	
	@JsonProperty("category_period")
	private String categoryPeriod;
	
	@JsonProperty("category_scale")
	private String categoryScale;
	
	@JsonProperty("category_place")
	private String categoryPlace;
	
	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
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

//	public List<String> getHashTag() {
//		return hashTag;
//	}
//
//	public void setHashTag(List<String> hashTag) {
//		this.hashTag = hashTag;
//	}
//
//	public List<String> getServiceImgUri() {
//		return serviceImgUri;
//	}
//
//	public void setServiceImgUri(List<String> serviceImgUri) {
//		this.serviceImgUri = serviceImgUri;
//	}

	public String getHashTag() {
		return hashTag;
	}

	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}

	public String getServiceImgUri() {
		return serviceImgUri;
	}

	public void setServiceImgUri(String serviceImgUri) {
		this.serviceImgUri = serviceImgUri;
	}
	
	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getCategorySubject() {
		return categorySubject;
	}

	public void setCategorySubject(String categorySubject) {
		this.categorySubject = categorySubject;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getCategoryPeriod() {
		return categoryPeriod;
	}

	public void setCategoryPeriod(String categoryPeriod) {
		this.categoryPeriod = categoryPeriod;
	}

	public String getCategoryScale() {
		return categoryScale;
	}

	public void setCategoryScale(String categoryScale) {
		this.categoryScale = categoryScale;
	}

	public String getCategoryPlace() {
		return categoryPlace;
	}

	public void setCategoryPlace(String categoryPlace) {
		this.categoryPlace = categoryPlace;
	}

	public ServiceCategory toServiceCategory() {
		ServiceCategory serviceCategory = new ServiceCategory();
		serviceCategory.setCategorySubject(categorySubject);
		serviceCategory.setCategoryType(categoryType);
		serviceCategory.setCategoryPeriod(categoryPeriod);
		serviceCategory.setCategoryScale(categoryScale);
		serviceCategory.setCategoryPlace(categoryPlace);
		return serviceCategory;
	}
	
	public ServiceTemplate toServiceTemplate() {
		ServiceTemplate serviceTemplate = new ServiceTemplate();
		serviceTemplate.setServiceTitle(serviceTitle);
		serviceTemplate.setAccountBank(accountBank);
		serviceTemplate.setAccountNumber(accountNumber);
//		serviceTemplate.setHashTag(hashTag);
//		serviceTemplate.setServiceImgUri(serviceImgUri);
		serviceTemplate.setServiceDescription(serviceDescription);
		return serviceTemplate;
	}
	
	@Override
	public String toString() {
		return " serviceTitle : " + serviceTitle + "\n accountBank : " + accountBank + "\n accountNumber : " + accountNumber
				+"\n hashTag : " + hashTag + "\n serviceImgUri : " + serviceImgUri + "\n serviceDescription : " + serviceDescription
				+"\n categorySubject : " + categorySubject + "\n categoryType : " + categoryType
				+ "\n categoryPeriod : " + categoryPeriod + "\n categoryScale : " + categoryScale + "\n categoryPlace : " +categoryPlace;
	}
	
}
