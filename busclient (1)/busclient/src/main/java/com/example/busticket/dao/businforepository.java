package com.example.busticket.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.busticket.pojo.Businfo;
import com.example.busticket.pojo.CustomerRegistration;
import com.example.busticket.pojo.Route;



@Qualifier("businforepository")
@Repository
public interface businforepository extends JpaRepository<Businfo,Integer>
{
//	List<Businfo> findBybusid(int s);
	
	
	List<Businfo> findByrouteid(Route r);

	
	
}
