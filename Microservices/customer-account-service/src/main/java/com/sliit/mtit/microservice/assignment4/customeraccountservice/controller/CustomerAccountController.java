package com.sliit.mtit.microservice.assignment4.customeraccountservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.assignment4.customeraccountservice.dto.CustomerAccountRequest;
import com.sliit.mtit.microservice.assignment4.customeraccountservice.dto.CustomerAccountResponse;
import com.sliit.mtit.microservice.assignment4.customeraccountservice.service.CustomerAccountServiceImpl;

@RestController
@RequestMapping("/customer_account")
public class CustomerAccountController {
	
	@Autowired
	private CustomerAccountServiceImpl customerAccountService;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody CustomerAccountResponse createCustomer(@RequestBody CustomerAccountRequest customerRequest) {
		
		System.out.println("Customer Account Details: " + customerRequest);		
		return customerAccountService.createCustomer(customerRequest);
	}
}
