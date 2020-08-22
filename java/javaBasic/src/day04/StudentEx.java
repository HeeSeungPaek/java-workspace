package day04;

public class StudentEx {
	public static void main(String[] args) {

		Student s1 = new Student();
		// 객체의 필드나 메소드를 접근할 때에는
		// [객체.필드] 혹은 [객체.메소드] 로 접근한다.

		//s1.name = "조재영";에서 private설정, setter와 getter 설정 후
		//아래와 같이 s1.setName("조재영"); 로 입력한다. 
		s1.setName("조재영");
		//s1.korean = 100;에서 아래와 같이 변경하여 선언
		s1.setKorean(100);
		s1.setEnglish(80);
		s1.setMath(91);
		s1.printInfo();
		System.out.printf("총점: %03d 점, 평균:%.2f 점\n", s1.calculateSum(), s1.calculateAverage());

		Student s2 = new Student();
		s2.setName("김철수");
		s2.setKorean(90);
		s2.setEnglish(89);
		s2.setMath(88);
		s2.printInfo();
		System.out.printf("총점: %03d점, 평균: %.2f점\n",
				s2.calculateSum(),
				s2.calculateAverage());
		
		Student s3 = new Student("이영희", 80, 80, 80);
		s3.printInfo();
		
		System.out.println(s1);
		
		//객체의 비교를 위해 equals를 해보자
		Student s4 = new Student("이영희", 80, 80, 80);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		System.out.println("*s3.equals(s4):"+s3.equals(s4));
	}
}
