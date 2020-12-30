package part01.sec01.exam01;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

class MyFrame11 extends JFrame implements ItemListener{
	
	private Label lb=new Label("당신의 혈액형은? :");
	private Choice ch = new Choice();
	private Label lb2 = new Label("선택하신 혈액형 : ");
	
	public void init() {
		this.setLayout(new GridLayout(3,1));
		lb.setFont(new Font("",Font.PLAIN,20));
		this.add(lb);
		ch.add("A형");
		ch.add("B형");
		ch.add("AB형");
		ch.add("O형");
		ch.add("기타");
		this.add(ch);
		lb2.setFont(new Font("",Font.PLAIN,20));
		this.add(lb2);
		
	}
	
	public void start() {
		ch.addItemListener(this);//
	}
	
	public MyFrame11(String title) {
	     super(title);
	     
	     this.init();
	     this.start();//
	     this.setSize(300,200);
	     Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	     int xpos = (int)(screen.getWidth()/2)-this.getWidth()/2;
	     int ypos = (int)(screen.getHeight()/2)-this.getHeight()/2;
	     this.setLocation(xpos, ypos);
	     this.setResizable(false);
	     this.setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) { // ItemListener 오버라이딩
		String select = ch.getSelectedItem();
		lb2.setText("선택하신 혈액형 :"+select);//
		
	}
	
}

public class GUIExampleTest_06_01{
	
	
	public static void main(String[] args) {
		MyFrame11 frame = new MyFrame11("frame 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	

}
