package Test;

public class Main2 {
	public static void main(String[] args) {
		String str = "";
		StringBuffer strBuffer = new StringBuffer();
		StringBuilder strBuilder = new StringBuilder();
		
		int n = 10000;
		long start,start2,start3,end,end2,end3;
		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			str +='a';
		}
		end = System.nanoTime();
		start2 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			strBuffer.append("a");
		}
		end2 = System.nanoTime();
		start3 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			strBuilder.append("a");
		}
		end3 = System.nanoTime();
		System.out.println("String: " + (end - start));
		System.out.println("String Buffer: " + (end2 - start2));
		System.out.println("String Builder: " + (end3 - start3));
		
		
	}
}
