package com.example.busticket.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.busticket.pojo.Businfo;
import com.example.busticket.pojo.CustomerRegistration;
import com.example.busticket.pojo.Route;



@Service
@Qualifier("bookinginfoDao")
public class businfoDao 
{
@Autowired
@Qualifier("businforepository")
businforepository businforepository;


public List<Businfo> getrouteid(Route r) 
{
			List<Businfo> l=businforepository.findByrouteid(r);
			return  l;
}

public Businfo setavailabletickets(Businfo q) 
{
			Businfo l=businforepository.save(q);
			return  l;
}

public Optional<Businfo> getbusid(int u) 
{
	return  businforepository.findById(u);
}

public List<Businfo> saving(Businfo u) 
{
			Businfo l=businforepository.save(u);
			return  null;
}
}