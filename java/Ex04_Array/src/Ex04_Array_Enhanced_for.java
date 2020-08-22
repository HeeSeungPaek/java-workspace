
public class Ex04_Array_Enhanced_for {
	public static void main(String[] args) {
		//Today's Point
		//Enhanced for문
		//JAVA : for( Type 변수명 : 배열or컬렉션 ) { 실행구문  변수명...}
		//C# : for( Type 변수명 in 배열or컬렉션 ) { 실행구문  변수명...}
		//JavaScript : for( Type 변수명 in 배열or컬렉션 ) { 실행구문  변수명...}
		
		int[] arr3 = {5, 6, 7, 8, 9};
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//Enhanced for
		for(int value : arr3) {	//향상된 for문은 내부적으로 while이 있다.
			System.out.println(value);
		}
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		for(String value : strarr) {
			System.out.println(value);
		}
	}
}
