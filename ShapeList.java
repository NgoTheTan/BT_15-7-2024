import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    private List<Shape> shapeList = new ArrayList<Shape>();

    public void getCurrentShape() {
        for (Shape s : this.shapeList) {
            System.out.println(s.toString());
        }
    }

    public void draw(Shape s) {
        shapeList.add(s);
    }

    public void moveShape(double distanceX, double distanceY, Shape s) {
        if (shapeList.contains(s)) {
            s.move(distanceX, distanceY);
        } else {
            System.out.println("Can't find the shape to move!");
        }
    }

    public void removeDuplicate() {
        for (Shape s : this.shapeList) {
            for (Shape s2 : this.shapeList) {
                if (s2 != s) {
                    if ((s instanceof Point) && (s2 instanceof Point)) {
                        Point ps = (Point) s;
                        Point ps2 = (Point) s2;
                        if (ps.getX() == ps2.getX() && ps.getY() == ps2.getY()) {
                            shapeList.remove(s2);
                        }
                    } else if ((s instanceof Circle) && (s2 instanceof Circle)) {
                        Circle cs = (Circle) s;
                        Circle cs2 = (Circle) s2;
                        if (cs.getCenter() == cs2.getCenter()) {
                            if (cs.getColor() == cs2.getColor()) {
                                if (cs.getRadius() <= cs2.getRadius() && cs2.isFilled()) {
                                    shapeList.remove(s);
                                } else if (cs.getRadius() >= cs2.getRadius() && cs.isFilled()) {
                                    shapeList.remove(s2);
                                } else if (cs.getRadius() == cs2.getRadius() && !cs.isFilled() && cs2.isFilled()) {
                                    shapeList.remove(s2);
                                }
                            } else {
                                if (cs.getRadius() == cs2.getRadius()) {
                                    shapeList.remove(s2);
                                }
                            }
                        }
                    } else if ((s instanceof Triangle) && (s2 instanceof Triangle)) {
                        Triangle ts = (Triangle) s;
                        Triangle ts2 = (Triangle) s2;
                        if (ts.getA() == ts2.getA() && ts.getB() == ts2.getB() && ts.getC() == ts2.getC()) {
                            shapeList.remove(s2);
                        }
                    } else if ((s instanceof Rectangle) && (s2 instanceof Rectangle)) {
                        Rectangle rs = (Rectangle) s;
                        Rectangle rs2 = (Rectangle) s2;
                        if (rs.getTopLeft() == rs2.getTopLeft() && rs.getLength() == rs2.getLength()
                                && rs.getWidth() == rs2.getWidth()) {
                            shapeList.remove(s2);
                        }
                    }
                }
            }
        }
    }
}