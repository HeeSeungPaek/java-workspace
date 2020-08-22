package day05;
//컨트롤러 클래스는 출력하는 코드가 없다.
//단순히 데이터를 가공하기만 한다.
//원래대로라면 데이터베이스 통신도 담당해야하지만
//DB가 없으므로 그냥 ArrayList를 필드로 갖는다.
import java.util.ArrayList;

public class ParkController {
	
	private ArrayList<ParkVO> list;
	
	public ParkController() {
		list = new ArrayList<>();
	}

	//list의 현재 크기를 리턴하는 메소드
	public int size() {
		return list.size();
	}
	
	//파라미터로 넘어온 ParkVO 객체가 리스트에 존재하는지 체크하는 메소드
	public boolean contains(ParkVO p) {
		return list.contains(p);
	}
	
	//파라미터로 넘어온 ParkVO 객체를 리스트에 추가하는 메소드
	public void add(ParkVO p) {
		list.add(p);
	}
	
	//파라미터로 넘어온 int 값이 유효한 시간인지 체크하는 메소드
	public boolean validateTime(int time) {
		int hour = time / 100;
		int minute = time % 100;
		
		return (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59);
	}
	
	public ParkVO get(ParkVO p) {
		//먼자 p와 같은 plateNumber를 가진 list의 요소의 인덱스를 찾는다.
		//어떻게? indexOf 메소드로!
		int index = list.indexOf(p);
		return list.get(index);
	}
	
	public void remove(ParkVO p) {
		list.remove(p);
	}
}
