package day04;

import java.util.Random;

public class Ex02Lottery {
	public static void main(String[] args) {
		// 랜덤클래스는 말 그대로 랜덤한 숫자를 만들어주는 클래스이다.
		// 우리가 랜덤한 숫자(=난수)를 사용할 일이 생기면
		// Random클래스 객체를 생성해 사용하면 된다.
		Random random = new Random();
		int[] lottoNumbers = new int[6];

		// lottoNumbers의 각 인덱스에 난수를 입력하는 for문
		for (int i = 0; i < lottoNumbers.length; i++) {
			// random.nextInt는 0 ~ 파라미터-1까지의 난수를 생성한다
			// 따라서 1 ~ 45까지의 난수를 원하면
			// random.nextInt(45)의 결과값에 1을 더해주면 된다.

			lottoNumbers[i] = random.nextInt(45) + 1;
		}
		
		System.out.println("====난수 생성 직후====");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("lottoNumbers[%d]: %3d\n", i, lottoNumbers[i]);
		}
		System.out.println("=================");
		System.out.println("====중복 제거 시작====");
		//중복이란?
		//i와 j가 다르지만 lottoNumber[i]와 lottoNumber[j]가 같으면 중복이다.
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			for(int j = 0; j < lottoNumbers.length; j++) {
				if( i != j && lottoNumbers[i] == lottoNumbers[j]) {
					//&&연산자로 조건 확인
					System.out.printf("%d번 %d 중복\n", i, j);
					lottoNumbers[i] = random.nextInt(45)+1;
					j = -1; //그 전꺼로 돌아가서 다시 중복검사
				}
			}
		}
		System.out.println("====중복 생성 직후====");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("lottoNumbers[%d]: %3d\n", i, lottoNumbers[i]);
		}
		
		System.out.println("@@@@@@정렬 실시@@@@@@");

		//오름차순 정렬을 할 때에는 i와 i+1번째를 비교하여
		//만약 i가 i+1보다 크면 2개의 순서를 바꿔주면 된다.
		
		//가정 : 15 16 11 2 4 6
		// i: 1
		for(int i = 0; i < lottoNumbers.length - 1; i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i = -1;
			}
		}
		System.out.println("@@@@@@정렬 직후@@@@@@");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.printf("lottoNumbers[%d]: %3d\n", i, lottoNumbers[i]);
		}
		//결론: 배열은 불편하다.
		
	}
}
