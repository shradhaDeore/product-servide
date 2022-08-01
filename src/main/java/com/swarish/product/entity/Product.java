package com.swarish.product.entity;


import java.util.List;

import lombok.ToString;


@ToString
public class Product {
	
	private long id;
	private String productName;
	private String brandName;
	private int quantity;
   
	public Product() {
		super();
	}
	
	public Product(int id, String productName, String brandName, int quantity) {
		super();
		this.id= id;
		this.productName = productName;
		this.brandName = brandName;
		this.quantity = quantity;
	}
	

   public long getId() {
	   return id;
   }
   
   public void setId(long id) {
	   this.id= id;
   }
   
   public String getProductName() {
	   return productName;
   }
   
   public void setProductName(String productName) {
	   this.productName = productName;
   }
   
   public String getBeandName() {
	   return brandName;
   }
   
   public void setBrandName(String brandName) {
	   this.brandName = brandName;
   }
   
   public int getquantity() {
	   return quantity;
   }
   
   public void setQuantity(int quantity) {
	   this.quantity = quantity;
   }


public static void addAttribute(String string, List<Product> allProducts) {
	// TODO Auto-generated method stub
	
}

public static void addAttribute(String string, Product productById) {
	// TODO Auto-generated method stub
	
}
}