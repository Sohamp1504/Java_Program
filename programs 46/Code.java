//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively

public class Code{
    private int length, breadth;

    
    public Code(int l, int b) {
        length = l;
        breadth = b;
    }

    
    public int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
       
        Code rect1 = new Code(4, 5);
        Code rect2 = new Code(5, 8);
      
        System.out.println("Area of Rectangle 1: " + rect1.Area());
        System.out.println("Area of Rectangle 2: " + rect2.Area());
    }
}
