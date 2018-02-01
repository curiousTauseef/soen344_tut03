package decorator;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Triangle {
	protected Point p1, p2, p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle(int size) {
		int triangleHeight = (int) Math.round(size * Math.sqrt(3.0) / 2.0);
        p1 = new Point(0, triangleHeight);
        p2 = new Point(size / 2, 0);
        p3 = new Point(size, triangleHeight);
	}

	public void draw(Graphics g) {
		Polygon p = new Polygon();
        p.addPoint(p1.x, p1.y);
        p.addPoint(p2.x, p2.y);
        p.addPoint(p3.x, p3.y);
        g.drawPolygon(p);
	}
}
