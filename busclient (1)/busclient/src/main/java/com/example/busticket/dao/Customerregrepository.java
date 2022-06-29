package com.example.busticket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.busticket.pojo.CustomerRegistration;



@Qualifier("Customerregrepository")
@Repository
public interface Customerregrepository extends JpaRepository<CustomerRegistration,Integer>
{
	
	List<CustomerRegistration> findByname(String s);
	List<CustomerRegistration> findBypassword(String s);

}
