package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pap.bucketclass.support.BooleanToLongConverter;

@Entity
@Table(name="service_registration")
public class ServiceRegistration implements Serializable{
	
	@Id
	@Column(name="service_register_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long serviceRegisterId;
	
	/*
	 * ServiceCreation -- ServiceRegistration
	 */
	@JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_id", nullable = false)
    private ServiceCreation serviceCreation;
	
	@Column(name="service_register_date")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceRegisterDate;
	
	@Column(name="service_register_isActive")
    @Convert(converter = BooleanToLongConverter.class)
	@NotNull
	private Boolean serviceRegisterIsActive;
	
	@Column(name="service_price")
	@NotNull
	private Integer servicePrice;
	
	@Column(name="service_price_description")
	@NotNull
	private String servicePriceDescription;

	public Long getServiceRegisterId() {
		return serviceRegisterId;
	}

	public void setServiceRegisterId(Long serviceRegisterId) {
		this.serviceRegisterId = serviceRegisterId;
	}

	public Date getServiceRegisterDate() {
		return serviceRegisterDate;
	}

	public void setServiceRegisterDate(Date serviceRegisterDate) {
		this.serviceRegisterDate = serviceRegisterDate;
	}

	public Boolean getServiceRegisterIsActive() {
		return serviceRegisterIsActive;
	}

	public void setServiceRegisterIsActive(Boolean serviceRegisterIsActive) {
		this.serviceRegisterIsActive = serviceRegisterIsActive;
	}

	public Integer getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(Integer servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getServicePriceDescription() {
		return servicePriceDescription;
	}

	public void setServicePriceDescription(String servicePriceDescription) {
		this.servicePriceDescription = servicePriceDescription;
	}

	public ServiceCreation getServiceCreation() {
		return serviceCreation;
	}

	public void setServiceCreation(ServiceCreation serviceCreation) {
		this.serviceCreation = serviceCreation;
	}
	
}
