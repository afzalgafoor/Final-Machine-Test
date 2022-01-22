package com.machinetest.app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Visit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int visitId;
	private String customerName;
	private String contactPerson;
	private int contactNo;
	private String interestedProduct;
	private String visitSubject;
	private String description;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate visitDateTime;
	private boolean isDisabled;
	private boolean isDeleted;
	private int empId;
	
	@ManyToOne
	@JoinColumn(name="empId", insertable = false,updatable = false)
	private Employee employee;

	public Visit() {
		super();
	}

	public Visit(int visitId, String customerName, String contactPerson, int contactNo, String interestedProduct,
			String visitSubject, String description, LocalDate visitDateTime, boolean isDisabled, boolean isDeleted,
			int empId, Employee employee) {
		super();
		this.visitId = visitId;
		this.customerName = customerName;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.interestedProduct = interestedProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDateTime = visitDateTime;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
		this.employee = employee;
	}

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getInterestedProduct() {
		return interestedProduct;
	}

	public void setInterestedProduct(String interestedProduct) {
		this.interestedProduct = interestedProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getVisitDateTime() {
		return visitDateTime;
	}

	public void setVisitDateTime(LocalDate visitDateTime) {
		this.visitDateTime = visitDateTime;
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@JsonBackReference
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
	

}
