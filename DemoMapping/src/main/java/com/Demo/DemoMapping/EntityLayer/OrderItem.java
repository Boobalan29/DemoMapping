package com.Demo.DemoMapping.EntityLayer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class OrderItem {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	
	 @ManyToOne
	 @JoinColumn(name="menu_Item_id",nullable=false)
	 private MenuItem menuItem;
	 
	 @ManyToOne
	 @JoinColumn(name="order_Id",nullable=false)
	 private Order order;
	 @PositiveOrZero
	 private Integer quantity;
	 private Double subtotal;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public OrderItem(Long id, MenuItem menuItem, Order order, @PositiveOrZero Integer quantity, Double subtotal) {
		super();
		this.id = id;
		this.menuItem = menuItem;
		this.order = order;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
