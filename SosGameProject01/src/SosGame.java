import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SosGame {

	public static void main(String[] args) {
		drawUi();

	}

	public static void drawUi() {
		 JFrame frame = new JFrame("SOS Game");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JPanel panel = new JPanel();

	       frame.add(panel);
	       JButton button = new JButton("button");

	       JCheckBox checkBox = new JCheckBox("check-box");

	       ButtonGroup buttonGroup = new ButtonGroup();

	       JRadioButton radioButton = new JRadioButton("Radio-button");

	       buttonGroup.add(radioButton);

	       panel.add(radioButton);

	       panel.add(button);

	       panel.add(checkBox);

	       frame.setVisible(true);

	      }
}
