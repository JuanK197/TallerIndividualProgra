package Model;

import java.time.LocalDate;

public class Registred extends Passenger{

	
	private double miles;
	public static float discount = 15;
	private LocalDate dateRegistred;
	
	public Registred(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,
			double miles, LocalDate dateRegistred) {
		super(idPassenger, firstName, lastName, country, dateBirthday);
		this.miles = miles;
		this.dateRegistred = dateRegistred;
		discount = 15;
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
		
		double ticket = fly.getTarget().getValueTicket();
		
		double date = LocalDate.now().getYear() - fly.getAirplane().getYear();
		
		if(date <= 10 ) {
			return date - (ticket*Registred.discount/100);
			
		}
		
		return date - (ticket*Registred.discount/100) - ticket*0.1;
	}


	
	
	

	
}
