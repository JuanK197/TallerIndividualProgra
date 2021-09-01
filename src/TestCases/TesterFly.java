	package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Exceptions.ExceptionDate;
import Model.Airplane;
import Model.ETypeAirplane;
import Model.Fly;
import Model.Passenger;
import Model.Targett;
import Model.Ticket;

class TesterFly {

	
	  Fly fly; 
	  Fly fly2;
	  Ticket ticket;
	  Ticket ticket2;
	  Airplane airplane;
	  Airplane airplane2;
	  Targett target;
	  Targett target2;
	  ETypeAirplane type;
	  Passenger passenger;
	  Passenger passenger2;
	void setup() {
	   airplane = new Airplane("2121",(short) 21,(short)5, ETypeAirplane.AirbusA330);
	   target = new Targett("465", "Air",(double) 12.5, (float) 4f);
	   
	   airplane2 = new Airplane("2100",(short) 21,(short)5, ETypeAirplane.AirbusA380);
	   target2 = new Targett("477", "Air",(double) 12.5, (float) 4f);
	   
	   ticket = new Ticket(fly, passenger, (short) 4,7);
	   ticket2 = new Ticket(fly2, passenger2, (short) 7,10);
	   ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	   tickets.add(new Ticket(fly, passenger, (short) 4,7));
	   tickets.add(new Ticket(fly2, passenger2, (short) 7,10));
	   fly = new Fly("0101", LocalDate.of(1999, 9, 9),LocalTime.of(10, 40, 9), airplane,target, tickets);
	   
	   
	   
	   
	   
	}
	
	@Test
	void passengerClass() {
		
		setup();
	
		
		assertEquals(21,fly.getLessAge());
		
	}
	    

}
