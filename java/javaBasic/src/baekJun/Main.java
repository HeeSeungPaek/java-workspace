package baekJun;


public class Main {
	public static void main(String[] args) {
		int i = 1;
		
		try {
			System.out.println( i / 0 );
		}catch (Exception e) {
			System.out.println("0���� �����̽��ϴ�!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			//System.exit(0);
		}
		
		System.out.println("main end");
	}
}