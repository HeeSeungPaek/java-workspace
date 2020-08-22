package day02;

import java.util.Scanner;

/*사용자로부터 키와 몸무게를 입력받아서
 * BMI계산값과 체중 여부를 알려주는 프로그램을 작성하시오.
 * BMI계산법 : 몸무게(KG) / 키(M)의 제곱
 * 예를들어 몸무게 70 키 170은 BMI 계산시
 * 70/ 1.7/ 1.7을 하면 된다.
 * 
 * BMI는 18.5 이하는 저체중
 * 		18.5초과~23이하 정상체중
 * 		23초과 ~25이하 과체중
 * 		25초과는 비만으로 정한다
 * 
 * 데이터검증도 실시할 것*/

public class Ex07IfElseIf03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double weight, height;
		
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		weight = scanner.nextDouble();
		System.out.println("키(미터)를 입력해주세요 (ex. 180cm라면 1.8) : ");
		height = scanner.nextDouble();

		double bmi = weight / (height * height);
		
		/* if(height >= 0 && height <= 2.72
		 * 		&& weight >= 0 && weight <= 442) {
		 *  if(bmi <= 18.5){
		 *  }else if...{
		 *  }
		 * }else {
		 * 	System.out.println("잘못된 값 입력");
		 * }
		 * 로 대체 가능~ */
		
		if(height >= 0 && height <= 2.72 && weight >= 0 && weight <= 442) {
			System.out.printf("입력하신 몸무게 : %.2fkg, 키 : %.2fm, BMI 수치 : %.2f\n", 
			weight, height, bmi);
			if (bmi <= 18.5) {
				System.out.println("저체중 입니다.");
			} else if (bmi <= 23) {
				System.out.println("정상 체중 입니다.");
			} else if (bmi <= 25) {
				System.out.println("과체중 입니다.");
			} else {
				System.out.println("비만 입니다.");
			}
		}else {
			System.out.println("====키 또는 몸무게를 잘못 입력하셨습니다.====");
		}
		scanner.close();
	}
}
