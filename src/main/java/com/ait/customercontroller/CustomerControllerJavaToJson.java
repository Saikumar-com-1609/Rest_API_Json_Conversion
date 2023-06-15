package com.ait.customercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.Customer;

@RestController
public class CustomerControllerJavaToJson {
	
	@GetMapping("/")
	public Customer getCustomerDetails() {
		Customer c = new Customer();
		c.setId(101);
		c.setName("raju");
		c.setDept("devops");
		c.setPhno(48454754549L);
		
		return c;
		
	}

}
