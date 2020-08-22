package Caffe_Sunwoo;

import java.util.Scanner;

public class Cafe {
	Scanner sc = new Scanner(System.in);
	private int water;
	private int shot;
	private int milk;
	private int whipped;
	private int syrup;
	private int balance;

	public Cafe() {
		this.water = 100;
		this.shot = 100;
		this.milk = 100;
		this.whipped = 100;
		this.syrup = 100;
		this.balance = 100000;
	}

	public void Making(String coffee, int price) {
		shot--;
		System.out.println("주문하신 " + coffee + "입니다. " + price + "원 투입해 주세요");
		int pay = Integer.parseInt(sc.nextLine());
		while (pay < price) {
			System.out.println("잔액이 부족합니다.\n" + (price - pay) + "원을 더 투입해 주세요");
			pay += Integer.parseInt(sc.nextLine());
		}
		System.out.println("거스름돈 : " + (pay - price));
		balance += price;
	}

	public void check() {
		System.out.println("오늘 매출은" + balance);
		System.out.println(
				"현재 재고는" + "물 :" + milk + " 샷 :" + shot + " 시럽 :" + syrup + " 물 :" + water + " 휘핑크림 :" + whipped);
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getWhipped() {
		return whipped;
	}

	public void setWhipped(int whipped) {
		this.whipped = whipped;
	}

	public int getSyrup() {
		return syrup;
	}

	public void setSyrup(int syrup) {
		this.syrup = syrup;
	}
}