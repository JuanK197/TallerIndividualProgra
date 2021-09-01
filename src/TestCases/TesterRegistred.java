package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Model.Airplane;
import Model.ETypeAirplane;
import Model.Fly;
import Model.Ocassional;
import Model.Registred;
import Model.Targett;

class TesterRegistred {

	Registred regis;
	void setup() {
		regis = new Registred("", "","", "", null, 0, null);
		Targett tar = new Targett("", "", 4000, 9); 
		 Fly fly = new Fly("", null ,null, null,null, null);
			

			//System.out.println(fly.getDate());
			
			
			tar.setValueTicket(4000);
			Airplane air = new Airplane("", (short ) 0, (short) 1999, ETypeAirplane.AirbusA330);
			air.setYear((short) 1999);
			System.out.println(regis.getTicketCost());
		
	}



	
	
	
	@Test
	void setDateClass() {
		
		setup();

		assertEquals(1500,regis.getTicketCost());
		
	}
}
