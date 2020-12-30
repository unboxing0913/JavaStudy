package minsu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Exam_1913 extends JFrame {

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private String[] str = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "%", "/" };
	private JButton buttons[];
	private JLabel label = new JLabel("계산기 예제", JLabel.CENTER);

	public Exam_1913() {
		this.setTitle("계산기예제");
		this.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - this.getWidth() / 2;
		int ypos = (int) (screen.getHeight() / 2) - this.getHeight() / 2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		label.setFont(new Font("고딕", 30, 30));
		BorderLayout bl = new BorderLayout();
		GridLayout gl = new GridLayout(4, 4, 3, 3);

		this.setLayout(bl);
		this.add("North", panel1);
		panel1.add(label);
		this.add("Center", panel2);
		panel2.setLayout(gl);

		buttons = new JButton[16];
		int index = 0;
		while (index < 16) {
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					buttons[index] = new JButton(str[index]);
					panel2.setLocation(x, y);
				}
				panel2.add(buttons[index]);
				index++;

				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setResizable(true);

			}
		}
	}
}

public class Exam_0913 {

	public static void main(String[] args) {
		Exam_1913 frame = new Exam_1913();

	}

}
