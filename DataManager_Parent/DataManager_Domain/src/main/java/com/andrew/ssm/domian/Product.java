package com.andrew.ssm.domian;

import java.util.Date;

public class Product {
	
	private String id;
	private String productNum;
	private String productName;
	private String cityName;
	private Date DepartureTime;
	private String DepartureTimeStr;
	private int productPrice;
	private String productDesc;
	private int productStatus;
	public Product(String id, String productNum, String productName, String cityName, Date departureTime,
			String departureTimeStr, int productPrice, String productDesc, int productStatus) {
		super();
		this.id = id;
		this.productNum = productNum;
		this.productName = productName;
		this.cityName = cityName;
		DepartureTime = departureTime;
		DepartureTimeStr = departureTimeStr;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.productStatus = productStatus;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productNum=" + productNum + ", productName=" + productName + ", cityName="
				+ cityName + ", DepartureTime=" + DepartureTime + ", DepartureTimeStr=" + DepartureTimeStr
				+ ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productStatus=" + productStatus
				+ "]";
	}

		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Date getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(Date departureTime) {
		DepartureTime = departureTime;
	}
	public String getDepartureTimeStr() {
		return DepartureTimeStr;
	}
	public void setDepartureTimeStr(String departureTimeStr) {
		DepartureTimeStr = departureTimeStr;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}
		
		
	
	

}
