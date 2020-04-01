package com.spring.boot.product;

public class Product {
   
   private String skuId;
   private String skuName;
   private String price;
   
   
 Product()
 {
	 
 }
 
 
public Product(String skuId, String skuName, String price) {

	this.skuId = skuId;
	this.skuName = skuName;
	this.price = price;
}


public String getSkuId() 
{
	return skuId;
}

public void setSkuId(String skuId) 
{
	this.skuId = skuId;
}

public String getSkuName() 
{
	return skuName;
}

public void setSkuName(String skuName)
{
	this.skuName = skuName;
}

public String getPrice() 
{
	return price;
}

public void setPrice(String price) 
{
	this.price = price;
}
   
}
