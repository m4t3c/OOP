package exercises.oop.basic;

import java.awt.*;

/**
 * A representation of a Circle on a 2D plane
 */
public class Circle {
    private Point center;
    private int radius;

    /**
     * Constructor initialize a new circle with specified center and radius.
     * @param center A point representing the center of the circle.
     * @param radius The radius of the circle.
     */
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Returns the area of the circle.
     * @return the area of the circle.
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Returns the perimeter of the circle.
     * @return the perimeter of the circle.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Verifies if a point is inside the circle.
     * @param point the point to be verified
     * @return true if the point is inside false otherwise.
     */
    public boolean contains(Point point) {
        return center.distance(point) < radius;
    }

    /**
     * Moves the circle of a 2D plane
     * @param dx the X movement
     * @param dy the Y movement
     */
    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
