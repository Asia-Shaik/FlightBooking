package org.capgemini.flight.service;

import java.util.List;

import org.capgemini.flight.model.Customer;

public interface CustomerService1 {
	public String addCustomer(Customer customer)throws CustomerValidationException;  
	public List<Customer>getCustomer();



	public String deleteCustomer(int id);
	public Customer updateNameById(int id, Customer customer);
	
	
	}
