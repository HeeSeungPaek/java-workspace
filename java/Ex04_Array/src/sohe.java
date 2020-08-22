public class sohe {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 45 + 1);
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45 + 1);
				    i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
//		for (int a : lotto) {
//			System.out.println(a);
//		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto [" + i + "] = " + lotto[i]);
		}
	}
}