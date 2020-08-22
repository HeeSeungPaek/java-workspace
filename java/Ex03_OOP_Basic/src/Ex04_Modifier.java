import kr.or.bit.Car;

/*
접근자 (한정자)
public 공유 : [패키지 구분 없이] 어디 있던간에 모든 자원은 공유된다.
private 개인 : 클래스 내부에서만 자원을 공유할 수 있다. 참조변수 입장에서는 접근 불가.

************객체지향 언어의 특징**************
1.캡슐화(은닉화) -> private을 사용하여 구현한다.
1.1) 클래스 내부에 있는 자원 (Member field, member method) 을 캡슐화 적용
	private int number;  직접 할당을 막고 간접 할당을 통해 자원을 보호(제어)하겠다.
						 >> 간접(함수 :write(setter) ,read(getter))
	private void call(); 다른 함수의 보조(공통 함수) >> 접근 불가 ,but 클래스 내부에서 다른 함수가 호출해서 사용
	
	setter와 getter를 만든다
	1.setter만 만들 수 있을까 ? (O) >> 어떤 생각을 가지고 만들었을까 : 
		ex) private int num; setNum(); //참조변수가 접근을 못한다 > 내부(class)에서만 쓰기 위해  
	2.getter만 만들 수 있을까 ? (O) >> getNum(); >> 읽기(read)만 하겠다.
	3.getter와 setter를 모두 쓴다 (O) >> 참조변수가 캡슐화된 자원에서 write,read 둘 다 가능하게 하겠다는 의도! // 보통의 경우
	
객체지향 언어의 목적 : 보호~ > private 사용 > 캡슐화
 */

public class Ex04_Modifier {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setSpeed(10); //setter getter를 보면 private 변수가 있겠구나 유추 가능
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());
		
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
		
	}
	
}
