package com.sliit.mtit.microservice.assignment4.productservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.assignment4.productservice.dto.ProductRequest;
import com.sliit.mtit.microservice.assignment4.productservice.dto.ProductResponse;

@RestController
@RequestMapping("/product")
public class ProductController {

	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
		
		System.out.println("Product Details: " + productRequest);
		
		var productResponse = new ProductResponse();
		productResponse.setProductId(UUID.randomUUID().toString());
		productResponse.setMessage("Successfully added " + productRequest.getProductName() + " Details to the system...");
		
		return productResponse;
	}
}
