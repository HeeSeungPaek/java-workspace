/*
	Instance Variable : class Car { private String color; }
	Local Variable : class Car { public void move() {int speed;} } //��� �� �ݵ�� �ʱ�ȭ! (default�� ����)
	main�Լ� �ȿ� ����� ��� ������ : Local Variable //�ݵ�� �ʱ�ȭ
	*Static Variable : �� �� �� �� ( �� ü �� ), ��ü ���� ������ �޸𸮿� �ö󰡴� �ڿ�(class area==method area)

*/
class Variable{
	int iv;	//��ü�� �����Ǹ� ���޸𸮿� ��ü�� �����ǰ�, ��ü �ȿ� int iv == 0 �� ��!
	/*
	 1. member field, instance variable
	 2. Variable v = new Variable(); > heap �޸𸮿� ��ü�� �����Ͽ� ����.(�޸𸮿� �ö󰡾� �� �� �ִ�) >> iv����
	 3. Variable v2 = new Variable(); > heap �޸𸮿� ��ü�� �����Ͽ� ����.(�޸𸮿� �ö󰡾� �� �� �ִ�) >> iv����
	 4. ����ʵ��� ���� : ������ ������ �ϴµ� � ����? : ��������, ��������, ��ǰ���� (���� Ÿ�� : Ŭ����Ÿ�� : ���赵�� ���赵)
	 				  ***�����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�.
	 				   �׷��� ���� �ʱ�ȭ ���� �ʴ´�. > default ���� �ֱ� ����
	 --default : int > 0, double > 0.0, char > ����(�����̽� �� ��==' '), boolean > false, String > Null, Car > null
	 --iv ������ ���� ������ : new��� �����ڸ� ���ؼ� ���� ��ü�� �����ǰ� ���� �ٷ� �����ȴ�.
	 */
	void method() {
		int lv = 0;
		/*
		 Local Variable (�Լ� �ȿ� �ִ� ���� = ���� ����) : ������� �ݵ�� �ʱ�ȭ!
		 �����ֱ� : �Լ� ȣ��Ǹ� ����(Stack ����), �Լ� ���� �� ���� �Ҹ�
		 
		 �Լ� �ȿ� Block Variable
		 for(int i..) > for ���� �� ����..for ���� �� �Ҹ�
		 */
	}
	
	static int cv;
	/*
	����ƽ�� ����?
	1.Class Variable (==Ŭ���� ����), >>>> ������ ǥ�� : Static Variable(***��ü �� ���� �ڿ�***)
	2.������ ����? : ������ ��� �� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�)
	  			  heap ������ ������ [��ü]���� ���� (����)
	3.Ư¡ : ���� ���
			1) class �̸�.static ������ >> variable.cv >> why? ��ü�� ��������� ���� ���� ����
			2) Variable v = new Variable(); >> v.cv
			   Variable v2 = new Variable(); >> v2.cv
			   v.cv == v2.cv (���� �޸� ���� = �ּҸ� ���ؼ� �����ϴ� ���)
			
	4. �������� : Hello.java > javac Hello.java > Hello.class
		>java.exe Hello ���ͷ� ����...
		>class loader System�� ���ؼ�
			Ŭ������ ����(metadata: ����) class area(method area) �ø���.
		--�� Ŭ���� ���� ������� � �ڿ��� import �ϰ� �ְ� ���� �.. ���..
		--�� Ŭ���� �ȿ� static ���� �Ǵ� ����ƽ �޼ҵ� ������
		--�� �༮�� �޸𸮿� 
	*/
}



public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		//Variable v = new Variable();
		//javac Ex05_Variable_Scope.java ������
		//>> Ex05_Variable_Scope.class ����
		//java Ex05_Variable_Scope ����
		
		//1.
		Variable.cv = 100;
		//2.
		Variable v = new Variable();
		System.out.println(v.cv);
		
		Variable v2 = new Variable();
		v2.cv = 500;
		
		System.out.println(Variable.cv);
	}

}
