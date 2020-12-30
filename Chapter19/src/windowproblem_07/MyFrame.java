package windowproblem_07;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	JPanel p = new JPanel();
	JLabel[] labels=new JLabel[30];
	
	public MyFrame() {
		p.setLayout(null); // Layout설정을 안하겠다 => 값을 null
		p.setBackground(Color.YELLOW);
		
		for(int i=0;i<30;i++) {
			labels[i]=new JLabel(Integer.toString(i)); // 라벨값 주는방법     (문자열을 정수로변환)
			int x = (int)((Math.random())*500);
			int y = (int)((Math.random())*200);
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x, y);
			labels[i].setSize(20,20);			
			p.add(labels[i]);//
			
		}
		
		setSize(500,300);
		add(p);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
