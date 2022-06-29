package com.example.busticket.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.busticket.pojo.CustomerRegistration;



@Service
@Qualifier("customerRegistrationDao")
public class customerRegistrationDao 
{
@Autowired
@Qualifier("Customerregrepository")
Customerregrepository Customerregrepo;

public String insertuser(CustomerRegistration u) 
{
	Customerregrepo.save(u);
	return "inserted";
}

public String updateuser(CustomerRegistration u,int id)
{
	Optional<CustomerRegistration> U=Customerregrepo.findById(u.getCustid());
	
	if(U.isPresent()) 
	{
	Customerregrepo.save(u);
	return "inserted";
	}
	else 
	{
		return "enter valid customer id";
	}	
}

public List<CustomerRegistration> getAll()
{
	return Customerregrepo.findAll();
}

public List<CustomerRegistration> finduser(String u) 
{
	List<CustomerRegistration> qw=Customerregrepo.findByname(u);
	return qw;
}

public List<CustomerRegistration> findpassword(String u) 
{
	List<CustomerRegistration> qww=Customerregrepo.findBypassword(u);
	return qww;
}

//public CustomerRegistration getuser(int id)
//{
//	Optional<CustomerRegistration> U=Customerregrepo.findById(id);
//	//List<CustomerRegistration> Q=U.stream().filter(w->w.getCustid()==id).collect(Collectors.toList());
////	for(int i=0;i<U.size();i++) {
////		if
////	}
//	//CustomerRegistration u=new CustomerRegistration();
//	//Optional<CustomerRegistration> U=Customerregrepo.findById(id);
//	return U.get();
//}

//public String newupdateuser(CustomerRegistration u)
//{
//	Customerregrepo.save(u);
//	return "updated";
//}
//
//public String booking(CustomerRegistration u)
//{
//	Customerregrepo.save(u);
//	return "inserted";
//}

//public Availability availability(int id)
//{
//	Optional<Availability> U=Customerregrepo.findById(id);
//	return U.get();
//}

}
