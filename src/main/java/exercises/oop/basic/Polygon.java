package exercises.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

/**
 * A representation of an irregular polygon
 */
public class Polygon {
    private final Point2D.Double[] vertices;

    /**
     * Constructs a new polygon from an array of points representing the vertices.
     * @param vertices the Point array representing the vertices
     */
    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("At least three vertices are required");
        }
        this.vertices = vertices;
    }

    /**
     * Returns the number of vertices.
     * @return the number of vertices.
     */
    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     * Returns the perimeter of the polygon
     * @return the perimeter of the polygon
     */
    public double getPerimeter(){
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            perimeter += Math.hypot((vertices[i].x - vertices[next].x), (vertices[i].y - vertices[next].y));
        }
        return perimeter;
    }

    /**
     * Returns the area of the polygon
     * @return the area of the polygon
     */
    public double getArea() {
        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[next].x * vertices[i].y - vertices[next].y - vertices[i].x);
        }
        return Math.abs(area/2);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
