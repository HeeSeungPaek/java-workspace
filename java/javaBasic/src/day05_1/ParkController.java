package day05_1;

import java.util.ArrayList;

public class ParkController {

	private ArrayList<ParkVO> list;

	public ParkController() {
		list = new ArrayList<>();
	}

	public int size() {
		return list.size();
	}

	public boolean contains(ParkVO p) {
		return list.contains(p);
	}

	public void add(ParkVO p) {
		list.add(p);
	}

	public boolean validateTime(int time) {
		int hour = time / 100;
		int minute = time % 100;

		return (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59);
	}

	public ParkVO get(ParkVO p) {
		int index = list.indexOf(p);
		return list.get(index);
	}

	public void remove(ParkVO p) {
		list.remove(p);
	}
}
