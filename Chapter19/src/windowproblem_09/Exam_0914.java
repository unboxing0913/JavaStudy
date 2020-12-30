package windowproblem_09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;

class MyFrame14 extends JFrame{
	private Label noth_1b=new Label("계산기예제",Label.CENTER);//가운데정렬
	private Font font = new Font("",Font.BOLD,30);//글자모양,굵음,크기
	private Color color = new Color(21,234,80); //RGB(Red,Green,Blue)
	private Cursor cur = new Cursor(Cursor.HAND_CURSOR); // java.awt Cursor 사용  (HAND_CURSOR => 인트타입)
	private Button bt[] = new Button[12];
	private String str[] = new String[] {"*","0","#"};
	
	private Panel p=new Panel();
	private GridLayout gl=new GridLayout(4,3,5,5);//4행 ,3열  ,수평 ,수직
	
	
	public MyFrame14(String title){
		super(title);
		this.setSize(400,300);		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		this.init();
	}
	
	
	public void init() {
		this.setCursor(cur); // 커서적용 
		this.noth_1b.setBackground(color); //뒷배경
		this.noth_1b.setForeground(Color.RED); //글자부분배경
		this.noth_1b.setFont(font); // setFont 폰트적용
	    p.setLayout(gl);
	    p.setBackground(Color.BLUE);
	    
	    
	    for(int i=0;i<bt.length;i++) {
	    	if(i>8) {
	    		bt[i]=new Button(str[i-9]);	    		 
	    	}else {
	    		bt[i]=new Button(String.valueOf(i+1));
	    	}	    	
	    	
	    	p.add(bt[i]);
	    }
	    
	    
//	    for(int i=1;i<10;i++) {
//	    	bt[i]=new Button(Integer.toString(i));//int값을 String 값으로 바꿔줌
//	    	p.add(bt[i]);
//	    }	
//	    for(int i=0;i<3;i++)	{
//	           p.add(new Button(str[i]));	    	      	
//	    } 
	    	
	    	
	    
	    this.add(noth_1b,BorderLayout.NORTH);
	    this.add(p,BorderLayout.CENTER);
	}
	
	
	
	
}

public class Exam_0914 {

	public static void main(String[] args) {
		MyFrame14 frame = new MyFrame14("frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.init();
	}

}
