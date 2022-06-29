package com.example.busticket.controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.busticket.dao.bookingDao;
import com.example.busticket.dao.businfoDao;
import com.example.busticket.dao.routeDao;
import com.example.busticket.pojo.BookingIdentity;
import com.example.busticket.pojo.Businfo;
import com.example.busticket.pojo.Route;
import com.example.busticket.pojo.bookinginfo;

@RestController
public class availablityController 
{
		
		@Autowired
		bookingDao bookingDao;
		
		@Autowired
		routeDao routeDao;
	
		@Autowired
		businfoDao businfoDao;
		
@GetMapping("/Booking/{from}/{to}/{dot}/{no}/{cusid}")
public String bookingq(
			@PathVariable("dot") String traveldate,
			@PathVariable("from") String fromplace,	
			@PathVariable("no") int nos,
			@PathVariable("cusid") int id,
			@PathVariable("to") String toplace
			) 
	{	
		List<Route> w=routeDao.getfromplace(fromplace);
		List<Route> w1=routeDao.getoplace(toplace);
				
		DateTimeFormatter D=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	DateTimeFormatter D1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate L1=LocalDate.now();
		LocalDate L2=LocalDate.parse(traveldate,D);
		
		int qw=w.get(0).getRouteid();
		int qww=w.get(0).getRouteid();

		int qwb=0;
		int c=0;
		 String x=null;		 
		 
		 int type=0;
		 int price=0;
		 int capacity=0;
        Route r=new Route(qw,fromplace,toplace);
        
if(qw==qww)	
{	
		List<Businfo> qwe=businfoDao.getrouteid(r);
        c=qwe.get(0).getBusid();
        qwb= qwe.get(0).getAvailabletickets();
        x=qwe.get(0).getType();
        type=qwe.get(0).getRegno();
        price=qwe.get(0).getPrice();
        capacity=qwe.get(0).getCapacity();
			if(qwb == 0) 
			{
				return "tickets not avilable";
			} 
			else 
			{
			 BookingIdentity BI	=new BookingIdentity(c,id,L2);
			 String ticketid=id+"bus"+nos;
			 bookinginfo b=new bookinginfo(BI,L1,nos,ticketid);
				bookingDao.booktickets(b);
				int available=qwb-nos;
				Businfo bus=new Businfo(c,x,type,r,price,available,capacity);
				businfoDao.setavailabletickets(bus);
				return "tickets booked";
			}
	}
return null;
	}


@DeleteMapping("delete/{ticketid}")
public void Delete(@PathVariable("ticketid") String id)
{
	try
	{
		List<bookinginfo> no=bookingDao.tickets(id);
		int busid=no.get(0).getBookingIdentity().getBusid();	
		 int nos=no.get(0).getNooftickets();					
			
		 Optional<Businfo> businfo=businfoDao.getbusid(busid);
			int nob=businfo.get().getAvailabletickets();
			
			Route roueid=businfo.get().getRouteid();
			int r=roueid.getRouteid();
			String fromplace=roueid.getFromplace();
			String toplace=roueid.getToplace();
			
			int busidd=businfo.get().getBusid();
			String type=businfo.get().getType();
			int regno=businfo.get().getRegno();
			int price=businfo.get().getPrice();
			int capacity=businfo.get().getCapacity();
			
			System.out.println(r);
			
		int available=nob+nos;
        Route routee=new Route(r,fromplace,toplace);
		
		Businfo bus=new Businfo(busidd,type,regno,routee,price,available,capacity);

		businfoDao.saving(bus);
		
		System.out.println(bus.getBusid());

   bookingDao.deleteTicket(id);
	System.out.println(id);
	}
	
	catch(Exception E) 
	{
		System.out.println("invalid ticketid");
    }	
}
}




