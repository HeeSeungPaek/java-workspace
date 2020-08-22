package subject;

/*
시나리오
- 자전거 대여를 운영하는 회사를 창업하려 한다
-그래서 자전거가 필요하다
-자전거는 n대가 필요하다 자전거의 성인용의 바퀴는 17인치이고 바디는 200cm이고 두발 자전거, 핸들의 크기는 30cm 이다.
	
	성인용자전거의 색상은 3가지이다 (검정색,흰색,빨간색) 이용자는 색상을 고를 수 있다.
	총 자전개 개수는 10개로  이며 창업자,이용는 현재 각각 몇대 출고 됐는지 알 수있다.
-따릉이 대여 기능
이름과 생년월일을 작성하면 대여가 가능하다.
이름과 생년월일을 작성하면 반납이 가능하다.
대여시간과 반납시간을 기록하되 정액권으로 1시간권 3시간권 올데이를 선택할 수 있으며 초과분에 대해 시간당 1000원의 요금이 부과된다
*/

public class Bycicle {
	
	private static int handle = 30;
	private static int body = 200;
	private static int wheel = 17;
	private String color;
	private static int count;
	
	public static int getCount() {
		return count;
	}

	/*public static void setCount(int count) {
		Bycicle.count = count;
	}*/
	
	//자전거를 빌렸을 때 수행되어야 하는 메소드(자전거 수 -1)
	public static void minusCount() {
		count -= 1;
	}

	public Bycicle() {
		this("black");
	}

	public Bycicle(String color) {
		this.color = color;
	}

	public int getHandle() {
		return handle;
	}

	public int getBody() {
		return body;
	}

	public int getWheel() {
		return wheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
