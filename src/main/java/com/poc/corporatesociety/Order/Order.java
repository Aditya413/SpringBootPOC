package com.poc.corporatesociety.Order;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.poc.corporatesociety.Customer.Customer;
import com.poc.corporatesociety.Product.Product;

@Document(collection = "Orders")
public class Order {
	@Id
	private long orderNo;
	private Customer customerDetails;
	private List<Product> productList;
	private long totalBill;
	private int tableNo;
	
	public long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}
	public Customer getCustomer() {
		return customerDetails;
	}
	public void setCustomer(Customer customer) {
		this.customerDetails = customer;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public long getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(long totalBill) {
		this.totalBill = totalBill;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	
}
