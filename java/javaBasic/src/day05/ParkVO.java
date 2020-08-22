package day05;
//MVC 패턴: 
// MVC 패턴이란 프로그램을 만들 때 MODEL, VIEW, CONTROLLER 3가지로 프로그램을 쪼개어 
// 개발하는 방법이다. 개발 자체는 어려워질 수 있어도, 유지보수는 쉬워진다. 
// 모델 : 프로그램에서 쓰일 데이터를 클래스로 바꿔놓은 형태 
// 뷰 : 사용자가 보게 될 화면 
// 컨트롤러 : 사용자의 요청에 따라 데이터를 가공해서 보내주는 클래스 
//"마술의 숫자" : 프로그래밍에서 하드코딩을 할 때 쓰는 숫자. 어디서 튀어나왔는지 
// 모르는 숫자가 코드에 박혀있을 때 마술의 숫자라고한다. 
// 마술의 숫자는 상수를 선언하고 사용해서 예방할 수 있다.
public class ParkVO {
	//Value Object의 줄임말로써
	//주로 모델 클래스에 붙여지는 접미사이다.
	//VO에는 필드와 Object 클래스로부터 받은 메소드들을
	//오버라이딩 하는 메소드들과 게터 세터 정도만 들어가게 된다.
	//필드
	//차량입고시간
	private int inTime;
	//차량번호
	private String plateNumber;

	//메소드
	//getter / setter
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	
	public int getInTime() {
		return inTime;
	}
	
	
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ParkVO) {
			ParkVO p = (ParkVO)obj;
			if(plateNumber.equals(p.plateNumber)) {
				return true;
			}
		}
		
		return false;
	}
}
