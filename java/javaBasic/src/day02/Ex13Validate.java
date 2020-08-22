package day02;
//사용자로부터 점수를 입력받아
//a,b,c,d,f를 출력하는 프로그램.
//단, 잘못된 점수가 입력되면 경고메세지 출력 후
//올바른 점수가 들어올 때까지 다시 입력받는다.
import java.util.Scanner;

public class Ex13Validate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		
		//this is validation how using While
		while(score < 0 || score > 100) {
			System.out.println("잘못된 형식입니다.\n 다시 입력해주세요. : ");
			score = scanner.nextInt();
		}
		
		if (score < 60) {
			System.out.println("성적 F 입니다");
		} else if (score < 70) {
			System.out.println("성적 D 입니다");
		} else if (score < 80) {
			System.out.println("성적 C 입니다");
		} else if (score < 90) {
			System.out.println("성적 B 입니다");
		} else {
			System.out.println("성적 A 입니다");
		}
		
		scanner.close();
	}
}
