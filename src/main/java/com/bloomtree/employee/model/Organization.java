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
@Table(name="ORGANIZATION")
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int key;

	@NotEmpty
	@Column(name = "ORG_ID", unique=true, nullable = false)
	private String orgId;
	
	@Size(min=3, max=50)
	@Column(name = "ORG_NAME", nullable = false)
	private String orgName;
	
	@Column(name = "ABOUT_US", nullable = true)
	private String aboutUs;
	
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

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
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
		return "Organization [key=" + key + ", orgId=" + orgId + ", orgName="
				+ orgName + ", aboutUs=" + aboutUs + ", status=" + status
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
}
