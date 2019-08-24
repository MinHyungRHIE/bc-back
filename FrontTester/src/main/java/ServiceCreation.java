

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pap.bucketclass.support.BooleanToLongConverter;

@Entity
@Table(name="service_creation")
public class ServiceCreation implements Serializable{ 
	
	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long serviceId;
	
	@Column(name="service_title")
	@NotNull
	private String serviceTitle;
	
	/*
	 * ServiceCreation -- ServiceAddress
	 */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
	private ServiceAddress serviceAddress;
	
	@Column(name="account_bank")
	private String accountBank;
	
	@Column(name="account_number")
	private String accountNumber;
	
	/*
	 * ServiceCreation -- ServiceCategory
	 */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private ServiceCategory serviceCategory;
	
	@Column(name="service_isDelete")
    @Convert(converter = BooleanToLongConverter.class)
	@NotNull
	private Boolean serviceIsDelete;
	
	@Column(name="hashTag")
	private String hashtag; //JSON
	
	@Column(name="service_modified_date")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceModifiedDate;
	
	@Column(name="service_img_uri")
	private String serviceImgUri; //JSON
	
	@Column(name="service_description")
	private String serviceDescription;
	
	/*
	 * json serialize 과정에서 null로 세팅하고자 하면 @JsonIgnore 사용하면 되고, 
	 * 순환참조에 대한 문제를 해결하고자 한다면 부모 클래스측에 @JsonManagedReference를, 
	 * 자식측에 @JsonBackReference를 Annotation에 추가해주면 된다.
	 * 
	 * ServiceCreation -- [member_service_creation] -- Member
	 */
	@JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "member_service_creation",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
	private Set<Member> members = new HashSet<>();

    /*
     * ServiceCreation -- ServiceRegistration
     */
    @JsonBackReference
	@ManyToMany(mappedBy = "serviceCreation")
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Set<ServiceRegistration> serviceRegistrations = new HashSet<>();
    
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

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public Set<Member> getMembers() {
		return members;
	}

	public void setMembers(Set<Member> members) {
		this.members = members;
	}

	public Set<ServiceRegistration> getServiceRegistrations() {
		return serviceRegistrations;
	}

	public void setServiceRegistrations(Set<ServiceRegistration> serviceRegistrations) {
		this.serviceRegistrations  = serviceRegistrations;
	}

	public String getServiceImgUri() {
		return serviceImgUri;
	}

	public void setServiceImgUri(String serviceImgUri) {
		this.serviceImgUri = serviceImgUri;
	}

	
    
}
