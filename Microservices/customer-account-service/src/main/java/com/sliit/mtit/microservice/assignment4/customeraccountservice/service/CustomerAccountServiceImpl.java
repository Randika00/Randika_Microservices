package com.sliit.mtit.microservice.assignment4.customeraccountservice.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.sliit.mtit.microservice.assignment4.customeraccountservice.dto.CustomerAccountRequest;
import com.sliit.mtit.microservice.assignment4.customeraccountservice.dto.CustomerAccountResponse;
import com.sliit.mtit.microservice.assignment4.customeraccountservice.dto.ProductCreatedRequest;
import com.sliit.mtit.microservice.assignment4.customeraccountservice.dto.ProductCreatedResponse;

@Service
public class CustomerAccountServiceImpl {
	@Autowired
	private RestTemplate restTemplate;
	public CustomerAccountResponse createCustomer(CustomerAccountRequest customerRequest) {
		
		var productCreatedRequest = new ProductCreatedRequest();
		productCreatedRequest.setFirstName(customerRequest.getFirstName());
		productCreatedRequest.setLastName(customerRequest.getLastName());
		productCreatedRequest.setNicNo(customerRequest.getNicNo());
		productCreatedRequest.setEmail(customerRequest.getEmail());
		productCreatedRequest.setPhoneNo(customerRequest.getPhoneNo());
		productCreatedRequest.setAddress(customerRequest.getAddress());
		ResponseEntity<ProductCreatedResponse> productCreatedResponse = restTemplate.postForEntity("http://localhost:8181/product", 
				productCreatedRequest, ProductCreatedResponse.class);
		
		var customerResponse = new CustomerAccountResponse();
		customerResponse.setUserId(UUID.randomUUID().toString());
		customerResponse.setProductId(productCreatedResponse.getBody().getProductId());
		customerResponse.setMessage("Show "+ customerRequest.getFirstName() + " " + customerRequest.getLastName() +"'s product details...");
		return customerResponse;
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
