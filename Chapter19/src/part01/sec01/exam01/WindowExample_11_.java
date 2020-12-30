package part01.sec01.exam01;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
//JFrame,Container contentPane,JTextField,Jpanel,JLabel,BorderLayout,GridLayout,JButton 사용
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	

public class WindowExample_11_ {
/*Jframe 으로한것*/
	public static void main(String[] args) {
		JFrame jframe = new JFrame("연락처 프로그램");
		
		Container contentPane=jframe.getContentPane(); //클래스만들어서 할시 this로 getContentPane()접근
		
		JButton button = new JButton("입력");
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("주소");
		JLabel label3 = new JLabel("전화번호");
		
		GridLayout g1 = new GridLayout(1,2);
		JPanel p1 =new JPanel();
		JPanel p2 =new JPanel();
		JPanel p3 =new JPanel();
		
		contentPane.add("South",button);
		contentPane.add("Center",p1);
		
		GridLayout g2 = new GridLayout(3,1);
		
		p1.setLayout(g1);
		
		p1.add(p2);
		p1.add(p3);
		
		p2.setLayout(g2);
		p2.add(label1);
		p2.add(label2);
		p2.add(label3);
		
		p3.setLayout(g2);
		p3.add(text1);
		p3.add(text2);
		p3.add(text3);
		
		jframe.setSize(300,140);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-jframe.getWidth()/2;	
	    int ypos=(int)(screen.getHeight()/2)-jframe.getHeight()/2;
	    jframe.setLocation(xpos,ypos);
		jframe.setResizable(false); 
		jframe.setVisible(true);
		
		
		
	}

}
