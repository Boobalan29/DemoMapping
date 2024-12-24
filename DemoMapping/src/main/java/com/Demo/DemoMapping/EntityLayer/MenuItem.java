package com.Demo.DemoMapping.EntityLayer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Positive
	private Double price;
	
	@PositiveOrZero
	private Integer availableQuantity;
	
	@Enumerated(EnumType.STRING)
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public MenuItem(Long id, String name,  Double price, Integer availableQuantity,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.category = category;
	}

	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
