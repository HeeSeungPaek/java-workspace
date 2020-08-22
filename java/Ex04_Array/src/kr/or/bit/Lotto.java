package kr.or.bit;
import java.util.Random;
import java.util.Scanner;
/*
1. 1~45������ ������ �߻����� 6���� �迭�� ��������
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 
���� main �Լ� �ȿ��� ��� ....����...
���� 1�� �Դϴ�
1. 1~45������ ������ �߻����� 6���� �迭�� ��������  (ó��...)
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (���� �н�...)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����   (�ڷᱸ�� ...)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� 
 */

//���赵�� �и��� ��, � �� ������ ���, � ����� ������!
public class Lotto {
	// public int[] numbers = new int[6]; -> Ʋ�� �ڵ�� �ƴϳ�, ������ ������ �ִ�.
	// ������ ����? : public(: ���������� ĸ��ȭ�ؾ���)
	private int[] numbers; // ������ ����? : �ʱ�ȭ�� ����ƽ ������, �Ϲ� �ʱ��� �Ǵ� �����ڰ� ������ �°� ����� �Ѵ�.
	// private Scanner scanner = new Scanner(System.in); //������ ������ �ִ�.
	private Scanner scanner;
	private Random r; // new Random();

	public Lotto() { // �ʱ�ȭ - ����ʵ忡 ����
		numbers = new int[6];
		scanner = new Scanner(System.in);
		r = new Random();
	}

	// ��� >> �Լ��� �����. >> �Լ� �ϳ��� ����� �ϳ�.
	// �Լ��� �ܺο��� ����Ƿ��� public
	// �׷���, public�� �ƴ� �Լ��� ������ �� �ִ�.
	// private �Լ� : ���������� ���Ǵ� ���� �Լ����� ��

	// �� ��ȣ �������ּ���.
	// �ߺ��� ������ �ȵǿ�.
	// ���� ������ ������ �ּ���.
	// ȭ�鿡 ����� �ּ���.
	// �޴� ����� ����� �ּ���.

	public void selectLottoNumbers() {
		loop_1: while (true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1":
				// makeLottoNumbers(); // �ǹ�ȣ ����
				// showLottoNumbers();
				do {
					makeLottoNumbers();
				} while (!checkAverage());
				showLottoNumbers();
				break;
			case "2": // ���α׷� ���� : >> �Լ� ����(return), ���α׷� Kill(System.exit(0))
						// �󺧰��� �̿��� ���� �� 3������ ����.
				System.out.println("Good Luck");
				break loop_1; // break ������ switch... ����ġ(loop_1)�� ��������(while�� Ż��)
			default:
				System.out.println("not in operation");
				break;
			}
		}
	}

	private String showMenu() {
		System.out.println("********************");
		System.out.println("*1.��÷ ���� ��ȣ �����ϱ�*");
		System.out.println("*2.���α׷� ���� ^^! ^^*");
		System.out.println("********************");
		System.out.println("���ϴ� �޴� ��ȣ�� �Է��ϼ���.");
		String selectnum = scanner.nextLine();
		return selectnum;
	}

	// ��ȣ ����, �ߺ��� ����
	private void makeLottoNumbers() {
		for (int i = 0; i < numbers.length; i++) { // 1��,2��. ���� �Ҵ� �� �ߺ� �� ����, ���Ҵ�
			numbers[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					// System.out.println("�ߺ� Ȯ�ε�");
					i--;
				}
			}
		}
	}

	// ȭ�鿡 ��� (���� ��)
	private void showLottoNumbers() {
		for (int i = 0; i < numbers.length - 1; i++) { // 3��. ���� ���� ū ���� ��ġ �ٲ� �� ó������ �˻�
			// System.out.printf("[%d],[%d]\n", i, numbers[i]);
			if (numbers[i] > numbers[i + 1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
				i = -1; // ���� i�� 1�� �������⶧���� �ٽ� ó������ �˻�
			}
		}

		System.out.println("[������ Lotto��ȣ]");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("lotto��ȣ [%02d]��° : [%d]\n", i + 1, numbers[i]);
		}

	}

	// �ζ� (�ζ� ��ȣ�� ���� ��� ���� ...) ...�ƴϸ� ������
	private boolean checkAverage() {
		int sum = 0;
		int average = 0;
		for (int num : numbers) {
			sum += num;
		}
		average = sum / numbers.length;
		System.out.println("��� : " + average);
		return (average > 15 && average <= 35); // true ���ϵǸ� ok, false���ϵǸ� ������
	}
}
