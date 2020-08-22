package day02;
//PrimeNumber : 소수
//약수가 1과 자기자신밖에 없는 수 = 약수가 2개
//약수 : 나누어 떨어지는 수 = 나머지가 0인 수
//최대 약수 : 약수 중 최대의 수 = 자기 자신
//이 세 가지 조건을 이용해 1~100까지의 소수를 구하는 프로그램을 만들어보자
public class Ex11PrimeNumber {
	public static void main(String[] args) {
		
		//i for문을 만들어 i는 해당 숫자가 소수인지 아닌지를 체크하고,
		//j for문을 집어넣어 j가 i의 약수인지 아닌지를 체크한다.
		for(int i = 1; i <= 100; i++) {
			//약수의 개수를 저장할 count 변수를 만들고 0으로 초기화한다.
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.printf("소수 : %03d.\n", i);
			}
		}
	}
}
