package day02;

import java.util.Scanner;

/*����ڷκ��� Ű�� �����Ը� �Է¹޾Ƽ�
 * BMI��갪�� ü�� ���θ� �˷��ִ� ���α׷��� �ۼ��Ͻÿ�.
 * BMI���� : ������(KG) / Ű(M)�� ����
 * ������� ������ 70 Ű 170�� BMI ����
 * 70/ 1.7/ 1.7�� �ϸ� �ȴ�.
 * 
 * BMI�� 18.5 ���ϴ� ��ü��
 * 		18.5�ʰ�~23���� ����ü��
 * 		23�ʰ� ~25���� ��ü��
 * 		25�ʰ��� ������ ���Ѵ�
 * 
 * �����Ͱ����� �ǽ��� ��*/

public class Ex07IfElseIf03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double weight, height;
		
		System.out.println("������(kg)�� �Է����ּ��� : ");
		weight = scanner.nextDouble();
		System.out.println("Ű(����)�� �Է����ּ��� (ex. 180cm��� 1.8) : ");
		height = scanner.nextDouble();

		double bmi = weight / (height * height);
		
		/* if(height >= 0 && height <= 2.72
		 * 		&& weight >= 0 && weight <= 442) {
		 *  if(bmi <= 18.5){
		 *  }else if...{
		 *  }
		 * }else {
		 * 	System.out.println("�߸��� �� �Է�");
		 * }
		 * �� ��ü ����~ */
		
		if(height >= 0 && height <= 2.72 && weight >= 0 && weight <= 442) {
			System.out.printf("�Է��Ͻ� ������ : %.2fkg, Ű : %.2fm, BMI ��ġ : %.2f\n", 
			weight, height, bmi);
			if (bmi <= 18.5) {
				System.out.println("��ü�� �Դϴ�.");
			} else if (bmi <= 23) {
				System.out.println("���� ü�� �Դϴ�.");
			} else if (bmi <= 25) {
				System.out.println("��ü�� �Դϴ�.");
			} else {
				System.out.println("�� �Դϴ�.");
			}
		}else {
			System.out.println("====Ű �Ǵ� �����Ը� �߸� �Է��ϼ̽��ϴ�.====");
		}
		scanner.close();
	}
}
