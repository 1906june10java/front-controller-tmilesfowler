package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.model.Customer;
import com.revature.repository.CustomerRepository;
import com.revature.repository.CustomerRepositoryJdbc;

public class CustomerService {
	
	private static final Logger LOGGER = Logger.getLogger(CustomerService.class);
	
	/*
	 * Dependency
	 */
	private CustomerRepository customerRepository = CustomerRepositoryJdbc.getCustomerDaoJdbc();
	
	public List<Customer> listAllCustomers(){
		LOGGER.trace("Entering listing all customers");
		return customerRepository.selectAll();
	}
	
	public boolean register(Customer customer) {
		LOGGER.trace("Registering user: " + customer);
		return customerRepository.insert(customer);
	}
	
	public static void main(String[] args) {
		
	LOGGER.info(new CustomerService().listAllCustomers());
		
	}
	
}
