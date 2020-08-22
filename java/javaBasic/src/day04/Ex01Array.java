package day04;
//배열(Array)

//배열이란 똑같은 데이터타입을 특정 크기만큼 모아둔 것을
//배열이라고 한다.

//배열은
//데이터타입[] 배열이름 = new 데이터타입[크기];
//로 선언과 초기화한다.

//하지만 2가지 단점이 있어서 안쓰인다.
//1. 크기가 고정되어있다.
//2. 2세대 프로그래밍부터 존재하던 개념이기 때문에
//	  클래스에 비친화적이다.

public class Ex01Array {
	public static void main(String[] args) {
		// 크기가 5인 int 배열을 만들어보자
		int[] arr = new int[5];

		// 배열의 각 요소는 하나의 변수처럼 쓸 수 있다.
		arr[0] = 15;
		System.out.println("arr[0]: " + arr[0]);

		// 배열의 각 위치는 인덱스가 있다.
		// index는 0 ~ 크기-1
		// 인덱스 틀리게 적으면 에러남
		// System.out.println("arr[5]:"+arr[5]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
		// 기본형 데이터타입의 배열을 만들면 처음 초기화는 자동으로 0이 된다.
		// 그렇다면 참조형 데이터타입의 배열을 만들면
		// 초기화를 안해주면 무슨 값이 들어가있을까? -> null값
		Student[] studentArray = new Student[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("studentArray[" + i + "] : " + studentArray[i]);
		}
		//null이란?
		//참조형 변수에 주소값은 부여가 되어있지만
		//해당 주소에는 막상 아무것도 없는 상태를 null이라고 한다.
		//null인 상태에서는 필드와 메소드에 아무런 접근을 할 수 없다.
		//접근을 하게 되면java.lang.NullPointerException이 발생한다.
		//studentArray[0].printInfo();
		//따라서 참조형 배열은 각 위치를 생성자를 호출해서 초기화 해야 한다.
		for(int i = 0; i < arr.length; i++) {
			studentArray[i] = new Student();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("studentArray[" + i + "] : " + studentArray[i]);
		}
		
		//만약 우리가 객체의 배열에서 비어있는 칸을 찾으려면?
		//생성자 호출이 안되어있으면 null을 찾아야 하고
		//생성자 호출이 되어있으면 값을 찾아서 빈 칸을 찾아야 한다.
		//즉 귀찮다.
	}
}
