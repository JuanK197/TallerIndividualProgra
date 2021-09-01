package Model;

import java.time.LocalDate;

public class Ocassional extends Passenger{

	
	private LocalDate dateLastFly;
	
	public Ocassional(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,
			LocalDate dateLastFly) {
		super(idPassenger, firstName, lastName, country, dateBirthday);
		this.dateLastFly = dateLastFly;
	}

	
	public LocalDate getDateLastFly() {
		return dateLastFly;
	}



	public void setDateLastFly(LocalDate dateLastFly) {
		this.dateLastFly = dateLastFly;
	}


	@Override
	public double getTicketCost() {
	double cost = fly.getTarget().getValueTicket();
	
	int year = LocalDate.now().getYear() - fly.getAirplane().getYear();
	
		return year;
	}


}
