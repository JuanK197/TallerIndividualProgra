package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import Model.Fly;
import Model.Ocassional;
import Model.Passenger;

class TesterOca {

	
	Fly fly;
	Ocassional oca= new Ocassional("","","","",LocalDate.of(1999, 9, 9), null);
	
	
	void setup() {
	
	
	oca.setDateBirthday(LocalDate.of(1999, 9, 9));

	}
	
	
	@Test
	void setDateClass() {
		
		setup();

		assertEquals(21,oca.getAge());
		
	}
	

}
