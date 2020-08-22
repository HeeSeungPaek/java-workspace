/*
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
추후에는 별도의 클래스 분리해서 Lotto.java ..... 
현재 main 함수 안에서 사용 ....연습...
조별 1개 입니다
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요  (처음...)
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (기초 학습...)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요   (자료구조 ...)
4. 위 결과를 담고 있는 배열을 출력하세요 
 */
public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {	//1번,2번. 난수 할당 및 중복 시 추출, 재할당
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) { 			
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45 + 1);
					System.out.println("중복 확인됨");
					i--;
				}
			}
		}

		for (int i = 0; i < lotto.length - 1; i++) { // 3번. 작은 값과 큰 값의 위치 바꾼 후 처음부터 검사
			System.out.printf("[%d],[%d]\n", i, lotto[i]);
			if (lotto[i] > lotto[i + 1]) {
				int temp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = temp;
				i = -1; 							// 다음 i는 1이 더해지기때문에 다시 처음부터 검사 
			}
		}
		
		for (int i = 0; i < lotto.length; i++) { 	
			System.out.printf("lotto[%d] : [%d]\n", i, lotto[i]);
		}

	}
}