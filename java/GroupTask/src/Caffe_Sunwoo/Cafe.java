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
		System.out.println("�ֹ��Ͻ� " + coffee + "�Դϴ�. " + price + "�� ������ �ּ���");
		int pay = Integer.parseInt(sc.nextLine());
		while (pay < price) {
			System.out.println("�ܾ��� �����մϴ�.\n" + (price - pay) + "���� �� ������ �ּ���");
			pay += Integer.parseInt(sc.nextLine());
		}
		System.out.println("�Ž����� : " + (pay - price));
		balance += price;
	}

	public void check() {
		System.out.println("���� ������" + balance);
		System.out.println(
				"���� ����" + "�� :" + milk + " �� :" + shot + " �÷� :" + syrup + " �� :" + water + " ����ũ�� :" + whipped);
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