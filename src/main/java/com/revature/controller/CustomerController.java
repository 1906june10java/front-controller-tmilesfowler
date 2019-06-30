package com.revature.controller;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.Customer;
import com.revature.service.CustomerService;

public class CustomerController {
	
	/*
	 * Dependency
	 */
	private static CustomerService customerService = new CustomerService();
	
	public static Object getAllCustomers(HttpServletRequest request) {
		return customerService.listAllCustomers();
		
	}
	
	public static Object register(HttpServletRequest request) {
		if(request.getMethod().equals("GET")) {
			return "register.html";
		}
		
		// At this point it was POST
		
		//You should try to use the request body
		//request.getInputStream()
		
		//String(InputStream)
		
		//return new ObjectMapper().method(string, Customer.class)
		
		customerService.register(new Customer(0, request.getParameter("firstName"), request.getParameter("lastName"), 
				request.getParameter("username"), request.getParameter("password")));
		
		return "Registration_successful";
	}
}
