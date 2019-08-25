package com.pap.bucketclass.model;

import java.io.Serializable;

import com.pap.bucketclass.entity.ServiceCategory;
import com.pap.bucketclass.entity.ServiceTemplate;

public class CreateTemplateModel implements Serializable{
	
	private String serviceTitle;
	private String accountBank;
	private String accountNumber;
	private String hashTag;
	private String serviceImgUri;
	private String serviceDescription;
	private String categorySubject;
	private String categoryType;
	private String categoryPeriod;
	private String categoryScale;
	private String categoryPlace;
	
	public String getServiceTitle() {
		return serviceTitle;
	}
	public CreateTemplateModel setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
		return this;
	}
	public String getAccountBank() {
		return accountBank;
	}
	public CreateTemplateModel setAccountBank(String accountBank) {
		this.accountBank = accountBank;
		return this;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public CreateTemplateModel setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}
	public String getHashTag() {
		return hashTag;
	}
	public CreateTemplateModel setHashTag(String hashTag) {
		this.hashTag = hashTag;
		return this;
	}
	public String getServiceImgUri() {
		return serviceImgUri;
	}
	public CreateTemplateModel setServiceImgUri(String serviceImgUri) {
		this.serviceImgUri = serviceImgUri;
		return this;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public CreateTemplateModel setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
		return this;
	}
	public String getCategorySubject() {
		return categorySubject;
	}
	public CreateTemplateModel setCategorySubject(String categorySubject) {
		this.categorySubject = categorySubject;
		return this;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public CreateTemplateModel setCategoryType(String categoryType) {
		this.categoryType = categoryType;
		return this;
	}
	public String getCategoryPeriod() {
		return categoryPeriod;
	}
	public CreateTemplateModel setCategoryPeriod(String categoryPeriod) {
		this.categoryPeriod = categoryPeriod;
		return this;
	}
	public String getCategoryScale() {
		return categoryScale;
	}
	public CreateTemplateModel setCategoryScale(String categoryScale) {
		this.categoryScale = categoryScale;
		return this;
	}
	public String getCategoryPlace() {
		return categoryPlace;
	}
	public CreateTemplateModel setCategoryPlace(String categoryPlace) {
		this.categoryPlace = categoryPlace;
		return this;
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
		serviceTemplate.setHashTag(hashTag);
		serviceTemplate.setServiceImgUri(serviceImgUri);
		serviceTemplate.setServiceDescription(serviceDescription);
		return serviceTemplate;
	}
	@Override
	public String toString() {
//		private String serviceTitle;
//		private String accountBank;
//		private String accountNumber;
//		private String hashTag;
//		private String serviceImgUri;
//		private String serviceDescription;
//		private String categorySubject;
//		private String categoryType;
//		private String categoryPeriod;
//		private String categoryScale;
//		private String categoryPlace;
		return " serviceTitle : " + serviceTitle + "\n accountBank : " + accountBank + "\n accountNumber : " + accountNumber
				+"\n hashTag : " + hashTag + "\n serviceImgUri : " + serviceImgUri + "\n serviceDescription : " + serviceDescription
				+"\n categorySubject : " + categorySubject + "\n categoryType : " + categoryType
				+ "\n categoryPeriod : " + categoryPeriod + "\n categoryScale : " + categoryScale + "\n categoryPlace : " +categoryPlace;
	}
	
	
}
