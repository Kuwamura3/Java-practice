
public class If02 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + "��5�����ł�");
		} else if (number < 10) {
			System.out.println(number + "��5�ȏ�A10�����ł�");
		} else if (number < 15) {
			System.out.println(number + "��10�ȏ�A15�����ł�");
		} else {
			System.out.println(number + "��15�����łȂ��ł�");
		}
	}
}