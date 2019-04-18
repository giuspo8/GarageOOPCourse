
public class Car {
	
	private String brand;
	private double value;
	private double weight;
	private boolean isGpl;
	private String type;
	private ParkingSpace parkingSpace;
	private boolean parked=false;
	
	//constructors
	public Car(String brand, double value, double weight, boolean isGpl, ParkingSpace parkingSpace) {
		this.brand = brand;
		this.value = value;
		this.weight = weight;
		this.isGpl = isGpl;
		this.parkingSpace=parkingSpace;
	}
	
	public Car() {
	}
	
	

	public Car(double value, double weight, boolean isGpl) {
		super();
		this.value = value;
		this.weight = weight;
		this.isGpl = isGpl;
	}

	public Car(String brand, double value) {
		this.brand = brand;
		this.value = value;
	}
	

	public Car(boolean isGpl) {
		this.isGpl = isGpl;
	}
	
	

	public Car(boolean isGpl, String type) {
		this.isGpl = isGpl;
		this.type = type;
	}

	public Car(double value, double weight) {
		super();
		this.value = value;
		this.weight = weight;
	}

	//getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isParked() {
		return parked;
	}

	public void setParked(boolean parked) {
		this.parked = parked;
	}

	public boolean isGpl() {
		return isGpl;
	}

	public void setGpl(boolean isGpl) {
		this.isGpl = isGpl;
	}
	
	
	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	//calcola in tipo in base a peso e valore
	public void setType (double weight,double value) {
		if ((weight>100) && (value<50000)) {
			type="Big";
		}
		else if (value>50000) type="Luxury";
		else type="Normal";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car: type="+type+" ParkingSpace="+parkingSpace;
	}
	
	
	
}
