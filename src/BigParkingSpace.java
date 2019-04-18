
public class BigParkingSpace extends ParkingSpace {
	
	private static double HourlyFee=7;
	private static double MonthlyFee=70;
	

	public BigParkingSpace() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigParkingSpace(Boolean available, String code) {
		super(available, code);
		// TODO Auto-generated constructor stub
	}
	public BigParkingSpace(Boolean available) {
		super(available);
		// TODO Auto-generated constructor stub
	}
	public BigParkingSpace(String code) {
		super(code);
		// TODO Auto-generated constructor stub
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
