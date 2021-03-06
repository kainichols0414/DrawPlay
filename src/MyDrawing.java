import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;



public class MyDrawing extends JPanel {
	private Cat cat;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
		cat.draw(g, 200, 50);
		cat.draw(g, 200, 200);
		cat.draw(g, 50, 200);
		cat.draw(g, 350, 50);
		cat.draw(g, 350, 200);
		cat.draw(g, 350, 350);
		cat.draw(g, 200, 350);
		cat.draw(g, 50, 350);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(550, 550);
		
		//set background color
		frame.setBackground(Color.black);
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
