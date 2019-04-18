
public class LuxuryParkingSpace extends ParkingSpace {
	
	private static double HourlyFee=10;
	private static double MonthlyFee=100;
	public LuxuryParkingSpace() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LuxuryParkingSpace(Boolean available, String code) {
		super(available, code);
		// TODO Auto-generated constructor stub
	}
	public LuxuryParkingSpace(Boolean available) {
		super(available);
		// TODO Auto-generated constructor stub
	}
	public LuxuryParkingSpace(String code) {
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	

}
