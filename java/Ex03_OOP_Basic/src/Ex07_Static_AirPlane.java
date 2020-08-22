import kr.or.bit.AirPlane;

public class Ex07_Static_AirPlane {
	public static void main(String[] args) {
		AirPlane air = new AirPlane("대한항공", 707);
		// air.makeAirPlane(707, "대한항공");
		air.AirPlaneInfo();
		air.printTotal();

		AirPlane air2 = new AirPlane("아시아니", 808);
		// air2.makeAirPlane(808, "아시아나");
		air2.AirPlaneInfo();
		air2.printTotal();

		AirPlane air3 = new AirPlane("티웨이항공", 909);
		// air3.makeAirPlane(909, "대한항공");
		air3.AirPlaneInfo();
		air3.printTotal();
		
	}
}
