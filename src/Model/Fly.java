package Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;

import Exceptions.ExceptionDate;

public class Fly {

	private String idFly;
	private LocalDate date;
	private LocalTime time;
	
	private Airplane airplane;
	private Targett target;
	
	private Passenger passenger;
	
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

	public Fly(String idFly, LocalDate date, LocalTime time, Airplane airplane, Targett target,
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

	public void setDate(LocalDate date) throws ExceptionDate{
		if(date.isBefore(LocalDate.now())) {
			
			throw new ExceptionDate("Fecha invalida");
		}
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

	public Targett getTarget() {
		return target;
	}

	public void setTarget(Targett target) {
		this.target = target;
	}
	
	public double calcTotal() {
		
		return 0;
	}
	
	public Passenger getLessAge() {
		
		int younger, older;
		int value=0;
		older = younger = tickets.get(0).getPassenger().getAge();
		
		for(int i = 0; i<tickets.size(); i++) {
			
			
			if(tickets.get(i).getPassenger().getAge()<younger) {
				
				younger= tickets.get(i).getPassenger().getAge();
				value=i;
			}
			
		}
		
		return tickets.get(value).getPassenger();
	}
	
	public Passenger getGreaterAge() {
		
		return passenger;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	
	
}
