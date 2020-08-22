import java.util.Arrays;

/*
배열은 객체다 (Array)
1. new 를 통해서 생성된 객체 Array는
2. heap메모리에 생성된다.
3. 고정 배열(정적 배열) : 배열의 크기가 한 번 정해지면 변경이 불가하다!
4. 자료구조의 기본 : 연습 많이해라...
*/
public class Ex01_Array_Basic {
	public static void main(String[] args) {

		int s, s1, s2, s3;
		int[] score = new int[3];

		System.out.println(score[0]); // read
		score[0] = 101;// write
		score[1] = 20;
		score[2] = 300;
		System.out.println(score[0]);

		// 방의 개수는 항상 index+1이다. (방개수-1이 마지막 index이다.)
		// score[3] = 50;
		// java.lang.ArrayIndexOutOfBoundsException : 첨자의 범위를 벗어났어요! > 예외

		// Array 배열 : for문과 궁합
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d] = [%d]\t", i, score[i]);
		}

		System.out.println();

		for (int i = 0; i < score.length; i++) { // score.length : 배열의 개수
			System.out.printf("[%d] = [%d]\t", i, score[i]);
		}

		// 팁 : Array를 도와주는 클래스가 있따.
		// String result = Arrays.toString(score); for문 배열 쌉마스터하면 그때 쓰자. 계속쓰면 실력 준다.
		// System.out.println(result);

		// Arrays.sort(score);
		// String result1 = Arrays.toString(score); 이것도 금기.
		// System.out.println(result1);

		// Today Point
		// 배열 생성의 3가지 방법
		int[] arr = new int[5]; // 기본스
		int[] arr2 = new int[] { 100, 200, 300 }; // 초기값을 통해서 방이 만들어지고 초기화까지
		int[] arr3 = { 11, 22, 33, 44, 55 }; // 자바스크립트에서 이걸 제일 많이씀. let carcarr=[1,2,3,4,5];
		// 3번처럼 작성하면, 컴파일러가 new int[] { 11, 22, 33.. };을 생성해준다.

		// arr3 방에 있는 값들을 출력해보자
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("\n[%d] = [%d]\n", i, arr3[i]);
		}

		// 배열은 객체다. -> new해야한다. -> new하면 메모리에 올라간다. -> 메모리라하면 힙이다.
		int[] arr4; // 선언만
		arr4 = new int[] { 21, 22, 23, 24, 25 }; // Assign
		System.out.println(arr4); // I@4aa298b7 쥬소값

		int[] arr5 = arr4; // 주소값 할당
		System.out.println(arr4 == arr5);// 주소값 비교 >>> 지금 당연히 True

		// 배열의 타입 : 8가지 기본 타입 + String
		// **클래스 (사용자 정의 타입)도 Array의 타입으로 사용한다.

		String[] strarr = new String[] { "가", "나", "다라마" };
		for (int index = 0; index < strarr.length; index++) {
			System.out.println(strarr[index]);
		}

		char[] charr = new char[10]; // default값 : 빈문자 \u0000
		for (int i = 0; i < charr.length; i++) {
			System.out.println(">" + charr[i] + "<");
		}

		// 객체 배열
		// Car
		// Car[] cars = new Car[10];
	}
}
