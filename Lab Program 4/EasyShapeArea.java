import java.util.Scanner;
abstract class Shape {
     int value1;
     int value2;
    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        this.value1 = length;
        this.value2 = width;
    }
    @Override
    public void printArea() {
        double area = (double)value1 * value2;
        System.out.printf("Area of Rectangle (L=%d, W=%d): %.2f\n", value1, value2, area);
    }
}

class Triangle extends Shape {

    public Triangle(int base, int height) {
        this.value1 = base;
        this.value2 = height;
    }
    @Override
    public void printArea() {
        double area = 0.5 * value1 * value2;
        System.out.printf("Area of Triangle (B=%d, H=%d): %.2f\n", value1, value2, area);
    }
}
class Circle extends Shape {
    private static final double PI = Math.PI;
    public Circle(int radius) {
        this.value1 = radius;
        this.value2 = 0;
    }
    @Override
    public void printArea() {
        double area = PI * value1 * value1;
        System.out.printf("Area of Circle (Radius=%d): %.2f\n", value1, area);
    }
}
public class EasyShapeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Shape Area Calculation Program ---");
        System.out.print("Enter Rectangle Length: ");
        int rLength = scanner.nextInt();
        System.out.print("Enter Rectangle Width: ");
        int rWidth = scanner.nextInt();
        Rectangle rect = new Rectangle(rLength, rWidth);
        rect.printArea();
        System.out.print("\nEnter Triangle Base: ");
        int tBase = scanner.nextInt();
        System.out.print("Enter Triangle Height: ");
        int tHeight = scanner.nextInt();
        Triangle tri = new Triangle(tBase, tHeight);
        tri.printArea(); 
        System.out.print("\nEnter Circle Radius: ");
        int cRadius = scanner.nextInt();
        Circle circ = new Circle(cRadius);
        circ.printArea();

        scanner.close();
    }
}