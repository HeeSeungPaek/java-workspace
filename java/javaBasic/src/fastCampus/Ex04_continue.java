package fastCampus;

public class Ex04_continue {
	public static void main(String[] args) {
		//3�� ����� ����غ���
		
		int num;
		for(num = 1; num <= 100; num++) {
			
			if(num%3 != 0) continue;
			
			System.out.println(num);
		}
	}
}
