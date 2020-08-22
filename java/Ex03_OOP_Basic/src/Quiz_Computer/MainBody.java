package Quiz_Computer;

public class MainBody {

	private int price;
	private String bbrand;
	private String serialnumber;
	private int cpu;
	private double memorysize;

	private boolean power;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBbrand() {
		return bbrand;
	}

	public void setBbrand(String brand) {
		this.bbrand = brand;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public double getMemorysize() {
		return memorysize;
	}

	public void setMemorysize(double memorysize) {
		this.memorysize = memorysize;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

}
