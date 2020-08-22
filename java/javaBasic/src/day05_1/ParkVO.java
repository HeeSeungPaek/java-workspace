package day05_1;

import day05_1.ParkVO;

public class ParkVO {
	private int inTime;
	private String plateNumber;

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	
	public int getInTime() {
		return this.inTime;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ParkVO) {
			ParkVO p = (ParkVO)obj;
			if(plateNumber.equals(p.plateNumber)) {
				return true;
			}
		}
		return false;
	}
}
