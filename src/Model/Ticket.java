package Model;

public class Ticket{

	private short chairNumber;
	private boolean baggage;
	private float weight;
	
	Fly fly;
	Passenger passenger;
	
	public Ticket(Fly fly, Passenger passenger,short chairNumber, float weight) {
		super();
		this.passenger = passenger;
		this.fly = fly;
		this.chairNumber = chairNumber;
		this.weight = weight;
		
	}

	public Ticket(Fly fly, Passenger passenger, short chairNumber) {
		super();
		this.passenger = passenger;
		this.fly = fly;
		this.chairNumber = chairNumber;
	}

	public short getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(short chairNumber) {
		this.chairNumber = chairNumber;
	}

	public boolean isBaggage() {
		return baggage;
	}

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Fly getFly() {
		return fly;
	}

	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
}
