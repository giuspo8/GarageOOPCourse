import java.util.Calendar;

public class Garage {
	private Level[] levels;
	private String name;
	//multa per ogni ora superiore alle 8 ore di sosta
	private static long hourlyFine=5;

	
	//costruttori
	public Garage() {
		super();
	}
	

	public Garage(Level[] levels, String name) {
		super();
		this.levels = levels;
		this.name = name;
	}

	//getters e setters
	public Level[] getLevels() {
		return levels;
	}

	public void setLevels(Level[] levels) {
		this.levels = levels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public long TimeMinutes(ParkingSpace p) {
		//mi ritorna il numero di minuti di sosta
		return (Calendar.getInstance().getTimeInMillis()/1000-p.getArrivalTime())/60;
	}

	public long CalculateFeeHour(Car c) {
		//prima di tutto cambiamo lo stato del parcheggio rimettendolo quindi a free
		c.getParkingSpace().ChangeState();
		//in base a che tipo di parcheggio sia stata parcheggiata l'auto mi calcola 
		//il prezzo del posteggio con eventuale multa
		if (c.getParkingSpace() instanceof BigParkingSpace) {
			return (long) (BigParkingSpace.getHourlyFee()*TimeMinutes(c.getParkingSpace())/60)+CalculateFine(c);
		}
		else if (c.getParkingSpace() instanceof LuxuryParkingSpace) {
			return (long) (LuxuryParkingSpace.getHourlyFee()*TimeMinutes(c.getParkingSpace())/60)+CalculateFine(c);
		}
		else return (long) (NormalParkingSpace.getHourlyFee()*TimeMinutes(c.getParkingSpace())/60)+CalculateFine(c);
	}

	public long CalculateFine(Car c) {
		//calcola la multa
		if ((TimeMinutes(c.getParkingSpace())/60)>8){
			return ((TimeMinutes(c.getParkingSpace())/60)-8)*Garage.hourlyFine;
		}
		else return 0;
	}

	public int getTotalRentedNormal () {
		//ci restituisce il numero di posti affittati di tipo Normal
		int i=0;
		for (Level l:levels) {
			i=i+l.getTotalRentedNormalParkingSpot();
		}
		return i;
	}

	public int getTotalRentedBig () {
		//ci restituisce il numero di posti affittati di tipo Big
		int i=0;
		for (Level l:levels) {
			i=i+l.getTotalRentedBigParkingSpot();
		}
		return i;
	}


	public int getTotalRentedLuxury () {
		//ci restituisce il numero di posti affittati di tipo Luxury
		int i=0;
		for (Level l:levels) {
			i=i+l.getTotalRentedLuxuryParkingSpot();
		}
		return i;
	}

	public int getTotalNormal () {
		//ci restituisce il numero totale di posti di tipo Normal
		int i=0;
		for (Level l:levels) {
			i=i+l.getTotalNormalParkingSpot();
		}
		return i;
	}

	public int getTotalBig () {
		//ci restituisce il numero totale di posti di tipo Big
		int i=0;
		for (Level l:levels) {
			i=i+l.getTotalBigParkingSpot();
		}
		return i;
	}


	public int getTotalLuxury () {
		//ci restituisce il numero totale di posti di tipo Luxury
		int i=0;
		for (Level l:levels) {
			i=i+l.getTotalLuxuryParkingSpot();
		}
		return i;
	}


	public boolean RequestPass(Car c) {
		//ritorna vero se il numero di posti affittati del tipo della macchina
		//è superiore o uguale alla metà di quel tipo
		switch (c.getType()) {
		case "Normal":
			if (getTotalRentedNormal()>=(getTotalNormal()/2))
				return false;
			else
				return true;
		case "Big":
			if (getTotalRentedBig()>=(getTotalBig()/2))
				return false;
			else
				return true;
		case "Luxury":
			if (getTotalRentedLuxury()>=(getTotalLuxury()/2))
				return false;
			else
				return true;
		default:
			return false;
		}
	}

	public boolean GrantAccess(Car c) {
		//ci dà l'accesso al parcheggio
		//per ogni livello 
		for (Level l:levels) {
			//controlla prima se l'auto è gpl
			if ((c.isGpl() && l.getFloor()==1)||(!c.isGpl())) {
				switch (c.getType()) {
				case "Big":
					for (BigParkingSpace b:l.getBigParkingSpaces()) {
						//poi in base al tipo se trova un posto libero 
						if (b.getAvailable()) {
							//cambia lo stato del posto mettendolo quindi a false
							b.ChangeState();
							//setta il posto all'auto con orario d'arrivo
							c.setParkingSpace(b);
							b.setArrivalTime();
							c.setParked(true);
							return true;
						}
					}
					break;

				case "Luxury":
					for (LuxuryParkingSpace b:l.getLuxuryParkingSpaces()) {
						if (b.getAvailable()) {
							b.ChangeState();
							c.setParkingSpace(b);
							b.setArrivalTime();
							c.setParked(true);
							return true;
						}
					}
					break;

				case "Normal":
					for (NormalParkingSpace b:l.getNormalParkingSpaces()) {
						if (b.getAvailable()) {
							b.ChangeState();
							c.setParkingSpace(b);
							b.setArrivalTime();
							c.setParked(true);
							return true;
						}
					}
					break;

				}

			}
		}
		return false;
		
	}
	public boolean GrantPass(Car c) {
		//ci dà l'accesso all'abbonamento
			for (Level l:levels)  {
					switch (c.getType()) {
					case "Big":
						for (BigParkingSpace b:l.getBigParkingSpaces()) {
							if (b.getAvailable()) {
								b.ChangeState();
								c.setParkingSpace(b);
								b.setMonth(Calendar.MONTH);
								b.setRented(true);
								return true;
							}
						}
						break;

					case "Luxury":
						for (LuxuryParkingSpace b:l.getLuxuryParkingSpaces()) {
							if (b.getAvailable()) {
								b.ChangeState();
								c.setParkingSpace(b);
								b.setMonth(Calendar.MONTH);
								b.setRented(true);
								return true;
							}
						}
						break;

					case "Normal":
						for (NormalParkingSpace b:l.getNormalParkingSpaces()) {
							if (b.getAvailable()) {
								b.ChangeState();
								c.setParkingSpace(b);
								b.setMonth(Calendar.MONTH);
								b.setRented(true);
								return true;
							}
						}
						break;

					}

				}
			return false;
	}
	
	
	public double CalculatePass (Car c) {	
		//per prima cosa cambia lo stato del parcheggio riportandolo quindi a false
		c.getParkingSpace().ChangeState();
		//poi calcola in base al tipo il prezzo da pagare per l'affitto
		if (c.getParkingSpace() instanceof BigParkingSpace) {
		return (long) (BigParkingSpace.getMonthlyFee()*(Calendar.MONTH-c.getParkingSpace().getMonth()));
	}
	else if (c.getParkingSpace() instanceof LuxuryParkingSpace) {
		return (long) (LuxuryParkingSpace.getMonthlyFee()*(Calendar.MONTH-c.getParkingSpace().getMonth()));
	}
	else return (long) (NormalParkingSpace.getMonthlyFee()*(Calendar.MONTH-c.getParkingSpace().getMonth()));
	}


}

