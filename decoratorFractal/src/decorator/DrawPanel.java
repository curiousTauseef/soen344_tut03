package decorator;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private Triangle t;
	public DrawPanel(Triangle t) {
		this.t = t;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		t.draw(g);
	}
}
