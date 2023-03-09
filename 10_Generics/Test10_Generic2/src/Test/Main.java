package Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Retangle> list1 = new ArrayList<>();
		list1.add(new Retangle());
		
		List<Circle> list2 = new ArrayList<>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		drawShapes(list1);
		drawShapes(list2);
	}
	
	 //phương thức chỉ nhận lớp con của lớp Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }
    
    
}
