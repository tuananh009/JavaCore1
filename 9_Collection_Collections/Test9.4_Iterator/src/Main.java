import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Java");
		arr.add("C#");
		arr.add(".Net");
		arr.add("HTML");
		arr.add("VueJS");
		System.out.println(arr);
		Iterator<String> words = arr.iterator();
		while (words.hasNext()) {
			String element = words.next();
			System.out.println(element);
			words.remove();
		}
		System.out.println(arr);
	}
}
