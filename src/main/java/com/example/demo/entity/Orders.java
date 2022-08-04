package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long orderNumber;
	
	private String product;
	private String version;
	private int quantity;
	
	
	@OneToOne(
	        cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
	        fetch = FetchType.LAZY
	        )
	@JoinColumn(name="customer_id")
	private Customer custRel;
	
	public Orders() {
	
	}
	public Orders(String product, String version, int quantity) {
		
		this.product = product;
		this.version = version;
		this.quantity = quantity;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
}
