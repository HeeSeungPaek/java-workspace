package Caffe_Sunwoo;

public class Cafe_Coffee extends Cafe {
	public void americano() {
		Making("�Ƹ޸�ī��", 1000);
		setWater(getMilk() - 1);
	}

	public void latte() {
		setMilk(getMilk() - 1);
		Making("��", 2000);
	}

	public void moca() {
		setMilk(getMilk() - 1);
		setWhipped(getWhipped() - 1);
		setSyrup(getSyrup() - 1);
		Making("��ī", 3000);
	}
}