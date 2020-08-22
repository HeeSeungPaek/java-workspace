public class Ex10_Static_Method {

	public void method() {
		System.out.println("나 일반 함수 야.");
	}
	
	public static void smethod() {
		System.out.println("나 Static 함수 야.");
	}
	
	public static void main(String[] args) {
		
		smethod();		//스태틱 메소드니까 그냥 쓸 수 있다. 찜찜하면
		Ex10_Static_Method.smethod();//이렇게 쓰면 돼
		
		Ex10_Static_Method e = new Ex10_Static_Method();
		e.method();		//하지만 일반 method는 객체를(클래스를) 힙메모리에 올린 다음 사용이 가능하니
						//클래스 이름과 같은 타입의 객체를 하나 생성한 후에 일반함수를 불러와야 돼
							
	}

}
