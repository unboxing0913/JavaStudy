package part01.sec01.exam02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame5 extends JFrame{
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	
	MyListener listener = new MyListener();
	
	public MyFrame5() {
		this.setTitle("이벤트 예제");
		//this.setLayout(new BorderLayout());
		button1 = new JButton("노랑색");
		button2 = new JButton("핑크색");	
		//panel.setSize(100, 100);
		panel = new JPanel();
		panel.add(button1);
		panel.add(button2);		
		this.add(panel);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				panel.setBackground(Color.YELLOW);
			}else if(e.getSource() == button2) {
				panel.setBackground(Color.PINK);
			}
			
		}
		
	}
	
}

public class ActionEventTest5 {

	public static void main(String[] args) {
		MyFrame5 t = new MyFrame5();

	}

}
