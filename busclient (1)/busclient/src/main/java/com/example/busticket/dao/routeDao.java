package com.example.busticket.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.busticket.pojo.CustomerRegistration;
import com.example.busticket.pojo.Route;



@Service
@Qualifier("routeDao")
public class routeDao 
{

@Autowired
@Qualifier("routerepository")
routerepository routerepositoryrepo;


public List<Route> getfromplace(String u)
{
	return routerepositoryrepo.findByfromplace(u);
}

public List<Route> getoplace(String u) 
{
	return routerepositoryrepo.findBytoplace(u);
}

//public List<CustomerRegistration> findpassword(String u) 
//{
//	List<CustomerRegistration> qww=Customerregrepo.findBypassword(u);
//	return qww;
//}


}
