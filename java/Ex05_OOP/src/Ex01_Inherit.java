/*
****************************외우자*********************************
OOP 특징
	1.상속
	2.캡슐화 (은닉화) >> private
	3.다형성 (Polymorphism)
	
	1.상속 사용할 때
	java: child extends Base / c# : child : Base
	
	2.특징
		1)다중 상속은 불가.
		2)단일 상속만 가능! (단, 계층적 상속 : 이것을 통해서 여러개의 클래스를 상속할 수 있습니다.)
		3)다중상속을 지원하는게 바로 인터페이스
		
	3.상속의 의미
		1)진정한 의미 : 재사용성
		2)단점 : 초기에 설계 비용이 많이 든다.(인터페이스 만들고, 다양한 관점에서 만들다보니, 공통된 것을 만드는데 비용과 시간이 많이 걸린다)
		3)재사용성은 결국 설계단계에서 비용적인 요소가 많이 들어가더라(시간이 들더라고 공통 자원을 만드는 것[분모or추상화])
		
	4.상속 관계라는 건  Memory구조가 어떻게 될까?
		GrandFather -> Father -> Child
		
	>>사용자가 (개발자가) 만드는 모든 클래스는 default로(명시하지 않아도) Object라는 클래스를 상속한다!
	if> class Car extends Object가 생략되어있는것! Object는 단군이다. >> Object는 모든 클래스의 Root(최상위 클래스) >> 모든 클래스의 부모 클래스
**************************외우자*********************************
 */

class Car extends Object {
	
}

class GrandFather extends Object {
	public int gmoney = 5000;
	private int pmoney = 10000;	//private을 달면 접근불가 (객체, 상속관계) : 내부에서

	public GrandFather() {
		System.out.println("할아버지");
	}
}

class Father extends GrandFather {
	public int fmoney = 3000;

	public Father() {
		System.out.println("아버지");
	}
}

class Child extends Father {
	public int cmoney = 1000;

	public Child() {
		System.out.println("자식");
	}
}

public class Ex01_Inherit {

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println(child.gmoney); // 할아버지 돈도 내돈
		System.out.println(child.fmoney); // 아버지 돈도 내돈
		System.out.println(child.cmoney); // 내것도 사용
		
		Car car = new Car();

	}

}



























