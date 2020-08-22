package day03;
//*

//**
//***
//****
//*****
//...

import java.util.Scanner;

public class Ex01Star01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("줄 수를 입력해주세요");
		int userNumber = scanner.nextInt();

		// 내가한거
		// for(int height = 0; height <= cnt - 1; height++) {
		// for(int width = 0; width <= height; width++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }

		for (int height = 1; height <= userNumber; height++) {
			// 별을 j for문 동안 추가할 string을 하나 만들자
			String stars = new String();
			for (int width = 1; width <= height; width++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		scanner.close();
	}
}
