/*
Today Point
[상속관계]에서 Override : 상속관계에서 자식이 부모의 함수를 [ 재정의 ]
[상속관계]에서 [자식 클래스]가 [부모 클래스]의 메서드를 재정의 (내용을 바꾼다)
재정의의 의미 : 틀의 변화(함수의 이름, 타입)가 없고, {내용만 변화}시키는 것

문법)
1.부모함수의 이름 동일
2.부모함수의 parameter와 동일
3.부모함수의 return type 형식이 동일
4.결국 {실행블럭 안의 코드}만 변경이 가능하다.

Override를 왜 쓸까?

*/
class Point2 {	//한 점을 가지는 클래스
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}

class Point3D extends Point2 {
	int z = 6;
	
	//재정의 : 부모가 가지고 있는 함수를 자식이 상속관계 속에서 확장하는 것.
	//문제점 : 믿음이 안간다... 재정의를 제대로 했나?
	//@Override >> 컴파일러 또는 개발 툴이 재정의된 함수인지 아닌지 검증을 부탁하는 코드라는 뜻
	//Annotation > java code만으로 전달할 수 없는 [부가적인 정보]를 컴파일러와 개발 툴에게 전달하는 것.
	//맞지 않으면 Error
	//@Override >> 지금 이 함수가 정말 재정의가 된 게 맞는지 확인해봐!
	@Override
	String getPosition() {
		return this.x + "/" + this.y + "/" + this.z;
	}
	
}

public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		String result = p.getPosition();	//재정의 된 함수가 호출되더라...
		System.out.println(result);
	}

}



















