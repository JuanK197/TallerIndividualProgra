package Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Fly {

	private String idFly;
	private LocalDate date;
	private LocalTime time;
	
	private Airplane airplane;
	private Target target;
	
	private Passenger passenger;
	
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

	public Fly(String idFly, LocalDate date, LocalTime time, Airplane airplane, Target target,
			ArrayList<Ticket> tickets) {
		super();
		this.idFly = idFly;
		this.date = date;
		this.time = time;
		this.airplane = airplane;
		this.target = target;
		this.tickets = tickets;
		
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	
	public boolean addPassenger(Passenger passenger, short seatNumber) {
		
		return true;
	}
	
	
	public boolean addPassenger(Passenger passenger, short seatNumber, float luggageWeight) {
		
		return true;
	}

	public String getIdFly() {
		return idFly;
	}

	public void setIdFly(String idFly) {
		this.idFly = idFly;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}
	
	public double calcTotal() {
		
		return 0;
	}
	
	public Passenger getLessAge() {
		
		
		return passenger;
	}
	
	public Passenger getGreaterAge() {
		
		return passenger;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	
	
}
