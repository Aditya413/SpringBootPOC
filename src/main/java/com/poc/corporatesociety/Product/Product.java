package com.poc.corporatesociety.Product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.poc.corporatesociety.ProductCategory.ProductCategory;

@Document(collection = "Products")
public class Product {
	@Id
	private String productId;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String productName;
	private long productPrice;
	private ProductCategory categoryDetails;
	private int quantity;
	
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
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductCategory getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDetails(ProductCategory categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
}
