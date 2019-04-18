
public class Client {
	
	private String name;
	private String surname;
	private Car car;
	public Client(String name, String surname, Car car) {
		super();
		this.name = name;
		this.surname = surname;
		this.car = car;
	}
	public Client() {
		super();
	}
	
	public Client(Car car) {
		super();
		this.car = car;
	}
	public Client(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
	}
