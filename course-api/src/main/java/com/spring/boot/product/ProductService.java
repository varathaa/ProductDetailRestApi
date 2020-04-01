package com.spring.boot.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private static List<Product> topics = Arrays.asList(
			new Product("COKE","Coca Cola 2L", "100" ),
			new Product("PEPSI","Pepsi 2L", "90" ),
			new Product("7UP","7 UP 2L", "95" ),
			new Product("SPRITE","Sprinte 2L", "110" )
			);
	
	public ArrayList<String> getProducts()
	{
		ArrayList<String> product = new ArrayList();
		 for(Product p: topics )
		 {
			 product.add(p.getSkuId());
		 }
		
		return product;
	}
	
	public List<Product> getconfig()
	{
		 return topics;
	}
	
	public Product getProduct(String skuId)
	{
		Product pd = null;
		for(Product p: topics)
		{
			if(p.getSkuId().equalsIgnoreCase(skuId))
			{
				pd = p;
				break;
			}
		}
		
		return pd;
	}
}

