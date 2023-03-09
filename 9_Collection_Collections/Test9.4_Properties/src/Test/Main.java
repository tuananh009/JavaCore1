package Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Properties pro = System.getProperties();
		Set set = pro.entrySet();
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " = " + entry.getValue() + " ");
 		}
	}
}
