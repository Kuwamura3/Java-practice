package practice;

public class ThreadSample implements Runnable {
	int num;
	
	public ThreadSample(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("ThreadSample" + num + "�̃X���b�h�@�F�@" + i + "���");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
