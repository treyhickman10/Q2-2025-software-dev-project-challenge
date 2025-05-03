package com.btreyhickman.Q2_2025SDPC.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class SalesData {

	@Id
	private Integer orderId;
	private Date orderDate;
	private Integer userId;
	private String productId;
	private Integer quantity;
	private Double price;
	private Double totalAmount;
	private String country;
	private String city;

	public SalesData() {
		// Default constructor
	}

	public SalesData(Integer orderId, Date orderDate, Integer userId, String productId, Integer quantity, Double price, Double totalAmount, String country, String city) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		this.totalAmount = totalAmount;
		this.country = country;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
