
public class Ex04_Array_Enhanced_for {
	public static void main(String[] args) {
		//Today's Point
		//Enhanced for��
		//JAVA : for( Type ������ : �迭or�÷��� ) { ���౸��  ������...}
		//C# : for( Type ������ in �迭or�÷��� ) { ���౸��  ������...}
		//JavaScript : for( Type ������ in �迭or�÷��� ) { ���౸��  ������...}
		
		int[] arr3 = {5, 6, 7, 8, 9};
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//Enhanced for
		for(int value : arr3) {	//���� for���� ���������� while�� �ִ�.
			System.out.println(value);
		}
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		for(String value : strarr) {
			System.out.println(value);
		}
	}
}
