
public class Assignment2 {
	public static void main(String[] args) {
		//10행 10열로 출력한다.
		//
		
		String number = " ";
		
		for(int i = 1; i <= 100; i++) {
			if(i/10 == 0) {
				System.out.println();
			}else
				System.out.print(i+number);
		}
	}
}
