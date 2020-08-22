import java.io.IOException;

/*
>>CD 한장의 게임을 설치할 때
>>1. 설치파일 >> C:Temp >> 복사
>>2. 복사한 파일을 가지고 설치
>>3. 정상 설치 > C:Temp > 복사한 파일을 삭제
>>4. 비정상 설치 > 강제 종료 > 복사한 파일을 삭제

*/


public class Ex03_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}
	
	public static void main(String[] args) {
		
		//copyFiles();
		//startInstall();
		//실제로는 예외가 아니지만
		//강제로 예외 발생 : 개발자가 임의로 문제를 발생시켜서
		//강제로 예외를 처리하는 방법
		//코드 : 예외 객체를 직접 생산... 개발자가 직접 new > 예외 > throw
		// throw new IOException(); > 트라이 캐치 파이널리 안에서 한다.
		//fileDelete();
		
		try {
			copyFiles();
			startInstall();
			throw new IOException("Install중 문제가 발생");	//개발자가 임의로 예외를 발생시킨 것
		} catch (Exception e) {
			System.out.println("예외 메세지 출력 : " + e.getMessage());
			//fileDelete();
		} finally { //강제 실행 블록 : 예외가 발생하던 하지않던 무조건 실행한다!
			fileDelete();
			
			//주로 자원을 해제하는 코드들을 적으면 된다
		}
		System.out.println("main end");
		
		//***********************************************************
		// 함수의 강제종료 : return이 있다고 하더라도, finally블록은 강제로 실행된다.(특히 죽기 전에)
		
	}
}
