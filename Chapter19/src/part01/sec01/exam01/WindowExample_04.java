package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;

class MyFrame_04 extends Frame{
	                                       /*Frame을 상속받아 사용자정의 클래스로 만들어 처리*/
	public MyFrame_04(String title) {
    	   super(title);
		
		   this.setSize(400,300);		
		   Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		   int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
		   int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		   this.setLocation(xpos,ypos); //모니터의 크기 가운데 위치
		   this.setResizable(false); //창크기고정
		   this.setVisible(true);    //창보여줄껀지
	}
}

public class WindowExample_04 {

	public static void main(String[] args) {
		MyFrame_04 frame = new MyFrame_04("frame 예제");

	}

}
