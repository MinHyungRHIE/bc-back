package com.pap.bucketclass.model;

import javax.persistence.Entity;

@Entity
public class ExpiredServiceModel {
	
//	service_creation	service_id
	private String service_id;
//	service_creation	service_title
	private String service_title;
//	service_creation	service_img_uri
	private String service_img_uri;
//	service_category	category_subject
	private String category_subject;
//	service_registration	service_price
	private String service_price;
//	service_address	address_state
	private String address_state;
//	service_address	address_city
	private String address_city;
//	service_address	address_dong
	private String address_dong;
	
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	public String getService_title() {
		return service_title;
	}
	public void setService_title(String service_title) {
		this.service_title = service_title;
	}
	public String getService_img_uri() {
		return service_img_uri;
	}
	public void setService_img_uri(String service_img_uri) {
		this.service_img_uri = service_img_uri;
	}
	public String getCategory_subject() {
		return category_subject;
	}
	public void setCategory_subject(String category_subject) {
		this.category_subject = category_subject;
	}
	public String getService_price() {
		return service_price;
	}
	public void setService_price(String service_price) {
		this.service_price = service_price;
	}
	public String getAddress_state() {
		return address_state;
	}
	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}
	public String getAddress_city() {
		return address_city;
	}
	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}
	public String getAddress_dong() {
		return address_dong;
	}
	public void setAddress_dong(String address_dong) {
		this.address_dong = address_dong;
	}
	
	
}
