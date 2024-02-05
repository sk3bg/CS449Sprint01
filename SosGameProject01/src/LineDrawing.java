import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LineDrawing extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Set the color for the line
		g.setColor(Color.RED);
		// Draw a line from point (x1, y1) to point (x2, y2)
		g.drawLine(50, 50, 250, 250); // Example coordinates
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Draw Line Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);

		LineDrawing lineDrawingPanel = new LineDrawing();
		frame.add(lineDrawingPanel);
		frame.setVisible(true);
	}
}
