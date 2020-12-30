package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
 /*BorderLayout 버튼만들기*/
class MyFrame_09 extends Frame{
	private Button bt1=new Button("확인1");
	private Button bt2=new Button("확인2");
	private Button bt3=new Button("확인3");
	private Button bt4=new Button("확인4");
	private Button bt5=new Button("확인5");	
	BorderLayout bl=new BorderLayout();
	
	public MyFrame_09(String title) {
		super(title);
		
		this.setLayout(bl);
		this.add("North",bt1);
		this.add("South",bt2);
		this.add("West",bt3);
		this.add("East",bt4);
		this.add("Center",bt5);
		
		this.setSize(400, 300);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
	    int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
        this.setResizable(false); 
		this.setVisible(true);   
	}
	
	
}

public class WindowExample_09 {
	

	public static void main(String[] args) {
		MyFrame_09 frame = new MyFrame_09("frame 예제");

	}

}
