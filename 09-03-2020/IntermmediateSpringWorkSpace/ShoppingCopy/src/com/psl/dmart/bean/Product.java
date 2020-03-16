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
	
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result
//				+ ((productId == null) ? 0 : productId.hashCode());
//		result = prime * result
//				+ ((productName == null) ? 0 : productName.hashCode());
//		result = prime * result
//				+ ((productPrice == null) ? 0 : productPrice.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		if (productId == null) {
//			if (other.productId != null)
//				return false;
//		} else if (!productId.equals(other.productId))
//			return false;
//		if (productName == null) {
//			if (other.productName != null)
//				return false;
//		} else if (!productName.equals(other.productName))
//			return false;
//		if (productPrice == null) {
//			if (other.productPrice != null)
//				return false;
//		} else if (!productPrice.equals(other.productPrice))
//			return false;
//		return true;
//	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + "]";
	}
	
	
	
}
