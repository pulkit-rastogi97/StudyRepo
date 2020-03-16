package com.psl.dmart.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class Product {

	@NotEmpty(message="product Id is empty")
	String productId;
	@NotEmpty(message="product name is empty")
	String productName;
	@NotEmpty(message="product price is empty")
	String productPrice;
	
	public Product() {
		super();
	}
	public Product(String productId, String productName, String productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + "]";
	}
	
	
	
}
