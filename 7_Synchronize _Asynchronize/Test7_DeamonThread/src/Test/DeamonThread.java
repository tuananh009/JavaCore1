package Test;

public class DeamonThread {

	public static void main(String[] args) {
		Thread deamonTh = new Thread(new DeamonTask());
		deamonTh.setDaemon(true);
		deamonTh.start();
		System.out.println("Deamon is finshing");
	}
}

class DeamonTask implements Runnable{
	public void run() {
		while (true) {
			try {
				System.out.println("Deamon đang chạy");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}