import kr.or.bit.AirPlane;

public class Ex07_Static_AirPlane {
	public static void main(String[] args) {
		AirPlane air = new AirPlane("�����װ�", 707);
		// air.makeAirPlane(707, "�����װ�");
		air.AirPlaneInfo();
		air.printTotal();

		AirPlane air2 = new AirPlane("�ƽþƴ�", 808);
		// air2.makeAirPlane(808, "�ƽþƳ�");
		air2.AirPlaneInfo();
		air2.printTotal();

		AirPlane air3 = new AirPlane("Ƽ�����װ�", 909);
		// air3.makeAirPlane(909, "�����װ�");
		air3.AirPlaneInfo();
		air3.printTotal();
		
	}
}
