package day04;
//ArrayList
//�迭�� Ŭ����ó�� �� �� �ְ� �������� ��̸���Ʈ�� ����غ���
import java.util.ArrayList;

public class Ex03ArrayList {
	public static void main(String[] args) {
		//ArrayList�� 
		//<>�ȿ� ������ �������� �����ش�.
		//<>�ȿ��� Ŭ������ �� �� �ִ�.
		//"�����, �׷� �⺻�� ������Ÿ�Ե��� ArrayList�� ��������?"
		//�׷� ������ �����ϱ� ���� �ڹٴ� �⺻�� ������Ÿ���� Ŭ����ȭ ���ѳ��Ҵ�.
		//�׷� �⺻�� ������Ÿ���� Ŭ������ �������� Ŭ��������
		//�츮�� ���� Ŭ����(wrapper class)��� �Ѵ�.
		//int�� ���� Ŭ������ Integer�̰�, double�� ���� Ŭ������ Double�̴�.
		
		//ArrayList�� �޼ҵ���� Ŭ������ equals()�޼ҵ带 ����Ȱ���Ѵ�.
		//���� �����е��� ���� Ŭ������ ArrayList�� ������� �ϸ�
		//�׻� equals()�޼ҵ带 ����� ���� �߿��ϴ�.
		
		//ArrayList�� ������ Ŭ������ ������� �Ͽ��� ������
		//��ü ģȭ���̰�, ũ�� ������ ���ٴ� ���̴�.
		//��, �迭���� ���� �����ߴ� ���� ArrayList�� ������ ��.
	
		ArrayList<Student> studentList = new ArrayList<>();
		//��̸���Ʈ�� ����ũ�⸦ �˰� ���� �� size()�޼ҵ带 �����ϸ� �ȴ�.
		System.out.println("studentList�� ���� ũ�� : " + studentList.size());
		
		Student s1 = new Student("1��", 1, 1, 1);
		Student s2 = new Student("2��", 2, 2, 2);
		Student s3 = new Student("3��", 3, 3, 3);
		Student s4 = new Student("4��", 4, 4, 4);
		Student s5 = new Student("5��", 5, 5, 5);
		
		//��̸���Ʈ�� ��ü�� �߰��� ������
		//add(��ü)�� �߰��Ѵ�.
		studentList.add(s1);
		System.out.println("studentList�� ���� ũ�� : " + studentList.size());
		studentList.add(s2);
		System.out.println("studentList�� ���� ũ�� : " + studentList.size());
		studentList.add(s3);
		System.out.println("studentList�� ���� ũ�� : " + studentList.size());
		studentList.add(s4);
		System.out.println("studentList�� ���� ũ�� : " + studentList.size());
		studentList.add(s5);
		System.out.println("studentList�� ���� ũ�� : " + studentList.size());
		
		//����Ʈ�� ��Ҹ� ȣ���� ������
		//get(�ε���)�� ȣ���ϸ� �ȴ�.
		System.out.println("studentList.get(0):" + studentList.get(0));
		
		//����Ʈ�� Ư�� ��ü�� �����ϴ��� Ȯ���� ������
		//contains(��ü)�� Ȯ�� �����ϴ�.
		//contains�� equals()�� ����ϴ� �޼ҵ��̱� ������
		//equals()�� true�� ������ ��ü�� �ָ� �ȴ�.
		
		Student s5duplicated = new Student("5��", 5, 5, 5);
		Student s6 = new Student("6��", 6, 6, 6);
		
		System.out.println("list.contains(s5Duplicated): "
				+studentList.contains(s5duplicated));
		System.out.println("list.contains(s6): "
				+studentList.contains(s6));
		
		//���� �ش� ��ü�� index�� �˰� �ʹٸ�
		//list.indexOf(��ü)�� �����ϸ� �ȴ�.
		//���� �ش� ��ü�� �������� �ʴ´ٸ�
		//-1�� ���ϵȴ�.
		System.out.println("indexOf(s5Duplicated) : "
				+ studentList.indexOf(s5duplicated));
		System.out.println("indexOf(s6) : "
				+ studentList.indexOf(s6));
		
		//list���� ��Ҹ� ������ ���� 2���� ������� ���Ű� �����ϴ�.
		//1. index�� ���� -> ��ü.remove(0);
		//2. ��ü�� ����
		System.out.println("list.get(0): "+studentList.get(0));
		studentList.remove(0);
		System.out.println("list.get(0): "+studentList.get(0));
		
		System.out.println("list.contains(s5Duplicated): "
				+studentList.contains(s5duplicated));
		studentList.remove(s5duplicated);
		System.out.println("list.contains(s5duplicated): "
				+studentList.contains(s5duplicated));
		
		//���� Ư�� ��ġ�� Ư�� ��ü�� ����ְ� ������
		//add(������� index, ��ü)�� �־��ָ� �ȴ�.
		//���� �ִ� ��ȣ���ʹ� ��ĭ�� �ڷ� �и��� �ȴ�.
		System.out.println(studentList.get(2));
		studentList.add(2, s5duplicated);
		System.out.println(studentList.get(2));
	}
}
