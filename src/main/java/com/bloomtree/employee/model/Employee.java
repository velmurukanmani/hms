package com.bloomtree.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int key;

	@NotEmpty
	@Column(name = "EMPLOYEE_ID", unique=true, nullable = false)
	private String employeeId;
	
	@NotEmpty
	@Column(name = "ORG_ID", unique=true, nullable = false)
	private String orgId;
	
	@NotEmpty
	@Column(name = "BRANCH_ID", unique=true, nullable = false)
	private String branchId;
	
	@NotEmpty
	@Column(name = "DEPARTMENT_ID", unique=true, nullable = false)
	private String departmentId;
	
	@NotEmpty
	@Column(name = "DESIGNATION_ID", unique=true, nullable = false)
	private String designationId;
	
	@Size(min=3, max=50)
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@Size(min=3, max=50)
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	
	@NotNull
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "DOB", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dob;
	
	@Column(name = "EMAIL", nullable = true)
	private String email;
	
	@Column(name = "MOBILE")
	private int mobile;
	
	@Column(name = "LANDLINE", nullable = true)
	private String landline;
	
	@NotNull
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "JOINING_DATE", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate joiningDate;
	
	@Column(name = "REPORTING_TO", nullable = true)
	private String reportingTo;

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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDesignationId() {
		return designationId;
	}

	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getReportingTo() {
		return reportingTo;
	}

	public void setReportingTo(String reportingTo) {
		this.reportingTo = reportingTo;
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
		return "Employee [key=" + key + ", employeeId=" + employeeId
				+ ", orgId=" + orgId + ", branchId=" + branchId
				+ ", departmentId=" + departmentId + ", designationId="
				+ designationId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dob=" + dob + ", email=" + email + ", mobile="
				+ mobile + ", landline=" + landline + ", joiningDate="
				+ joiningDate + ", reportingTo=" + reportingTo + ", status="
				+ status + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}
	
}
