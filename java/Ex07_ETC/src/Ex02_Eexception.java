public class Ex02_Eexception {
	public static void main(String[] args) {

		// 개발자가 예외처리를 예측 못하는 이유.
		int num = 100;
		int result = 0;

		System.out.println("mmain start");

		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10); // 0~9까지 임의의 난수
				System.out.println("result : " + result + " ,i : " + i);
			}
		} catch (ArithmeticException e) { // try에서 문제가 발생하면 문제에 맞는 객체가 자동으로 생성되고,
			// 그 객체의 주소값이 catch에게 전달된다.
			// 근데 Exception은 부모타입이라 예외가 어떤게 나오던 다 받아준다.

			System.out.println("문제가 발생. 관리자에게 메일 발송");
			System.out.println("원인 : " + e.getMessage());
			// catch (Exception e) >> 가독성이 떨어진다! 왜? 아니 안돌려봐서 모르겠는데 이게 대체 무슨 이유땜에...
			// 그렇다면 >> 오류 catch 안에 해당 오류의 객체를 넣어준다.
			// Arithmetic으로 바꾸면 산술문제는 거를 수 있다. 그런데 다른 문제는 못잡는다!
			// 그럴 때 사용하는 게 catch를 더 쓰는 거다!
		} catch (NullPointerException e) {
			// NullPointerException는 내가 처리할게!
			// -> 위의 연산 예외를 제외한 나머지는 내가 처리한다는 의미!
		} catch (Exception e) {
			// 여러개의 catch를 가져가기 위해서는
			// 작은 예외처리 클래스를 먼저 catch해주고..
			// 큰 catch(Exception객체)를 나중에 써준다!
			// [연산 예외], [null 예외] 를 제외한 나머지는 내가 처리할게!
			// 이렇게 위에서부터 작은 예외객체를 선언해 주는 이유 >>> 가독성을 높인다!! (이게 무슨의미일까?)
			// 작은 예외를 먼저 써줌으로써, try의 코드는 이런 예외가 나올 수 있겠구나 예측이 가능한 코드가 되기 때문에 가독성이 올라간다! }

			// 이렇게 의심스러운 코드에 대해서는 예외처리를 반드시 해야한다!
			/*
			 * for(int i = 0; i < 10; i++) { result = num / (int)(Math.random() * 10);
			 * //0~9까지 임의의 난수 System.out.println("result : " + result + "i : " + i); }
			 */

			System.out.println("main end");
		}
	}
}
