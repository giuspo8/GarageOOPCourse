import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public abstract class ParkingSpace {
	private Boolean available=true;
	private String code;
	private long arrivalTime;
	private int month; //caso affitto
	boolean rented=false;

	//constructors
	public ParkingSpace() {
	}

	public ParkingSpace(Boolean available) {
		this.available = available;
	}

	public ParkingSpace(String code) {
		this.code = code;
	}
	
	public ParkingSpace(Boolean available, String code) {
		this.available = available;
		this.code = code;
	}
	

	//getters and setters
	public Boolean getAvailable() {
		return available;
	}

	public void setAvalaible(Boolean available) {
		this.available = available;
	}
	

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public long getArrivalTime() {
		return this.arrivalTime;
	}
	

	public void setArrivalTime(long arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	//setta l'orario di arrivo attuale con modalità Epoch in secondi
	public void setArrivalTime() {
		this.arrivalTime = Calendar.getInstance().getTimeInMillis()/1000;
	}

	//cambia lo stato del posto
	public void ChangeState() {
		if (this.available) {
			this.available=false;
		}
		else this.available=true;	
	}

	@Override
	public String toString() {
		return "ParkingSpace: arrival time: "+arrivalTime+" available "+available+" month "+month;
	}
	

}
