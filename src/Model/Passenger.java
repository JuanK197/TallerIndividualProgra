package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Passenger {


	protected String idPassenger;
	protected String firstName;
	protected String lastName;
	protected String country;
	protected LocalDate dateBirthday;
	protected Fly fly;
	protected ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public Passenger(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
		super();
		this.idPassenger = idPassenger;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.dateBirthday = dateBirthday;
	}

	public LocalDate getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(LocalDate dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public String getIdPassenger() {
		return idPassenger;
	}

	public void setIdPassenger(String idPassenger) {
		this.idPassenger = idPassenger;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public byte getAge() {
		Period period = Period.between(getDateBirthday(), LocalDate.now());
		byte age = (byte) period.getYears();
		return age;
	}
	
	public boolean addToFly(Fly fly, short seatNumber) {
		
		return true;
	}
	
	public boolean addToFly(Fly fly, short seatNumber, float luggageWeight) {
		
		return true;
	}
	
	public double calcOvercrowed() {
		
		return 0;	
	}
	
	public abstract double getTicketCost();
	


	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	
}
