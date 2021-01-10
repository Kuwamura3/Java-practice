package practice;

public class Chapter15_1 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + " ‚Æ " + b + " ‚ÌÅ‘åŒö–ñ”‚ÍA " + gcd(a, b) + "‚Å‚·B");
	}
	
	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else {
			if (a > b) {
				a %= b;
			} else if (b > a) {
				b %= a;
			}
			return gcd(a, b);
		}
	}
}
