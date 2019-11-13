package com.example.bike.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purchasePrice;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date purchaseDate;

	private boolean contact;


	public Bike(String name, String email, String phone, String model, String serialNumber, BigDecimal purchasePrice, Date purchaseDate, boolean contact) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.model = model;
		this.serialNumber = serialNumber;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public BigDecimal getPurchacePrice() {
		return purchasePrice;
	}
	public void setPurchacePrice(BigDecimal purchacePrice) {
		this.purchasePrice = purchacePrice;
	}
	public Date getPurchaceDate() {
		return purchaseDate;
	}
	public void setPurchaceDate(Date purchaceDate) {
		this.purchaseDate = purchaceDate;
	}
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
