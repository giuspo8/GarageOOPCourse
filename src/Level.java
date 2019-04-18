
public class Level {
	
	private BigParkingSpace[] bigParkingSpaces;
	private NormalParkingSpace[] normalParkingSpaces;
	private LuxuryParkingSpace[] luxuryParkingSpaces;
	private int floor;
	

	//costruttori
	
	public Level(BigParkingSpace[] bigParkingSpaces, NormalParkingSpace[] normalParkingSpaces,
			LuxuryParkingSpace[] luxuryParkingSpaces, int floor) {
		this.bigParkingSpaces = bigParkingSpaces;
		this.normalParkingSpaces = normalParkingSpaces;
		this.luxuryParkingSpaces = luxuryParkingSpaces;
		this.floor = floor;
	}

	public Level(int floor) {
		this.floor = floor;
	}
	
	public Level() {
	}
	
	
	//getters and setters
	public BigParkingSpace[] getBigParkingSpaces() {
		return bigParkingSpaces;
	}

	public void setBigParkingSpaces(BigParkingSpace[] bigParkingSpaces) {
		this.bigParkingSpaces = bigParkingSpaces;
	}

	public NormalParkingSpace[] getNormalParkingSpaces() {
		return normalParkingSpaces;
	}

	public void setNormalParkingSpaces(NormalParkingSpace[] normalParkingSpaces) {
		this.normalParkingSpaces = normalParkingSpaces;
	}

	public LuxuryParkingSpace[] getLuxuryParkingSpaces() {
		return luxuryParkingSpaces;
	}

	public void setLuxuryParkingSpaces(LuxuryParkingSpace[] luxuryParkingSpaces) {
		this.luxuryParkingSpaces = luxuryParkingSpaces;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	//verifica se in base al tipo di auto vi è almeno un posto disponibile nel livello
	public boolean VerifyAvailability(Car c) {
		if (c.getType()=="Big") {
		for (BigParkingSpace s: this.bigParkingSpaces) {
			if (s.getAvailable()) return true;
			}
		}
		else if (c.getType()=="Luxury") {
			for (LuxuryParkingSpace s:this.luxuryParkingSpaces) {
				if (s.getAvailable()) return true;
			}
		}
		else if (c.getType()=="Normal") {
			for (NormalParkingSpace s:this.normalParkingSpaces) {
				if (s.getAvailable()) return true;
			}
		}
		return false;
}
	//i seguenti metodi ritornano il numero di posti totali per ogni categoria
	public int getTotalNormalParkingSpot() {
		int i=0;
		for(NormalParkingSpace n:normalParkingSpaces)
			i++;
		return i;
		}
	
	public int getTotalBigParkingSpot() {
		int i=0;
		for(BigParkingSpace n:bigParkingSpaces)
			i++;
		return i;
		}
	
	public int getTotalLuxuryParkingSpot() {
		int i=0;
		for(LuxuryParkingSpace n:luxuryParkingSpaces)
			i++;
		return i;
		}
	
	//i seguenti metodi ritornano il numero di posti affittati per ogni categoria
	public int getTotalRentedNormalParkingSpot() {
		int i=0;
		for(NormalParkingSpace n:normalParkingSpaces) {
			if (n.isRented()) i++;
		}
		return i;
	}
	
	public int getTotalRentedBigParkingSpot() {
		int i=0;
		for(BigParkingSpace n:bigParkingSpaces) {
			if (n.isRented()) i++;
		}
		return i;
	}
	
	public int getTotalRentedLuxuryParkingSpot() {
		int i=0;
		for(LuxuryParkingSpace n:luxuryParkingSpaces) {
			if (n.isRented()) i++;
		}
		return i;
	}

	@Override
	public String toString() {
		return "Level: Floor"+floor+" Luxury "+getTotalRentedLuxuryParkingSpot()+"/"+getTotalLuxuryParkingSpot()+"/n"
				+" Big "+getTotalRentedBigParkingSpot()+"/"+getTotalBigParkingSpot()+" Normal "+getTotalRentedNormalParkingSpot()+"/"+getTotalNormalParkingSpot();
	}
	
	
}
