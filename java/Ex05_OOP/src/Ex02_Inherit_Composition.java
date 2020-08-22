/*
�ǹ� (����ȯ��)
1���� Ŭ������ ������� ���� �� �� �ִ� �۾��� ����.
�ֳ��ϸ� �Ը� �׷��� ���� �ʱ� �����̴�.
������ �����ϴ� ���赵�� �������� ��������� �����̴�.
������� ���θ��� ������ �ؼ� �����غ��� ġ��.
�� �ֹ�������  ȸ������, ���, ��ǰ ��� ��� ������ �� ���� Ŭ������ ������ ���������� ����� �ȵȴ�
�׷��� ������ ������ ���ؼ� ���赵�� �ϳ��� ����� �Ŵ�.

���赵�� �ƹ��� ���� �ϴ���, ������ ������ �Ѵ�.
�� ������ �������� ���赵�� ���踦 �ξ��ִ°�.
1.����̶�� ����(is ~ a : ���) [������ �����̴�]
2.����(has ~ a : ����) [������ ������ ������ �ִ�]

��) ���� ������ ����.
	[��]�� [����]�̴� / �� extends ���� / ���
	���� ���� ����.
	[��]�� [��]�� ������ �ִ� / class �� { �� �� }
	������ ������ ����.
	[����]�� [����]�� ������ �ִ� / class ���� { ���� }
	
��) ��, �ﰢ��, �簢���� ����� ���赵
���� �����̴�.
�ﰢ���� �����̴�.
�簢���� �����̴�.
>���� : �߻�ȭ,�Ϲ�ȭ�� �� (�׸���, ������ ������ �ִ�) >> �����ڿ��� ����� ����
>�� : ��üȭ, Ư��ȭ (������, �� ��) >> ���θ��� ������ Ư¡
>�� : ��ǥ�� > (x,y)
���� ���� ������ �ִ�.
�ﰢ���� ���� ������ �ִ�.
�簢���� ���� ������ �ִ�.

class Shape { �׸���, �� } > ��Ӱ��� (�θ�)
class Point { ��ǥ�� } > ���԰��� (��ǰ)

��üȭ, Ư��ȭ : circle, triangle

*/

//�߻�ȭ, �Ϲ�ȭ, ����
class Shape {
	String color = "gold"; // ����Ӽ�

	void draw() {
		System.out.println("������ �׸���");
	}
}

//���� (��)
class Point {
	int x;
	int y;

	Point() {
		// this.x = 1;
		// this.y = 1;
		this(1, 1); // �ڵ��ߺ� ����
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//���� ���弼�� ( ���� ���� : ���� �� ���� �������� ������ �ִ�. )
//1.���� �����̴� (is ~ a) : ����
//2.���� ���� ������ �ִ� (has ~a) : ��	>>member field
//3.���� �������� ������ �ִ� (Ư����) : r
//���� �������� �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ (10, 15)�� ������
//�⺻(�ʱⰪ) ������ ���� �ؤ����� �������� ���� ���� �Է¹��� �� ����. (���� ����� �� ��)

/*
 * �ﰢ�� Ŭ������ ������ ����- �ﰢ���� 3���� ���� �� �׸��� �׸��ٶ�� ����� ������ �ִ� shape, point �������� 3����
 * ��ǥ��, default�� �׸��� �ְ�, 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�.
 * 
 */
class Circle extends Shape { // ���
	Point point; // ����
	int r; // Ư����

	Circle() {
		this(10, new Point(10, 15));
	}

	Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

class Triangle extends Shape { // shape�� ��� �޾Ҵ�
	Point point1;
	Point point2;
	Point point3;

	Triangle() { // �ﰢ���� �⺻���� ���� �� ��������� ��ǥ
		this(new Point(0, 0), new Point(5, 5), new Point(0, 5));
	}

	Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
}

class Triangle2 extends Shape { // shape�� ��� �޾Ҵ�
	// Point point1;
	// Point point2;
	// Point point3;
	Point[] pointarr;

	Triangle2() { // �ﰢ���� �⺻���� ���� �� ��������� ��ǥ
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
		// pointarray = {new point(12,20)......} >> ������ ���������� ���� �Ұ�, �׷��ٸ� this�޼ҵ忡�� ���� �����
		this(new Point[] { new Point(10, 20), new Point(30, 40), new Point(50, 60) });
	}

	Triangle3(Point[] pointarray) {		//��ü�迭�� �ּҰ��� �־��
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
		System.out.println("������:" + circle.r);
		System.out.println("�и�:" + circle.color);
		System.out.println("��ǥ:" + circle.point.x); // �߿��ϴ�.
		System.out.println("��ǥ:" + circle.point.y);
		circle.draw(); // �θ� �ڿ�

		Circle circle2 = new Circle(20, new Point(10, 20));
		System.out.println("������:" + circle2.r);
		System.out.println("�и�:" + circle2.color);
		System.out.println("��ǥ:" + circle2.point.x); // �߿��ϴ�.
		System.out.println("��ǥ:" + circle2.point.y);
		circle.draw(); // �θ� �ڿ�

		// default �ﰢ�� �׸���
		Triangle triangle = new Triangle();
		System.out.println("�θ� �÷� : " + triangle.color);
		System.out.printf("3���� ��ǥ : (%d,%d) , (%d,%d), (%d,%d)\n", triangle.point1.x, triangle.point1.y,
				triangle.point2.x, triangle.point2.y, triangle.point3.x, triangle.point3.y);
		triangle.draw();

		// �����ε��� �����ڷ� ���� ���ϴ� ��ǥ�� �ﰢ�� �׸���
		Triangle triangle2 = new Triangle(new Point(10, 10), new Point(20, 20), new Point(5, 0));
		System.out.println("�θ� �÷� : " + triangle2.color);
		System.out.printf("3���� ��ǥ : (%d,%d) , (%d,%d), (%d,%d)\n", triangle2.point1.x, triangle2.point1.y,
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
