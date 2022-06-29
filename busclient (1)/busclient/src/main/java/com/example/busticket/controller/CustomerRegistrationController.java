package com.example.busticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.busticket.dao.customerRegistrationDao;
import com.example.busticket.pojo.CustomerRegistration;

@RestController
public class CustomerRegistrationController 
{
	@Autowired
	customerRegistrationDao CustomerRegistrationdao;
	
	@PostMapping("/insertuser")
	public String insertuser(@RequestBody CustomerRegistration u)
	{	
	return CustomerRegistrationdao.insertuser(u);
	}
	
	@PutMapping("/update/{id}")
	public String updateuser(@RequestBody CustomerRegistration u,@PathVariable("id") int id)
	{
	return CustomerRegistrationdao.updateuser(u, id);
	}
	
	@GetMapping("/getUser")
	public List<CustomerRegistration> getAll() 
	{
	return CustomerRegistrationdao.getAll();
	}
	
	@GetMapping("/loginuser/{name}")
	public List<CustomerRegistration> login(@PathVariable("name") String namee) 
	{
	return CustomerRegistrationdao.finduser(namee);
	}
	
	@GetMapping("/loginpassword/{password}")
	public List<CustomerRegistration> loginpass(@PathVariable("password") String pass) 
	{
	return CustomerRegistrationdao.findpassword(pass);
	}

}
