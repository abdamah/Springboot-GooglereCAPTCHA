package com.riigsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String gender;
	private Integer age;
	private String address;
}
