package Test;

import java.util.Random;

public class CustomData extends Thread {
	public SharedData shareData;

	public CustomData(SharedData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int rad = r.nextInt(5);
			shareData.add(rad);
		}
	}
}
