package day02;

import java.util.Scanner;

/*for�� ����
 * 1. 1~100������ ���� ���ϴ� ���α׷��� ������
 * 2. ����ڷκ��� ���� �Է� �޾Ƽ� 1���� �� �������� ���� ���ϴ� ���α׷��� �ۼ��Ѵ�.
 * ��, ����ڰ� �Է��� ���� 15�̸��̾�� �Ѵ�.
 * */
public class Ex09For02 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in); 
		
		//1�� ����
		for(int i = 0; i <= 100; i++) {
			/* 
			 * sum�� ���簪�� i�� �����ָ� 0~100������ i�� ��� ��������. 
			 * �̰� �ڵ�� ���� 'sum = sum + i -> sum += i;'�� �� �� �ִ�.
			 */
			sum += i;
		}
		System.out.println("1~100�� �� : "+sum);
		
		//2�� ����
		int factorial = 1;
		System.out.println("���� �Է�:");
		int userNumber = scanner.nextInt();
		
		if(userNumber >= 0 && userNumber < 15) {
			for(int i = 1; i <= userNumber; i++) {
				factorial *= i;
			}
			System.out.printf("1~%d������ �� : %d", userNumber, factorial);
		}else {
			System.out.println("15�̸��� ���� �Է����ּ���");
		}
		
		scanner.close(); 
	}
}
