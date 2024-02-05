import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextDrawing extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Set the color for the text
		g.setColor(Color.BLUE);
		// Set the font for the text
		g.setFont(new Font("Arial", Font.BOLD, 20));
		// Draw the text at position (x=30, y=50)
		g.drawString("Hello, Swing!", 30, 50);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Draw Text Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);

		TextDrawing textDrawingPanel = new TextDrawing();
		frame.add(textDrawingPanel);
		frame.setVisible(true);
	}

}
