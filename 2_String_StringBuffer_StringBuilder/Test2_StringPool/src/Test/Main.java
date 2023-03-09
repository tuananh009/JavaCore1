package Test;

public class Main {
	public static void main(String[] args) {
		int count = 100000;
		String[] str = new String[count];
		long start, end;
		
		start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			str[i] = new String("test "+i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time of " + count + " with 'new': " + (end - start) +"ms");
		start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			str[i] = new String("test "+i).intern();
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time of " + count + " with 'new': " + (end - start) +"ms");
		
	}
}
