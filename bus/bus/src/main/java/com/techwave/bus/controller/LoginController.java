package com.techwave.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import com.techwave.bus.pojo.CustomerRegistration;
import com.techwave.bus.pojo.login;

@Controller
public class LoginController 
{
	@Autowired
	RestTemplate restTemplate;
	static String url="http://localhost:2323/";

	
	@RequestMapping("/login")
	public String bus() 
	{
		//return "NewFile";
		return "Login2";
	}
	
	@RequestMapping("/Logout")
	public String bus1() 
	{
		//return "NewFile";
		return "Login2";
	}
@RequestMapping("register")
	public String Reg() {

		return "Register";
	}
	
@RequestMapping("registerthis")
public String Regthis(@ModelAttribute("U") CustomerRegistration u,
		Model m) 
{
	
	System.out.println(u.getContactno());
	System.out.println(u.getCustomertype());
	System.out.println(u.getGender());
	String w=restTemplate.postForObject(url+"insertuser", u, String.class);	
    m.addAttribute("msg",w);

	return "Register";
}


	@RequestMapping("mainpage")
	public String main(@ModelAttribute("U") login U,
			Model m)
	{
		CustomerRegistration[] user=restTemplate.getForObject(url+"loginuser/"+U.getUsername(), CustomerRegistration[].class);
		CustomerRegistration[] userpass=restTemplate.getForObject(url+"loginpassword/"+U.getPassword(), CustomerRegistration[].class);
		
		if(user.length >0 && userpass.length>0)
		{
		return "Bookticket";
	    }
	    else 
	    {
		    m.addAttribute("msg","insert valid details");
		    return "Login2";
	    }
	}
	
	@RequestMapping("bookingt")
	public String booking(@RequestParam("custid") int id,
			@RequestParam("From") String fromt,
			@RequestParam("To") String Tot,
			@RequestParam("DOB") String DOBt,
			@RequestParam("DOT") String DOTt,
			@RequestParam("NOT") int NOTt,
			Model m)
	{
	String qwcbw=restTemplate.getForObject(url+"Booking/"+fromt+"/"+Tot+"/"+DOTt+"/"+NOTt+"/"+id, String.class);

    m.addAttribute("msg",qwcbw);
		return "Bookticket";
		
	}
	
	@RequestMapping("Bookticket")
	public String Bookticket() 
	{
		return "Bookticket";
	}
	
	@RequestMapping("Updateprofile")
	public String update() 
	{
		return "Updateprofile";
	}
	
	@RequestMapping("Cancelticke")
	public String cancel() 
	{
		
		return "Cancelticket";
	}
	
	@RequestMapping("delete")
	public String canceltic(@RequestParam("tid") String w ,Model m) 
	{
		restTemplate.delete(url+"delete/"+w);
		m.addAttribute("msg","canceled");
		return "Cancelticket";
	}
}