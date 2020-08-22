/*
실무 (개발환경)
1개의 클래스만 가지고는 거의 할 수 있는 작업이 없다.
왜냐하면 규모가 그렇게 작지 않기 때문이다.
업무는 복잡하니 설계도는 여러개가 만들어지기 마련이다.
예를들어 쇼핑몰을 만들어라 해서 설계해본다 치자.
뭐 주문관리나  회원관리, 배송, 상품 등등 모든 정보가 한 개의 클래스에 있으면 유지관리가 절대로 안된다
그래서 각각의 업무에 대해서 설계도를 하나씩 만드는 거다.

설계도가 아무리 많다 하더라도, 기준을 세워야 한다.
그 기준은 여러개의 설계도의 관계를 맺어주는것.
1.상속이라는 관계(is ~ a : 상속) [무엇은 무엇이다]
2.포함(has ~ a : 포함) [무엇은 무엇을 가지고 있다]

예) 원과 도형의 관계.
	[원]은 [도형]이다 / 원 extends 도형 / 상속
	원과 점의 관계.
	[원]은 [점]을 가지고 있다 / class 원 { 한 점 }
	경찰과 권총의 관계.
	[경찰]은 [권총]을 가지고 있다 / class 경찰 { 권총 }
	
예) 원, 삼각형, 사각형을 만드는 설계도
원은 도형이다.
삼각형은 도형이다.
사각형은 도형이다.
>도형 : 추상화,일반화된 것 (그리다, 색상을 가지고 있다) >> 공통자원을 만드는 행위
>원 : 구체화, 특수화 (반지름, 한 점) >> 본인만이 가지는 특징
>점 : 좌표값 > (x,y)
원은 점을 가지고 있다.
삼각형은 점을 가지고 있다.
사각형은 점을 가지고 있다.

class Shape { 그리다, 색 } > 상속관계 (부모)
class Point { 좌표값 } > 포함관계 (부품)

구체화, 특수화 : circle, triangle

*/

//추상화, 일반화, 공통
class Shape {
	String color = "gold"; // 공통속성

	void draw() {
		System.out.println("도형을 그리다");
	}
}

//공통 (점)
class Point {
	int x;
	int y;

	Point() {
		// this.x = 1;
		// this.y = 1;
		this(1, 1); // 코드중복 방지
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//원을 만드세요 ( 원의 정의 : 원은 한 점과 반지름을 가지고 있다. )
//1.원은 도형이다 (is ~ a) : 도형
//2.원은 점을 가지고 있다 (has ~a) : 점	>>member field
//3.원은 반지름을 가지고 있다 (특수성) : r
//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값 (10, 15)를 가진다
//기본(초기값) 설정을 하지 앚ㅎ으면 반지름과 점을 값을 입력받을 수 없다. (원이 만들어 질 때)

/*
 * 삼각형 클래스를 만들어라 정의- 삼각형은 3개의 점과 색 그리고 그리다라는 기능을 가지고 있다 shape, point 제공받음 3개의
 * 좌표값, default로 그릴수 있고, 3개의 좌표값을 받아서 그릴 수 있다.
 * 
 */
class Circle extends Shape { // 상속
	Point point; // 포함
	int r; // 특수성

	Circle() {
		this(10, new Point(10, 15));
	}

	Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

class Triangle extends Shape { // shape를 상속 받았다
	Point point1;
	Point point2;
	Point point3;

	Triangle() { // 삼각형을 기본으로 생성 시 만들어지는 좌표
		this(new Point(0, 0), new Point(5, 5), new Point(0, 5));
	}

	Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
}

class Triangle2 extends Shape { // shape를 상속 받았다
	// Point point1;
	// Point point2;
	// Point point3;
	Point[] pointarr;

	Triangle2() { // 삼각형을 기본으로 생성 시 만들어지는 좌표
		this.pointarr = new Point[3];
		for (int i = 0; i < this.pointarr.length; i++) {
			this.pointarr[i] = new Point();
		}
	}

	Triangle2(Point[] pointarr) {
		this.pointarr = new Point[3];
	}

}

class Triangle3 extends Shape {
	Point[] pointarray;

	Triangle3() {
		// pointarray = new Point[3];
		// pointarray[0] = new Point(10,20);
		// pointarray[1] = new Point(10,20);
		// pointarray[2] = new Point(10,20);
		// pointarray = {new point(12,20)......} >> 문법적 오류때문에 선언 불가, 그렇다면 this메소드에서 쓰는 방법은
		this(new Point[] { new Point(10, 20), new Point(30, 40), new Point(50, 60) });
	}

	Triangle3(Point[] pointarray) {		//객체배열의 주소값을 넣어라
		this.pointarray = pointarray;
	}

	void trianglePoint() {
		for (Point point : this.pointarray) {
			System.out.printf("point : (%d %d)\t\n", point.x, point.y);
		}
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {

		Circle circle = new Circle();
		System.out.println("반지름:" + circle.r);
		System.out.println("분모:" + circle.color);
		System.out.println("좌표:" + circle.point.x); // 중요하다.
		System.out.println("좌표:" + circle.point.y);
		circle.draw(); // 부모 자원

		Circle circle2 = new Circle(20, new Point(10, 20));
		System.out.println("반지름:" + circle2.r);
		System.out.println("분모:" + circle2.color);
		System.out.println("좌표:" + circle2.point.x); // 중요하다.
		System.out.println("좌표:" + circle2.point.y);
		circle.draw(); // 부모 자원

		// default 삼각형 그리기
		Triangle triangle = new Triangle();
		System.out.println("부모 컬러 : " + triangle.color);
		System.out.printf("3개의 좌표 : (%d,%d) , (%d,%d), (%d,%d)\n", triangle.point1.x, triangle.point1.y,
				triangle.point2.x, triangle.point2.y, triangle.point3.x, triangle.point3.y);
		triangle.draw();

		// 오버로딩된 생성자로 내가 원하는 좌표의 삼각형 그리기
		Triangle triangle2 = new Triangle(new Point(10, 10), new Point(20, 20), new Point(5, 0));
		System.out.println("부모 컬러 : " + triangle2.color);
		System.out.printf("3개의 좌표 : (%d,%d) , (%d,%d), (%d,%d)\n", triangle2.point1.x, triangle2.point1.y,
				triangle2.point2.x, triangle2.point2.y, triangle2.point3.x, triangle2.point3.y);
		triangle2.draw();
		
		System.out.println("----------------");
		Triangle2 triangle3 = new Triangle2();
		System.out.println(triangle3.color);
		for(int i = 0; i > triangle3.pointarr.length; i++) {
			System.out.println(triangle3.pointarr[i]);
		}
		
		System.out.println("******************");
		Triangle3 tri = new Triangle3();
		tri.trianglePoint();
		tri.draw();
		
		Point[] pointarr = {new Point(60,50), new Point(40,30), new Point(20,10)};
		Triangle3 tri2 = new Triangle3(pointarr);
		tri2.trianglePoint();
		tri2.draw();
	}

}
