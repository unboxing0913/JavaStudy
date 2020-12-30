package windowproblem_03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	public TestFrame() {
		setTitle("테스트 프레임");
		this.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		this.add(panel);
		panel.add(new JLabel("자바는 재미 있나요?"));
		this.add(new JButton("YES"));
		this.add(new JButton("NO"));
		
	
		setVisible(true);
		setSize(500,100);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
