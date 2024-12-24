package com.Demo.DemoMapping.EntityLayer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="ordertable")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true )
	private List<OrderItem> items= new ArrayList<>();
	
	@Enumerated(EnumType.STRING)
	private Status status;
	@Positive
	private Double totalAmount;
	@Column(nullable=false)
	private String customerName;
	@Column(nullable=false)
	private String customerphone;
	private LocalDateTime createdAt;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public Order(Long id, List<OrderItem> items, Status status, @Positive Double totalAmount, String customerName,
			String customerphone, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.items = items;
		this.status = status;
		this.totalAmount = totalAmount;
		this.customerName = customerName;
		this.customerphone = customerphone;
		this.createdAt = createdAt;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
