package windowproblem_03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	public TestFrame() {
		setTitle("�׽�Ʈ ������");
		this.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		this.add(panel);
		panel.add(new JLabel("�ڹٴ� ��� �ֳ���?"));
		this.add(new JButton("YES"));
		this.add(new JButton("NO"));
		
	
		setVisible(true);
		setSize(500,100);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
