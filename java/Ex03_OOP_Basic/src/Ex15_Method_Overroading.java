class Human2 {
	String name;
	int age;
}

class Test2 {

	Human2 add(Human2 h) {
		h.name = "�����";
		h.age++;
		return h;
	}

	void add(Human2 h, Human2 h2) {
		h.name = "��â��";
		h.age = 20;

		h2.name = "�����";
		h2.age = 50;
	}

	void printHuman(Human2 h) {	//���� ���� �Ķ������ �̸��� ����ϴ� �޼ҵ�
		String str = h.name;
		System.out.println(str);
	}
	
	void printHuman(Human2 h1, Human2 h2, Human2 h3) {	//���� ���� 3���� ����� �̸��� ����ϴ� ��.
		String str = h1.name;
		String str2 = h2.name;
		String str3 = h3.name;
		System.out.println("��� ����� �̸��� ���| " +"ù��° : " + str);
		System.out.println("��� ����� �̸��� ���| " +"�ι�° : " + str2);
		System.out.println("��� ����� �̸��� ���| " +"����° : " + str3);
	}
	

}

public class Ex15_Method_Overroading {

	public static void main(String[] args) {

		Test2 t2 = new Test2();
		Human2 human1 = new Human2();
		Human2 human2 = new Human2();
		Human2 human3 = new Human2();

		t2.add(human1); // Human2 Ÿ���� human1 ��ü�� �̸��� ���̸� �߰��ϴ� �޼ҵ�.
		System.out.println("human1�� �̸��� ���̸� �߰�| �̸�:  " + human1.name + ", ����: " + human1.age);

		t2.add(human2, human3);	//���� ������ �Ѹ��� ������ �ٲٴ°ͺ��� 2���� ������ �ٲ��ְ�;�.
		System.out.println("human2�� �̸��� ���̸� �߰�| �̸�:  " + human2.name + ", ����: " + human2.age);
		System.out.println("human3�� �̸��� ���̸� �߰�| �̸�:  " + human3.name + ", ����: " + human3.age);

		t2.printHuman(human1);		//������� �̸��� ����Ѵ�
		t2.printHuman(human2);
		t2.printHuman(human3);
		
		t2.printHuman(human2, human3, human1);
	}

}



/*
 
//������� �Ͻ� ��
class Human2{
	String name;
	int age;
}

class Test2{
	  Human2 add(Human2  h) {
		  //�ڵ� ������� ����
		    h.name = "�ƹ���";
			h.age = 200;
			return h ;
	  }
	  
	  Human2 add(Human2 h , Human2 h2) {
		  //�ڵ� ������� ����
			h2.name = h.name;
			h2.age = h.age;
			return h2;
	  }
}
public class Ex15_Method_Overloading {
	public static void main(String[] args) {
		//� �ڵ� ..... add �Լ��� ���� .... error �� �ȳ��� 
		//������ ���	
		Test2 t = new Test2();
		Human2 man = new Human2();
		
		Human2 man2 = t.add(man);
		System.out.println(man2.name);
		System.out.println(man2.age);
		
		System.out.println(man == man2);
		System.out.println(man.age  +" / " + man.name );
		//////////////////////////////////////////////////////
		Human2 m = new Human2();
		m.name="���� ����";
		m.age = 20;
		
		Human2 m2 = new Human2();
		
		Human2 m3 = t.add(m,m2); 
	}

}

*/