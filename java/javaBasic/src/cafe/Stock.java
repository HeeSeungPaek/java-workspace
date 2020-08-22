package cafe;

public class Stock { // ���, �ܰ� ���� Ŭ����

	private  int water;
	private  int milk;
	private  int syrup;
	private  int whipping;
	private  int shot;
	private  int balance;

	Stock() {
		this.water = 1;
		this.milk = 1;
		this.syrup = 1;
		this.whipping = 1;
		this.shot = 1;
		this.balance = 100000;
	}

	public void showStock() {
		System.out.printf("���� ��� >>\n" + "�� : [%d]��, ���� : [%d]��, �÷� : [%d]��, ���� : [%d]��, ��[%d]��, �ܰ� : [%d]�� �Դϴ�\n",
				getWater(), getMilk(), getSyrup(), getWhipping(), getShot(), getBalance());
	}

	public void useAmericano() {
		this.water -= 1;
		this.shot -= 1;
		this.balance += 1000;
	}

	public void useLatte() {
		this.milk -= 1;
		this.shot -= 1;
		this.balance += 2000;
	}

	public void useMoca() {
		this.milk -= 1;
		this.shot -= 1;
		this.syrup -= 1;
		this.whipping -= 1;
		this.balance += 3000;
	}

	public int getMilk() {
		return this.milk;
	}

	// public static void setMilk(int milk) {
	// Stock.milk = milk;
	// }

	public int getWater() {
		return this.water;
	}

	// public static void setWater(int water) {
	// Stock.water = water;
	// }

	public int getSyrup() {
		return this.syrup;
	}

	// public static void setSyrup(int syrup) {
	// Stock.syrup = syrup;
	// }

	public int getWhipping() {
		return this.whipping;
	}

	// public static void setWhipping(int whipping) {
	// Stock.whipping = whipping;
	// }

	public int getShot() {
		return this.shot;
	}

	// public static void setShot(int shot) {
	// Stock.shot = shot;
	// }

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
