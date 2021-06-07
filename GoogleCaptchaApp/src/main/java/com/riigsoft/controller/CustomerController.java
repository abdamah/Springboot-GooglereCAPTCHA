package com.riigsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.riigsoft.model.Customer;
import com.riigsoft.service.ICustomerService;
import com.riigsoft.validate.CaptchaValidator;
/**
 * @author Abdallah Mahmoud
 * */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@Autowired
	private CaptchaValidator validate;
	
	//1.show form
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("customer", new Customer());
		return "CustomerRegister";
	}
	
	//2.save customer to db
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute Customer c,	
			@RequestParam("g-recaptcha-response") String captcha,
			Model model) {
	
		if(validate.isValid(captcha)) {
			Integer id = service.createCustomer(c);
			model.addAttribute("message","Customer '"+id+"' Save successfully...");
		
			model.addAttribute("customer", new Customer());
		}else {
			model.addAttribute("message","Try Again");
			
		}
				
			
		
		return "CustomerRegister";
	}
	
	//3.get all customers
	@GetMapping("/all")
	public String getAll(Model model) {
		List<Customer> list = service.getAllCustomers();
		
		model.addAttribute("list", list);
		return "CustomerData";
	}
	
	
}
