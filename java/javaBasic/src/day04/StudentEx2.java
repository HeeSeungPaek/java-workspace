package day04;
//��̸���Ʈ�� ����� �л����� ���α׷�
import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList studentList = new ArrayList<>();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.����");
			System.out.print("> ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				//�߰��� ������ �ӽ� ��ü�� ����
				//����Ʈ�� �߰��ϸ�
				//�츮�� �ӽ� ��ü�� ���� ���� ��������
				//����Ʈ�� �� �������ش�.
				Student s = new Student();
				System.out.print("�̸� : ");
				scanner.nextLine();
				s.setName(scanner.nextLine());
				
				System.out.print("���� : ");
				s.setKorean(scanner.nextInt());
				
				System.out.print("���� : ");
				s.setEnglish(scanner.nextInt());
				
				System.out.print("���� : ");
				s.setMath(scanner.nextInt());
				
				studentList.add(s);
				
			}else if(choice == 2) {
				if(studentList.size() > 0) {
					for(int i = 0; i < studentList.size(); i++) {
						System.out.println(studentList.get(i));
					}
				}
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		scanner.close();
		
	}
}
