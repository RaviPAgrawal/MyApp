package com.myapp.myapp_dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.myapp.myapp_dao.entity.enums.UserStatusType;

@Entity
@Table(name = "user")
public class User extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5464369837316338488L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "about")
	private String about;
	
	@Column(name = "pic")
	private String pic;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private UserStatusType status;

	@Column(name = "current_location")
	private String currentLocation;

	@Column(name = "current_address")
	private String currentAddress;

	@Column(name = "job_discovery_limit")
	private Integer jobDiscoveryLimit;
	
	@Column(name = "compensation_range")
	private Integer compensationRange;

	@Column(name = "push_notification")
	private Integer pushNotification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public UserStatusType getStatus() {
		return status;
	}

	public void setStatus(UserStatusType status) {
		this.status = status;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Integer getJobDiscoveryLimit() {
		return jobDiscoveryLimit;
	}

	public void setJobDiscoveryLimit(Integer jobDiscoveryLimit) {
		this.jobDiscoveryLimit = jobDiscoveryLimit;
	}

	public Integer getCompensationRange() {
		return compensationRange;
	}

	public void setCompensationRange(Integer compensationRange) {
		this.compensationRange = compensationRange;
	}

	public Integer getPushNotification() {
		return pushNotification;
	}

	public void setPushNotification(Integer pushNotification) {
		this.pushNotification = pushNotification;
	}

}
