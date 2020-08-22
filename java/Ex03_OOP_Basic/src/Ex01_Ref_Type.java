import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

//import kr.or.bit.*; �� �� ���� ����!!
//bit��Ű�� ���� ��� �ڿ��� ����϶�� �ǹ��ε�, �������� ������ �ִ�. �� ���ھ��� ������ ������ �𸣱� ������ ���� �ʴ´�.
//����Ʈ �� �ϳ��� �����ؼ� �������

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		
		//�� Ÿ�� (8���� �⺻��)
		//���� Ÿ�� (Class, Array ....)
		//���� Ÿ���� Ư¡
		
		Person p2; //���� -> �̶� p2�� �޸𸮸� ������ ���� �ʴ�. ���� �߱� �����̴�
					//Stack�̶�� ������ [����]�� Ȯ��. ������ �̸��� p2, ������ ũ��� �ּҸ� ������ �ִ� 4Byte�� �� ����.
		p2 = new Person();	//p2��� ������ Person�̶�� �ϴ� ��ü�� �ּҰ� �Ҵ�ȴ�.
		System.out.println(p2); //�ּҰ��� ��µ�!
		
		//Person p3; //�����̶�� �Լ� ���� ���ú����̱� ������ �ʱ�ȭ�� �ؾ��Ѵ� -> �ʱ�ȭ ���� �ʾұ� ������ ��� �Ұ��ϴ�.
		Person p3 = null; //���� ������ �ʱ�ȭ�� null�� �Ѵ�. null : ���� �ƹ��͵� ����.
		System.out.println(p3);
		
		//���� ������ �޸𸮸� ������ ��� 2����.
		//1. new >> p3 = new Person();	//���� ������ �ּҰ��� ������
		//2. �ּҰ� �Ҵ� >> p3 = p2;		//�ٸ� �ּҰ��� �־��ֱ�
		
		p3 = p2;
		
		Person person = new Person(); //�������� person �̸��� ������ �ҹ��ڷ�(������)
		person.name = "��˱�";
		person.age = 100;
		person.power = true;
		person.personPrint();	//�޼ҵ� ���
		
		Person p = new Person();
		p.personPrint();		//name: null age: 0 power: false >> ��׵��� default���� ������ �ִ�.
		
		//Static�� Ŭ���� Area�� �ö󰡴µ�
		//�̸��� main�̶�� �ٷ� ���� �������� �������.[���]
		//���ÿ� �ƹ��͵� ���� >> ���α׷� ����
		
		//�ּҰ� ��
		System.out.println(person == p);//�� (������ ������ �ִ� ��)
		System.out.println(p2 == p3); //true �̰� �����ϴ°�
		
		int i = 100;
		i = 300;
		System.out.println(i);
		
		// --------------------------------------------------------------
		//Tv ����
		//Tv�� �̸��� ��Ʈ��� ����.
		//Tv�� �� �� �����, ä���� 5���� �ø���
		//Tv ������ ����غ���.
		
		Tv btv = new Tv();
		btv.brandname = "��Ʈ";
		System.out.println("���� ��Ʈ Ƽ�� ä������ : " + btv.ch);
		for(int k = 0; k < 5; k++) { //ä�� 5��
			btv.ch_Up();
		}
		btv.tvInfo();
		
		// --------------------------------------------------------------
		//��� �Ѹ��� �����ϼ���
		//�� ����� ����� 7788, �̸��� ������, �μ��� IT
		//�׸��� ��ü�������� Ű�� 190, �����Դ� 40
		Emp emp = new Emp();
		
		emp.empno = 7788;
		emp.name = "������";
		emp.job = "IT";

		//��ǰ������ Ŭ���� -> ����
		//����Ÿ���� ���� �ּҰ�
		/*
		 * BodyInfo body = new BodyInfo();
		 * 
		 * body.height = 190; body.weight = 40;
		 * 
		 * e1.bodyinfo = body; //e1�� bodyinfo
		 */		
		
		emp.bodyinfo = new BodyInfo(); //���� ���� �ڵ�� �Ȱ�����, ���������� ����.
		emp.bodyinfo.height = 190;
		emp.bodyinfo.weight = 40;
		
		System.out.println(emp + "/" + emp.bodyinfo);
		System.out.println(emp.empno + "/" + emp.bodyinfo.height);
		System.out.println(emp.name + "/" + emp.bodyinfo.weight);
		
	}
	
}
