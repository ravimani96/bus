package com.example.busticket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.busticket.pojo.CustomerRegistration;
import com.example.busticket.pojo.Route;



@Qualifier("routerepository")
@Repository
public interface routerepository extends JpaRepository<Route,Integer>
{
	
	List<Route> findByfromplace(String s);
	List<Route> findBytoplace(String s);

}
