/*
1. static method : �����ڰ� static �Լ��� ����ٴ� �� - �ǹ� > ���� ����ϴϱ� ���ϰ� ����;.. 
	>> ��ü �������� �ٷιٷ� ���ٴ� ��!
2. Math m = new Math()(x) ... > Math.Random() �����غ� ��ü �������ϰ� �׳� ���ݾ�
   System s = new System()(X)... > System.out.println() �� �ΰ��� ���ø� �����ϸ� ����ƽ�� ���� ���ذ� �ȴ�

�������� ��ƶ�. >> �Ϲ��ڿ�(�ʵ�)�� �Ϲ��ڿ�(�޼ҵ�)���� ���, ����ƽ�� ����ƽ���� ��ƶ�.  
��? ������ �ȳ�����. ����ƽ�� �Ϲ��ڿ��� ���� �� ���� �ִµ�, �� ��Ȳ�� ���ظ� �ϸ� �ȴ�.

*/
class StaticClass{
	
	int iv;			//�ν��Ͻ� �踮���
	
	static int cv;	//����ƽ �踮���
	
	
	
	void m() { //"���� ����"�� ����Ʈ(Ŭ���� ���̸���, �� ���)
		//�Ϲ��Լ�
		//1. iv���� ������ �� �� �ֵ�
		iv = 100;
		//2. cv���� ������ �� �� �ִ�. >> [���� ����]
		//static �ڿ��� �׻� �Ϲ��ڿ����� memory�� ���� ������.
		
		//staticClass.cv = 300;����
		cv = 200;
	}
	
	static void sm() {
		//static �Լ�
		//1. �Ϲ� ���� iv���� ������ �� �� �ִ�. (x) [���� ����]
		//iv = 100; (x)
		cv = 500;
		//error �������� ��ƶ� (static���� ��ƶ�)
	}
	
}
public class Ex09_Static_Method {

	public static void main(String[] args) {

		StaticClass.sm();
		System.out.println(StaticClass.cv); //��ü�� �������� �ʾ������� �ұ��ϰ� static���� ����Ǿ�
											//�޸𸮿� ����Ǿ��� ������ ȣ���� �� �ִ� ���̴�!
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		
	}

}
