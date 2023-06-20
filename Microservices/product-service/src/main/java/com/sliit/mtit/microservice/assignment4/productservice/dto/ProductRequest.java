package com.sliit.mtit.microservice.assignment4.productservice.dto;

public class ProductRequest {

	private String productName;
	private String quantity;
	private Double price;
	private String expiryDate;
	private String manufactureDate;
	
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}
	
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	/**
	 * @return the manufactureDate
	 */
	public String getManufactureDate() {
		return manufactureDate;
	}
	
	/**
	 * @param manufactureDate the manufactureDate to set
	 */
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "ProductRequest [productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ ", expiryDate=" + expiryDate + ", manufactureDate=" + manufactureDate + "]";
	}
	
}
