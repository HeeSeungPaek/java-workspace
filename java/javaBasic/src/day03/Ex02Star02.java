package day03;

//*****
//****
//***
//**
//*
import java.util.Scanner;

public class Ex02Star02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ���� �Է����ּ���");
		int userNumber = scanner.nextInt();

		for (int height = 1; height <= userNumber; height++) {
			String stars = new String();
			for(int width = height; width <= userNumber; width++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		
		scanner.close();

	}
}
