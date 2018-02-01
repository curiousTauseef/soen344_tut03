package decorator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawFrame extends JFrame {
	private static final int SIZE = 500;
	
	public DrawFrame() {
		super();
		setVisible(true);
		setSize(SIZE+20, SIZE-20);

		//TODO Create a triangle		
		//TODO Create a DecoratedTriangle with the triangle from above inside
		
		DecoratedTriangle dt = new DecoratedTriangle(new Triangle(SIZE));
		
		for(int i=0; i<2; i++) {
			//TODO assign to the triangle as new triangle inside the original decoratedtriangle
			dt = new DecoratedTriangle(dt);
		}
		
		JPanel panel = new DrawPanel(dt);//TODO put the decorated triangle here
		this.getContentPane().add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new DrawFrame();
	}
}
