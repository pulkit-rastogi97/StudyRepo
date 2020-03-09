package com.psl.bean;

public class Product {

	int productId;
	String productName;
	int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", price=" + price + "]";
	}
	
	
}
