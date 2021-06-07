package com.riigsoft.service;

import java.util.List;

import com.riigsoft.model.Customer;

public interface ICustomerService {

	Integer createCustomer(Customer c);
	
	List<Customer>getAllCustomers();
}
