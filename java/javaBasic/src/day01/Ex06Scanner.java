package day01;

//�ڹٿ��� �Է��� �츮�� ���� ����� ����°� �ƴ϶�
//Scanner ��ü ���� �� ����� ȣ���� ����ϰ� �ȴ�.
//��, Scanner�� �ڹ� �⺻ ���̺귯���� �ִ� Ŭ�����̱� ������
//�츮�� "����"�ؼ� ����Ѵ�.
//� Ŭ������ "����"�� ������
//import Ŭ������ġ ������ ����Ѵ�.
import java.util.Scanner;
//import ����Ű : Ctrl + Shift + O

public class Ex06Scanner {
	public static void main(String[] args) {
		// ��ĳ�ʰ�ü�� ������
		Scanner scanner = new Scanner(System.in);

		// ������ �Է¹޾ƺ���
		System.out.println("�����Է� : ");
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� ���� : " + number);

		// �Ǽ����� �Է¹޾ƺ���
		System.out.println("�Ǽ��Է� : ");
		double userDouble = scanner.nextDouble();
		System.out.println("����ڰ� �Է��� �Ǽ� : " + userDouble);
		
		//String�� �Է¹޾ƺ��ڱ�
		scanner.nextLine();
		
		System.out.println("��Ʈ���Է� : ");
		String userString = scanner.nextLine();
		System.out.println("����ڰ� �Է��� ��Ʈ�� : " + userString);
		//��Ʈ�� ���� ��� �Է��� ���ᰡ �Ǹ鼭 �������´�. �ֳ�.
		//��Ʈ���� �Է� ���� ������ �� ���� ������ ���� �ִ�.
		//������ nextInt(), nextDouble()���� ���ڷ� �Է¹ް� �� �Ķ��
		//�ݵ�� scanner.nextLine()�� �ѹ� �����־�� �Ѵٴ� ���̴�.
		//�̷��� �����ִ� ������ scanner�� ���� �����̴�.
		//�׷��� ��Ʈ�� �Է¹ޱ� �� �ٿ� nextLine�� ������ ���.
		//������ : nextLine ġ�ٰ� �ڵ��ϼ���� ������ hasNextLine���� �ٲ���� �ִ�.
		//���� ��찡 ������ �ڵ��ϼ���� ���� ������ �ʿ伺�� �ִ�.
		
		
		// scanner�� ���� �޸𸮸� �����ϴ� ��ü���� ���� �������ٿ�
		// close() �޼ҵ带 ȣ�����ִ� �� ���� ����̴�.
		scanner.close();
	}
}
