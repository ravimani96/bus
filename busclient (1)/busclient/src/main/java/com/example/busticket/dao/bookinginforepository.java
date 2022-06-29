package com.example.busticket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.busticket.pojo.Businfo;
import com.example.busticket.pojo.CustomerRegistration;
import com.example.busticket.pojo.Route;
import com.example.busticket.pojo.bookinginfo;



@Qualifier("bookinginforepository")
@Repository
public interface bookinginforepository extends JpaRepository<bookinginfo,Integer>
{
	List<bookinginfo> findByticketid(String s);

	@Modifying
	@Transactional
    @Query("delete from bookinginfo where ticketid = :idw")
	 void deleteAllByticketid(@Param("idw") String s);


}
