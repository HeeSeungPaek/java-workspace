package day04;
//어레이리스트를 사용한 학생관리 프로그램
import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList studentList = new ArrayList<>();
		
		while(true) {
			System.out.print("1.입력 2.출력 3.종료");
			System.out.print("> ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				//추가할 때에는 임시 객체를 만들어서
				//리스트에 추가하면
				//우리가 임시 객체를 직접 보지 못하지만
				//리스트가 잘 보관해준다.
				Student s = new Student();
				System.out.print("이름 : ");
				scanner.nextLine();
				s.setName(scanner.nextLine());
				
				System.out.print("국어 : ");
				s.setKorean(scanner.nextInt());
				
				System.out.print("영어 : ");
				s.setEnglish(scanner.nextInt());
				
				System.out.print("수학 : ");
				s.setMath(scanner.nextInt());
				
				studentList.add(s);
				
			}else if(choice == 2) {
				if(studentList.size() > 0) {
					for(int i = 0; i < studentList.size(); i++) {
						System.out.println(studentList.get(i));
					}
				}
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		
		scanner.close();
		
	}
}
