package kr.or.bit;

import java.io.IOException;

/*
설계도(class)를 만들 때, 혹시나 문제가 발생하지 않을까?
사실은 내가 잘만들엇다고 했지만 그걸 쓰는사람들이 실수하거나 잘못해서
문제가 발생할 소지가 있다면, 문제가 발생할 수있는 부분에 대해서 프로그램을
강제로 죽게 하지 않겠다!
	>> 내 설계도를 사용하는 개발자가 예외를 강제로 처리..안전

생성자나 함수를 만들 때 강제로 예외를 처리하게 할 수 있다

*/
public class ExClass { // 내 생성자를 가져다 쓸 때 예외"들"을 처리하겠다는 말! (throws 복수동사)
	public ExClass(String path) throws IOException, NullPointerException {
		System.out.println(path);
	}

}
