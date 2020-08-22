package day04;
//ArrayList
//배열을 클래스처럼 쓸 수 있게 만들어놓은 어레이리스트를 사용해보자
import java.util.ArrayList;

public class Ex03ArrayList {
	public static void main(String[] args) {
		//ArrayList는 
		//<>안에 무엇의 집합인지 적어준다.
		//<>안에는 클래스만 들어갈 수 있다.
		//"강사님, 그럼 기본형 데이터타입들은 ArrayList에 못들어가나요?"
		//그런 걱정을 방지하기 위해 자바는 기본형 데이터타입을 클래스화 시켜놓았다.
		//그런 기본형 데이터타입을 클래스로 만들어놓은 클래스들을
		//우리는 포장 클래스(wrapper class)라고 한다.
		//int의 포장 클래스는 Integer이고, double의 포장 클래스는 Double이다.
		
		//ArrayList의 메소드들은 클래스의 equals()메소드를 적극활용한다.
		//따라서 여러분들이 만든 클래스로 ArrayList를 만들려고 하면
		//항상 equals()메소드를 만드는 것이 중요하다.
		
		//ArrayList의 장점은 클래스를 기반으로 하였기 때문에
		//객체 친화적이고, 크기 제한이 없다는 것이다.
		//즉, 배열에서 가장 불편했던 점을 ArrayList가 개선한 것.
	
		ArrayList<Student> studentList = new ArrayList<>();
		//어레이리스트의 현재크기를 알고 싶을 떈 size()메소드를 실행하면 된다.
		System.out.println("studentList의 현재 크기 : " + studentList.size());
		
		Student s1 = new Student("1번", 1, 1, 1);
		Student s2 = new Student("2번", 2, 2, 2);
		Student s3 = new Student("3번", 3, 3, 3);
		Student s4 = new Student("4번", 4, 4, 4);
		Student s5 = new Student("5번", 5, 5, 5);
		
		//어레이리스트에 객체를 추가할 때에는
		//add(객체)로 추가한다.
		studentList.add(s1);
		System.out.println("studentList의 현재 크기 : " + studentList.size());
		studentList.add(s2);
		System.out.println("studentList의 현재 크기 : " + studentList.size());
		studentList.add(s3);
		System.out.println("studentList의 현재 크기 : " + studentList.size());
		studentList.add(s4);
		System.out.println("studentList의 현재 크기 : " + studentList.size());
		studentList.add(s5);
		System.out.println("studentList의 현재 크기 : " + studentList.size());
		
		//리스트의 요소를 호출할 때에는
		//get(인덱스)로 호출하면 된다.
		System.out.println("studentList.get(0):" + studentList.get(0));
		
		//리스트에 특정 객체가 존재하는지 확인할 때에는
		//contains(객체)로 확인 가능하다.
		//contains는 equals()를 사용하는 메소드이기 때문에
		//equals()가 true가 나오는 객체를 주면 된다.
		
		Student s5duplicated = new Student("5번", 5, 5, 5);
		Student s6 = new Student("6번", 6, 6, 6);
		
		System.out.println("list.contains(s5Duplicated): "
				+studentList.contains(s5duplicated));
		System.out.println("list.contains(s6): "
				+studentList.contains(s6));
		
		//만약 해당 객체의 index가 알고 싶다면
		//list.indexOf(객체)를 실행하면 된다.
		//만약 해당 객체가 존재하지 않는다면
		//-1이 리턴된다.
		System.out.println("indexOf(s5Duplicated) : "
				+ studentList.indexOf(s5duplicated));
		System.out.println("indexOf(s6) : "
				+ studentList.indexOf(s6));
		
		//list에서 요소를 제거할 때는 2가지 방법으로 제거가 가능하다.
		//1. index로 삭제 -> 객체.remove(0);
		//2. 객체로 삭제
		System.out.println("list.get(0): "+studentList.get(0));
		studentList.remove(0);
		System.out.println("list.get(0): "+studentList.get(0));
		
		System.out.println("list.contains(s5Duplicated): "
				+studentList.contains(s5duplicated));
		studentList.remove(s5duplicated);
		System.out.println("list.contains(s5duplicated): "
				+studentList.contains(s5duplicated));
		
		//만약 특정 위치에 특정 객체를 끼어넣고 싶으면
		//add(끼어넣을 index, 객체)로 넣어주면 된다.
		//원래 있던 번호부터는 한칸씩 뒤로 밀리게 된다.
		System.out.println(studentList.get(2));
		studentList.add(2, s5duplicated);
		System.out.println(studentList.get(2));
	}
}
