class Human2 {
	String name;
	int age;
}

class Test2 {

	Human2 add(Human2 h) {
		h.name = "김춘수";
		h.age++;
		return h;
	}

	void add(Human2 h, Human2 h2) {
		h.name = "오창식";
		h.age = 20;

		h2.name = "양다일";
		h2.age = 50;
	}

	void printHuman(Human2 h) {	//내가 넣은 파라미터의 이름을 출력하는 메소드
		String str = h.name;
		System.out.println(str);
	}
	
	void printHuman(Human2 h1, Human2 h2, Human2 h3) {	//내가 넣은 3명의 사람의 이름을 출력하는 것.
		String str = h1.name;
		String str2 = h2.name;
		String str3 = h3.name;
		System.out.println("모든 사람의 이름을 출력| " +"첫번째 : " + str);
		System.out.println("모든 사람의 이름을 출력| " +"두번째 : " + str2);
		System.out.println("모든 사람의 이름을 출력| " +"세번째 : " + str3);
	}
	

}

public class Ex15_Method_Overroading {

	public static void main(String[] args) {

		Test2 t2 = new Test2();
		Human2 human1 = new Human2();
		Human2 human2 = new Human2();
		Human2 human3 = new Human2();

		t2.add(human1); // Human2 타입의 human1 객체의 이름과 나이를 추가하는 메소드.
		System.out.println("human1의 이름과 나이를 추가| 이름:  " + human1.name + ", 나이: " + human1.age);

		t2.add(human2, human3);	//나는 일일이 한명의 정보를 바꾸는것보다 2명의 정보를 바꿔주고싶어.
		System.out.println("human2의 이름과 나이를 추가| 이름:  " + human2.name + ", 나이: " + human2.age);
		System.out.println("human3의 이름과 나이를 추가| 이름:  " + human3.name + ", 나이: " + human3.age);

		t2.printHuman(human1);		//사람들의 이름만 출력한다
		t2.printHuman(human2);
		t2.printHuman(human3);
		
		t2.printHuman(human2, human3, human1);
	}

}



/*
 
//강사님이 하신 것
class Human2{
	String name;
	int age;
}

class Test2{
	  Human2 add(Human2  h) {
		  //코드 마음대로 수정
		    h.name = "아무개";
			h.age = 200;
			return h ;
	  }
	  
	  Human2 add(Human2 h , Human2 h2) {
		  //코드 마음대로 수정
			h2.name = h.name;
			h2.age = h.age;
			return h2;
	  }
}
public class Ex15_Method_Overloading {
	public static void main(String[] args) {
		//어떤 코드 ..... add 함수를 동작 .... error 만 안나게 
		//가지고 놀기	
		Test2 t = new Test2();
		Human2 man = new Human2();
		
		Human2 man2 = t.add(man);
		System.out.println(man2.name);
		System.out.println(man2.age);
		
		System.out.println(man == man2);
		System.out.println(man.age  +" / " + man.name );
		//////////////////////////////////////////////////////
		Human2 m = new Human2();
		m.name="나는 누구";
		m.age = 20;
		
		Human2 m2 = new Human2();
		
		Human2 m3 = t.add(m,m2); 
	}

}

*/