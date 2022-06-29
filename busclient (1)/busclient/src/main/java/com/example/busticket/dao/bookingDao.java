package com.example.busticket.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.busticket.pojo.bookinginfo;



@Service
@Qualifier("bookingDao")
public class bookingDao 
{
@Autowired
@Qualifier("bookinginforepository")
bookinginforepository bookinginforepository;
@Autowired
@Qualifier("businforepository")
businforepository businforepository;


public String booktickets(bookinginfo u)
{
	bookinginforepository.save(u);
	return "Tickets booked";
}

public String deleteTicket(String id)
{
	System.out.println("hi");
	List<bookinginfo> U = bookinginforepository.findByticketid(id);
	System.out.println(U.size());
	if (U.size()==0)
	{
		return "Something went wrong";
	} 
	else 
	{
		int no=U.get(0).getBookingIdentity().getBusid();
		//businforepository.save(no);
		System.out.println(no);

		bookinginforepository.deleteAllByticketid(id);
		return "Tickets deleted";
	}
	}

public List<bookinginfo> tickets(String id)
{
	List<bookinginfo> U = bookinginforepository.findByticketid(id);
	return U;
}
}
