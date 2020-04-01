package com.spring.boot.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@RequestMapping("api/getproductdetails")
	public List<String> getProduct()
	{
		return service.getProducts();
	}
	
	@RequestMapping("api/getproduct/{id}")
	public Product getProduct(@PathVariable String id)
	{
		return service.getProduct(id);
	}
	@RequestMapping("api")
	String checkAPIPath()
	{
		return "default response for api path";
	}
	
	@RequestMapping("api/getconfigdetails")
	
	public List<Product> getConfigDetails()
	{
		//return "get Config details";
		return service.getconfig();
	}

}
