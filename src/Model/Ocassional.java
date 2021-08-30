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
	
		return 0;
	}


}
