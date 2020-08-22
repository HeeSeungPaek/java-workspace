package day04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

//��̸���Ʈ�� �̿��� �ζǹ�ȣ ���۱�
public class Ex04Lotto {
	public static void main(String[] args) {

		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		Random random = new Random();

		// ����Ʈ�� ������ �߰��غ���
		// ��, ������ �߰��� ������ ����Ʈ�� �ش� ��ȣ�� ���� �� �߰��� �ǰ�
		// �ݺ�Ƚ���� ����Ʈ�� ũ�Ⱑ 6���� ���� �����̴�.
		while (lottoNumbers.size() < 6) {
			int number = random.nextInt(45) + 1;
			if (!lottoNumbers.contains(number)) {
				lottoNumbers.add(number);
			}
		}
		
		System.out.println("===���� �߰� �Ϸ�===");
		for (int i = 0; i < lottoNumbers.size(); i++) {
			System.out.println(lottoNumbers.get(i));
		}
		
		// �����غ���
		// �ڵ� ���� ������.
		Collections.sort(lottoNumbers);
		System.out.println("====���ĿϷ�====");
		for (int i = 0; i < lottoNumbers.size(); i++) {
			System.out.println(lottoNumbers.get(i));
		}
		
	}
}
