package Test;

public class Outer {
    private class Nested {
        public void displayMessage() {
            System.out.println("Đây là Nester Class");
        }
    }
    
    private static class StaticNested {
        public void displayMessage() {
            System.out.println("Đây là Static Nester Class");
        }
    }
    
    public void showMessage() {
        Nested nested = new Nested();
        nested.displayMessage();
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showMessage();
        
        StaticNested staticNested = new StaticNested();
        staticNested.displayMessage();
    }
}

