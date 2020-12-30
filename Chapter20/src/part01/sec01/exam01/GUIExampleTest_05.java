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
/*JRadioButton 테스트*/
public class GUIExampleTest_05 extends JFrame implements ActionListener {

	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;

	public GUIExampleTest_05() {
		this.setTitle("라디오 버튼 테스트");		
		this.setSize(300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		
		this.add(topPanel,BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
	    
		ButtonGroup size = new ButtonGroup(); // Radio버튼을 하나로 묶을수있는 그룹	    
	    small.addActionListener(this); 
	    medium.addActionListener(this);
	    large.addActionListener(this);
	    
	    
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		resultPanel = new JPanel();
		text=new JLabel("크기가 선택 되지 않았습니다.");
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
			text.setText(small.getText()+"를 선택하셨습니다.");
		}else if(e.getSource()==medium) {
			text.setText(medium.getText()+"를 선택하셨습니다.");
		}else if(e.getSource()==large) {
			text.setText(large.getText()+"를 선택하셨습니다.");
		}
		

	}

}
