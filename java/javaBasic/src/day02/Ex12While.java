package day02;
//While 반복문
//for 반복문은 비교적 명확하게 횟수가 나와있다.
//그에 반해 while 반복문은 횟수 대신 조건식만 있고
//해당 조건식이 true인 동안 반복된다.
//== false인 순간 빠져나온다.
public class Ex12While {
	public static void main(String[] args) {
		int i = 10;
		while(i > 0) {
			System.out.println("i : "+i);
			i--;
		}
		//for(int i = 10; i > 0; i--)와 위의 while문은 똑같은 형태
	}
}
