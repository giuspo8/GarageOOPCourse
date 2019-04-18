
public class NormalParkingSpace extends ParkingSpace {
	
	private static double HourlyFee=5;
	private static double MonthlyFee=50;
	
	public NormalParkingSpace() {
		super();
	}
	
	public NormalParkingSpace(Boolean available, String code) {
		super(available, code);
	}
	
	public NormalParkingSpace(Boolean available) {
		super(available);
	}
	
	public NormalParkingSpace(String code) {
		super(code);
	}

	public static double getHourlyFee() {
		return HourlyFee;
	}

	public static void setHourlyFee(double hourlyFee) {
		HourlyFee = hourlyFee;
	}

	public static double getMonthlyFee() {
		return MonthlyFee;
	}

	public static void setMonthlyFee(double monthlyFee) {
		MonthlyFee = monthlyFee;
	}
	

}
