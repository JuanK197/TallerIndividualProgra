package Model;

import java.time.LocalDate;

public class Registred extends Passenger{

	
	private double miles;
	private static float discount = 15;
	private LocalDate dateRegistred;
	
	public Registred(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,
			double miles, LocalDate dateRegistred) {
		super(idPassenger, firstName, lastName, country, dateBirthday);
		this.miles = miles;
		this.dateRegistred = dateRegistred;
	}

	
	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public LocalDate getDateRegistred() {
		return dateRegistred;
	}

	public void setDateRegistred(LocalDate dateRegistred) {
		this.dateRegistred = dateRegistred;
	}
	
	@Override
	public double getTicketCost() {
		
		return 0;
	}

	
}
