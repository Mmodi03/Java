package tansif.packages.shape;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
