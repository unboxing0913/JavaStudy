package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;

// BorderLayout , GridLayout,각종 컴포넌트를 자유롭게 *겹칠 수 있는 Panel컨테이너
class MyFrame_10 extends Frame{
	private Button bt1=new Button("Yes");
	private Button bt2=new Button("NO1");
	private Button bt3=new Button("NO2");
	
	private BorderLayout bl=new BorderLayout();
	private Panel p1=new Panel();
	
	private GridLayout gl=new GridLayout(1,2);
	private Panel p2=new Panel();
	
	private GridLayout gl2=new GridLayout(2,1);

	public MyFrame_10(String title) {
		super(title);
		this.setLayout(bl);
		this.add("South",p1);
		p1.setLayout(gl);
		p1.add(bt1);
		p1.add(p2);
		p2.setLayout(gl2);
		p2.add(bt2);
		p2.add(bt3);
		
		this.setSize(400, 300);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
	    int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
        this.setResizable(false); 
		this.setVisible(true);  
	}
	
}

public class WindowExample_10 {

	public static void main(String[] args) {
		MyFrame_10 frame = new MyFrame_10("frame 예제");
	}

}
