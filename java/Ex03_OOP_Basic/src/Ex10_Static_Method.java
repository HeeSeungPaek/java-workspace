public class Ex10_Static_Method {

	public void method() {
		System.out.println("�� �Ϲ� �Լ� ��.");
	}
	
	public static void smethod() {
		System.out.println("�� Static �Լ� ��.");
	}
	
	public static void main(String[] args) {
		
		smethod();		//����ƽ �޼ҵ�ϱ� �׳� �� �� �ִ�. �����ϸ�
		Ex10_Static_Method.smethod();//�̷��� ���� ��
		
		Ex10_Static_Method e = new Ex10_Static_Method();
		e.method();		//������ �Ϲ� method�� ��ü��(Ŭ������) ���޸𸮿� �ø� ���� ����� �����ϴ�
						//Ŭ���� �̸��� ���� Ÿ���� ��ü�� �ϳ� ������ �Ŀ� �Ϲ��Լ��� �ҷ��;� ��
							
	}

}
