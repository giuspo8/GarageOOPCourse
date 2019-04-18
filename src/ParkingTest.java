
import java.util.Calendar;


public class ParkingTest {

	public static void main(String[] args) {
		
		BigParkingSpace[] p0=new BigParkingSpace[5];
		for (int i=0;i<5;i++) {
			p0[i]=new BigParkingSpace();
		}
		BigParkingSpace[] p1=new BigParkingSpace[6];
		for (int i=0;i<6;i++) {
			p1[i]=new BigParkingSpace();
		}
		BigParkingSpace[] p2=new BigParkingSpace[4];
		for (int i=0;i<4;i++) {
			p2[i]=new BigParkingSpace();
		}
		LuxuryParkingSpace[] x0=new LuxuryParkingSpace[3];
		for (int i=0;i<3;i++) {
			x0[i]=new LuxuryParkingSpace();
		}
		LuxuryParkingSpace[] x1=new LuxuryParkingSpace[2];
		for (int i=0;i<2;i++) {
			x1[i]=new LuxuryParkingSpace();
		}
		LuxuryParkingSpace[] x2=new LuxuryParkingSpace[4];
		for (int i=0;i<4;i++) {
			x2[i]=new LuxuryParkingSpace();
		}
		NormalParkingSpace[] m0=new NormalParkingSpace[7];
		for (int i=0;i<7;i++) {
			m0[i]=new NormalParkingSpace();
		}
		NormalParkingSpace[] m1=new NormalParkingSpace[8];
		for (int i=0;i<8;i++) {
			m1[i]=new NormalParkingSpace();
		}
		NormalParkingSpace[] m2=new NormalParkingSpace[5];
		for (int i=0;i<5;i++) {
			m2[i]=new NormalParkingSpace();
		}
		
		Level[] l=new Level[3];
		l[0]=new Level(p0,m0,x0,0);
		l[1]=new Level(p1,m1,x1,1);
		l[2]=new Level(p2,m2,x2,2);
		System.out.println(l[0].getTotalBigParkingSpot());
		System.out.println(l[0].getTotalRentedBigParkingSpot());
		Garage garage=new Garage(l,"Grand Garage");
		//System.out.println(l);
		Car c=new Car(true);
		Car c1=new Car(false);
		//da qui in poi tutte car di tipo gpl e normal
		Car c2=new Car(true,"Normal");
		Car c3=new Car(true,"Normal");
		Car c4=new Car(true,"Normal");
		Car c5=new Car(true,"Normal");
		Car c6=new Car(true,"Normal");
		Car c7=new Car(true,"Normal");
		Car c8=new Car(true,"Normal");
		Car c9=new Car(true,"Normal");
		Car c10=new Car(true,"Normal");
		Car c11=new Car(true,"Normal");
		Car c12=new Car(true,"Normal");
		Car c13=new Car(true,"Normal");
		Car c14=new Car(true,"Normal");
		Car c15=new Car(true,"Normal");
		Car c16=new Car(true,"Normal");
		Car c17=new Car(true,"Normal");
		Car c18=new Car(true,"Normal");
		Car c19=new Car(true,"Normal");
		Car c20=new Car(true,"Normal");
		Car c21=new Car(true,"Normal");
		Car c22=new Car(true,"Normal");
		Car c23=new Car(true,"Normal");
		Car c24=new Car(true,"Normal");
		Car c25=new Car(true,"Normal");
		c1.setType("Big");
		c.setType(1000, 50200);
		
		if (garage.RequestPass(c)&&garage.GrantPass(c)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c1)&&garage.GrantPass(c1)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c2)&&garage.GrantPass(c2)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c3)&&garage.GrantPass(c3)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c4)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c5)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c6)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c7)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c8)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c9)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c10)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c11)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c12)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.GrantAccess(c13)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c14)&&garage.GrantPass(c14)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c15)&&garage.GrantPass(c15)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c16)&&garage.GrantPass(c16)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c17)&&garage.GrantPass(c17)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c18)&&garage.GrantPass(c18)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c19)&&garage.GrantPass(c19)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c20)&&garage.GrantPass(c20)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c21)&&garage.GrantPass(c21)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c22)&&garage.GrantPass(c22)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c23)&&garage.GrantPass(c23)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c24)&&garage.GrantPass(c24)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		if (garage.RequestPass(c25)&&garage.GrantPass(c25)) {
			System.out.println("Parcheggio effettuato");
		}
		else System.out.println("error");
		
		
		c10.getParkingSpace().setArrivalTime(1555531200);
		System.out.println(garage.CalculateFeeHour(c10));
		

		c4.getParkingSpace().setMonth(0);
		System.out.println(c4.getParkingSpace().getMonth());
		System.out.println(Calendar.MONTH);
		System.out.println(garage.CalculatePass(c4));
		
	}
}
