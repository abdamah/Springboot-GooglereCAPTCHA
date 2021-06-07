package com.riigsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riigsoft.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
