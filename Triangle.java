public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Point a, Point b, Point c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return this.a;
    }

    public Point getB() {
        return this.b;
    }

    public Point getC() {
        return this.c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public String toString() {
        return "Triangle[" + this.a.toString() + "," + this.b.toString() + "," + this.c.toString()
                + ",color=" + this.getColor() + ",filled=" + String.valueOf(this.isFilled()) + "]";
    }

    public void move(double distanceX, double distanceY) {
        this.a.move(distanceX, distanceY);
        this.b.move(distanceX, distanceY);
        this.c.move(distanceX, distanceY);
    }
}