package Test;

public class Main {

	    public static void main(String[] args) {

	        StringBuffer buffer = new StringBuffer();

	        Runnable task1 = new Runnable() {
	            @Override
	            public void run() {
	                synchronized (buffer) {
	                	System.out.println("1");
	                    buffer.append("Hello");
	                    try {
	                        Thread.sleep(1000);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                    buffer.append(" World");
	                    
	                }
	            }
	        };

	        Runnable task2 = new Runnable() {
	            @Override
	            public void run() {
	                synchronized (buffer) {
	                    System.out.println(buffer.toString());
	                }
	            }
	        };

	        Thread thread1 = new Thread(task1);
	        Thread thread2 = new Thread(task2);

	        thread1.start();
	        thread2.start();
	    }
	}

