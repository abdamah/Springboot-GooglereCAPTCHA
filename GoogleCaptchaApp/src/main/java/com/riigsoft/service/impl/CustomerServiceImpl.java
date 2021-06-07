package com.riigsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riigsoft.model.Customer;
import com.riigsoft.repo.CustomerRepository;
import com.riigsoft.service.ICustomerService;
/**
 * @author Abdallah Mahmoud
 * */
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	CustomerRepository repo;

	@Override
	public Integer createCustomer(Customer c) {
		return repo.save(c).getId();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

}
