package practice;

public class Chapter15_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++ ) {

			ThreadSample ts = new ThreadSample(i);

			Thread thread = new Thread(ts);

			thread.start();
		}
		
		for (int i = 1; i <= 3; i++ ) {
			try {
				Thread.sleep(1000);
				System.out.println("Chapter15_4�̃X���b�h�@�F�@" + i + "���");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
