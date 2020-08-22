package day02;
//중첩 for loop
//for loop 속 for loop이 있는데
//바깥쪽 for loop이 한번 반복할 동안
//안쪽 for loop은 처음부터 끝까지 반복이 된다.

public class Ex10For03 {
	public static void main(String[] args) {
		for(int i = 0; i <= 3; i++) {
			for(int j = 10; j < 13; j++) {
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
	}
}
