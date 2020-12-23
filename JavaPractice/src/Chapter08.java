
public class Chapter08 {
	public static void main(String[] args) {
		int number1 = 1;
		while (number1 < 5) {
			System.out.println(number1 + "‚Ì“ñæ‚Í" + number1 * number1);
			number1++;
		}

		int[] array = { 1, 2, 3, 4 };
		for (int number2 : array) {
			System.out.println("number2 = " + number2);
		}

		for (int number2 : array) {
			if(number2 % 2 == 0) {
				continue;
			}
			System.out.println("number3 = " + number2);
		}
		
	}
}
