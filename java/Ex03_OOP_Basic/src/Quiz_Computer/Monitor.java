package Quiz_Computer;

public class Monitor {

	private String screen;
	private String holder;
	private String mbrand;
	private int mbutton;		//버튼은 1or0으로 설계하자
	
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getMbrand() {
		return mbrand;
	}
	public void setMbrand(String brand) {
		this.mbrand = brand;
	}
	public int getMbutton() {
		return mbutton;
	}
	public void setMbutton(int button) {
		this.mbutton = button;
	}

	
}
