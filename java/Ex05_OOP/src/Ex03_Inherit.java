// �ΰ��� ���赵
class Tv { // Tv
	boolean power;
	int ch;

	void power() { // Toggling ��۸� Power
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}

}

class Vcr { // VideoPlayer
	boolean power;

	void power() {
		this.power = !this.power;
	}

	void play() {
		System.out.println("����ϱ�");
	}

	void stop() {
		System.out.println("�����ϱ�");
	}

	void rew() {
	}

	void ff() {
	}
}
//Tv ���赵
//Vcr ���赵

//�䱸���� : Tv�ε� Vcr����� ���Ե� ��ǰ�� ������ּ���!
//�츮�� ��Ӱ� ������ �����.
//class TvVcr extends Tv,Vcr -> ���߻�� ����
//����������� �ؾ��Ѵ� > Vcr extends Tv ... TvVcr extends Vcr(�ڿ����� �̸��� �浹)

// 1��) class TvVcr { Tv t; Vcr v; }
// 2��) class TvVcr { Tv t; Vcr v; }
// 3��) class TvVcr { Tv t; Vcr v; }
// 1��) class TvVcr extends Tv { Vcr v; }
// ���� : �ֱ������ ���� ����(���� ���) ������ ���� Ŭ������ ��� >> ���� �͵��� �������� ����������.. 
// >> ���� �ƴ϶� �Ϲ����� ���..

class TvVcr extends Tv {	//tv�� ��������� vcr�� ���� ���������. >> ��ü��
	Vcr vcr;
	
	TvVcr(){
		vcr = new Vcr();
	}
	
}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("tv�� ���� : " + t.power);
		t.chUp();
		System.out.println("ä�� ���� : " + t.ch);
		
		//����
		t.vcr.power();
		System.out.println("���� ���� : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("tv�� ���� : " + t.power);
		System.out.println("���� ���� : " + t.vcr.power);
	}

}















