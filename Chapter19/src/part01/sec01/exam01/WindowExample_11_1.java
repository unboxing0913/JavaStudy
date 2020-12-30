package part01.sec01.exam01;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;

/*프레임으로한것*/
class MyFrame_11_1 extends Frame{
   
   Button button = new Button("입력");
   TextField text1 = new TextField();
   TextField text2 = new TextField();
   TextField text3 = new TextField();
   Label label1 = new Label("이름");
   Label label2 = new Label("주소");
   Label label3 = new Label("전화번호");
   
   GridLayout g1 = new GridLayout(1,2);
	Panel p1 =new Panel();
	Panel p2 =new Panel();
	Panel p3 =new Panel();
  
	GridLayout g2 = new GridLayout(3,1);
	
	
   MyFrame_11_1(String title){
	   super(title);
	   		
		this.add("South",button);
		this.add("Center",p1);
		
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
	    
	    this.setSize(270,140);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
	    int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
	    this.setLocation(xpos,ypos);
		this.setResizable(false); 
		this.setVisible(true);
		
   }
   
   
}

public class WindowExample_11_1 {

	public static void main(String[] args) {
		MyFrame_11_1 frame = new MyFrame_11_1("연락처 프로그램");	
		
	 
	}

}
