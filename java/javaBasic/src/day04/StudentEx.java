package day04;

public class StudentEx {
	public static void main(String[] args) {

		Student s1 = new Student();
		// ��ü�� �ʵ峪 �޼ҵ带 ������ ������
		// [��ü.�ʵ�] Ȥ�� [��ü.�޼ҵ�] �� �����Ѵ�.

		//s1.name = "���翵";���� private����, setter�� getter ���� ��
		//�Ʒ��� ���� s1.setName("���翵"); �� �Է��Ѵ�. 
		s1.setName("���翵");
		//s1.korean = 100;���� �Ʒ��� ���� �����Ͽ� ����
		s1.setKorean(100);
		s1.setEnglish(80);
		s1.setMath(91);
		s1.printInfo();
		System.out.printf("����: %03d ��, ���:%.2f ��\n", s1.calculateSum(), s1.calculateAverage());

		Student s2 = new Student();
		s2.setName("��ö��");
		s2.setKorean(90);
		s2.setEnglish(89);
		s2.setMath(88);
		s2.printInfo();
		System.out.printf("����: %03d��, ���: %.2f��\n",
				s2.calculateSum(),
				s2.calculateAverage());
		
		Student s3 = new Student("�̿���", 80, 80, 80);
		s3.printInfo();
		
		System.out.println(s1);
		
		//��ü�� �񱳸� ���� equals�� �غ���
		Student s4 = new Student("�̿���", 80, 80, 80);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		System.out.println("*s3.equals(s4):"+s3.equals(s4));
	}
}
