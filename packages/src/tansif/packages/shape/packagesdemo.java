package tansif.packages.shape;

public class packagesdemo {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(2, 3);
        Triangle t = new Triangle(2, 3, 4);

        
        System.out.println("Circle:");
        System.out.println("Area: " + c.getArea());

        
        System.out.println("\nRectangle:");
        System.out.println("Area: " + r.getArea());

        
        System.out.println("\nTriangle:");
        System.out.println("Area: " + t.getArea());
        
    }
}
