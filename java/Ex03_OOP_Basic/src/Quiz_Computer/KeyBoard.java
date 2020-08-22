package Quiz_Computer;
import java.util.Scanner;
public class KeyBoard {
	Scanner scanner = new Scanner(System.in);
	private String kbutton;
	private String led;
	private String kbrand;
	public String getKbutton() {
		return kbutton;
	}
	public void setKbutton(String kbutton) {
		this.kbutton = kbutton;
	}
	public String getLed() {
		return led;
	}
	public void setLed(String led) {
		this.led = led;
	}
	public String getKbrand() {
		return kbrand;
	}
	public void setKbrand(String kbrand) {
		this.kbrand = kbrand;
	}
	public String inputBrand(String str) {
		return str;
	}
}