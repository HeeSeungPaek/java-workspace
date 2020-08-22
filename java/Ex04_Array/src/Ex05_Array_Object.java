class Person {
	String name;
	int age;
	/*
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	*/
	void print() {
		System.out.println(this.name + " . " + this.age);
	}
}

//클래스는 데이터타입이다.
public class Ex05_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10]; // 값 타입의 배열
		boolean[] boarr = new boolean[5]; // false
		// 값 타입 배열은 각각의 방에 기본값이 들어있다.(default)

		// 참조 타입 배열
		Person p = new Person();
		p.name = "홍길동스";
		p.age = 100;

		// 사람을 세명 만들어라.
		// int[] intarr = new int[10];
		Person[] personarr = new Person[3]; // 3개의 방이 만들어지는데, 방은 비어있다.
		// 객체 배열은 1. 방만드는거 하나, 2.방에 객체 넣어주는거 하나 총 두번 한다. 개애중요해요 ㄹㅇㄹㄷㄱ
		System.out.println("personarr : " + personarr);
		System.out.println("personarr[0] : " + personarr[0]);

		personarr[0] = new Person();
		personarr[1] = new Person();

		System.out.println("personarr[0] : " + personarr[0]);
		System.out.println("personarr[1] : " + personarr[1]);
		personarr[0].age = 100;

		// ***************이걸 모르면 프로젝트 못한다. 손을 못 댄다
		// > 객체 배열은 [방을 만드는 작업]과 [방을 채우는 작업] 별도!
		personarr[2] = personarr[0]; // 이게 자유로와야댕

		personarr[0].name = "김유신";
		personarr[1].name = "아메리카노";

		// 객체 배열 for
		for (int i = 0; i < personarr.length; i++) {
			System.out.println(personarr[i].name);
		}

		// 객체 배열 3가지 방법으로 만들기 ^^
		// 1. int[] arr = new int[5];
		Person[] pe_array = new Person[5];
		for (int i = 0; i < pe_array.length; i++) {
			pe_array[i] = new Person(); // 객체 배열이 주소값을 가지게 된다.
			System.out.println(pe_array[i]);
		}
		// 2. int[] arr = new int[]{10,20,30}
		Person[] pe_array2 = new Person[] { new Person(), new Person(), new Person() };

		// 3. int[] arr = {1, 2, 3}
		Person[] par_array3 = { new Person(), new Person(), new Person() };
	}
}
