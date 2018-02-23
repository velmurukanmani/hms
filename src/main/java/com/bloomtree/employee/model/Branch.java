package com.bloomtree.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

@Entity
@Table(name="BRANCH")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int key;

	@NotEmpty
	@Column(name = "BRANCH_ID", unique=true, nullable = false)
	private String branchId;
	
	@Size(min=3, max=50)
	@Column(name = "BRANCH_NAME", nullable = false)
	private String branchName;
	
	@Column(name = "COUNTRY", nullable = true)
	private String country;
	
	@Column(name = "STATE", nullable = true)
	private String state;
	
	@Column(name = "ADDRESS", nullable = true)
	private String address;

	@Column(name = "PINCODE")
	private int pincode;
	
	@Column(name = "MOBILE")
	private int mobile;
	
	@Column(name = "STATUS")
	private int status;
	
	@Column(name = "CREATED_BY", nullable = true)
	private String createdBy;
	
	@Column(name = "CREATED_DATE", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate createdDate;
	
	@Column(name = "MODIFIED_BY", nullable = true)
	private String modifiedBy;
	
	@Column(name = "MODIFIED_DATE", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate modifiedDate;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDate getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Branch [key=" + key + ", branchId=" + branchId
				+ ", branchName=" + branchName + ", country=" + country
				+ ", state=" + state + ", address=" + address + ", pincode="
				+ pincode + ", mobile=" + mobile + ", status=" + status
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
}
