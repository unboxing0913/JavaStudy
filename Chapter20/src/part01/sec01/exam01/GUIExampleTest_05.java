package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/*JRadioButton �׽�Ʈ*/
public class GUIExampleTest_05 extends JFrame implements ActionListener {

	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;

	public GUIExampleTest_05() {
		this.setTitle("���� ��ư �׽�Ʈ");		
		this.setSize(300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		
		this.add(topPanel,BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
	    
		ButtonGroup size = new ButtonGroup(); // Radio��ư�� �ϳ��� �������ִ� �׷�	    
	    small.addActionListener(this); 
	    medium.addActionListener(this);
	    large.addActionListener(this);
	    
	    
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		resultPanel = new JPanel();
		text=new JLabel("ũ�Ⱑ ���� ���� �ʾҽ��ϴ�.");
		text.setForeground(Color.RED);
		
		resultPanel.add(text);
		
		this.add(resultPanel,BorderLayout.SOUTH);
		this.add(sizePanel,BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GUIExampleTest_05();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==small) {
			text.setText(small.getText()+"�� �����ϼ̽��ϴ�.");
		}else if(e.getSource()==medium) {
			text.setText(medium.getText()+"�� �����ϼ̽��ϴ�.");
		}else if(e.getSource()==large) {
			text.setText(large.getText()+"�� �����ϼ̽��ϴ�.");
		}
		

	}

}
