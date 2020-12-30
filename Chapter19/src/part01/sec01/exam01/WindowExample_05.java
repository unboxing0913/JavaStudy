package part01.sec01.exam01;



import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

class MyFrame_05 extends Frame{
	private Label label=new Label("안녕하세요 awt연습예제 입니다",Label.RIGHT);
	
	public MyFrame_05(String title) {
		  super(title);
		  this.add(label);
		 // Container contentPane=this.getContentPane(); //컴포넌트 생성 (다형성) j프레임쓸때
	                   /* f1.setPreferredSize(new Dimension(500,400)); 
	                   setPreferredSize(); 이 메소드는 Dimension객체를 인자로 받으면서 해당 콤포넌트의 기본크기를 결정해 줍니다.*/
	   //   JLabel label=new JLabel("안녕하세요 swi연습중 입니다.",SwingConstants.RIGHT); // 컴포넌트 위에 입력할 라벨 생성 (J프레임쓸때
	   //   contentPane.add(label); // 라벨을 겹치는작업
	  
	      this.setSize(400,300); // 프레임 사이즈
	      //f1.pack(); 창 압축 딱맞게
	      
	       Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		   int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
		   int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		   this.setLocation(xpos,ypos); //모니터의 크기 가운데 위치
		   
		   //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x키       => JFrame사용가능
		   
		   this.setResizable(false); //창크기고정
		   this.setVisible(true);    //창보여줄껀지
		
	}
	
	
	
	
	
	
	
}

public class WindowExample_05 {

	public static void main(String[] args) {
		
	      MyFrame_05 f1 = new MyFrame_05("MyFrame example"); //프레임구조사용위해 객체생성
	     
	}

}
