class Data{
	int i;
	
}


public class Ex13_Method_Call {
	
	public static void main(String[] args) {
		Data d = new Data();	//d�� �ּҰ� ox12
		d.i = 100;
		System.out.println("d.i: " + d.i);
		
		scall(d);	//�ּҰ��� �޾Ҵ�
		
		
		vcall(d.i); //���� �Ķ���ͷ� �Ѱ�� ������
		System.out.println("d.i: "+d.i);	//111
	}
	
	static void scall(Data sdata) {	//Data Ÿ���� sdata �ּҰ��� �Ķ���ͷ� �޴� �޼ҵ�
		System.out.println("�Լ� : " + sdata.i);
		sdata.i = 111;
	}
	
	static void vcall(int x) {	//�̰� ��Ϻ���, ���� �Ķ���ͷ� ���� ���� ��ü�ּ��� ������ �ƴ� �׳� ���̴�.
		
		System.out.println("before x : " + x);
		x = 8888;	//�Ķ���Ͱ� x�� x�� 8888�� �����Ѱ� ����
		System.out.println("after x : " +  x);
		
	}
	
}
