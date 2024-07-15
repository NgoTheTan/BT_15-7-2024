import java.text.DecimalFormat;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("###.#");
        return "Circle[" + "center=" + this.center.toString() + ",radius="
                + df.format(this.radius) + ",color=" + this.getColor() 
                + ",filled=" + String.valueOf(this.isFilled()) + "]";
    }

    public void move(double distanceX, double distanceY) {
        center.move(distanceX, distanceY);
    }
}