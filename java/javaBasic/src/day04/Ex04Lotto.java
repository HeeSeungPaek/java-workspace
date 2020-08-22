package day04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

//어레이리스트를 이용한 로또번호 제작기
public class Ex04Lotto {
	public static void main(String[] args) {

		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		Random random = new Random();

		// 리스트에 난수를 추가해보자
		// 단, 난수가 추가될 때에는 리스트에 해당 번호가 없을 때 추가가 되고
		// 반복횟수는 리스트의 크기가 6보다 작을 동안이다.
		while (lottoNumbers.size() < 6) {
			int number = random.nextInt(45) + 1;
			if (!lottoNumbers.contains(number)) {
				lottoNumbers.add(number);
			}
		}
		
		System.out.println("===숫자 추가 완료===");
		for (int i = 0; i < lottoNumbers.size(); i++) {
			System.out.println(lottoNumbers.get(i));
		}
		
		// 정렬해보기
		// 자동 정렬 지린다.
		Collections.sort(lottoNumbers);
		System.out.println("====정렬완료====");
		for (int i = 0; i < lottoNumbers.size(); i++) {
			System.out.println(lottoNumbers.get(i));
		}
		
	}
}
