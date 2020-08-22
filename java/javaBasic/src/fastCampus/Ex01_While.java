package fastCampus;

public class Ex01_While {
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		//while문은 조건식이 참인 동안 수행된다
		//다른 말로, 조건식이 거짓이 되는 순간! 빠져나온다~
		while(num <=10) {
			sum += num;
			num++; //num이 11이 되는 순간 빠져나온다. 10까지는 돌아간다.
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
