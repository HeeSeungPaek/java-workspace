import java.io.IOException;

import kr.or.bit.ExClass;

public class Ex04_Exception {

	public static void main(String[] args) {
		// File f = new File("C:\\Temp"); //실제 경로가 없을 경우 오류가 발생할 수 있음!
		try {
			ExClass ex = new ExClass("Temp"); // 이런 경로가 없을때, 안전장치를 마련해서 프로그램을 죽지 않게 하겠다는 뜻
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
