package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class WindowExample_03 {
                                     /*실제 윈도우창 크기에 맞춰서 가운데 위치*/
	public static void main(String[] args) {
	   Frame f1=new Frame("title1");                  /*JFrame의 초기버전 Frame*/
	   Frame f2=new Frame("title2");
	  
	   f1.setVisible(true);  //frame 화면 출  t/f
	   f2.setVisible(true);
	   
	   f1.setSize(200, 200); //frame 크기 변경
	   f2.setSize(300, 300);
	   
	   // 현재 사용하는 모니터 사이즈 가로 세로를 Dimension클래스에 넣어 준다. (공식처럼 알고있으면됨)
	   Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	   int xpos=(int)(screen.getWidth()/2)-f1.getWidth()/2;	
	   int ypos=(int)(screen.getHeight()/2)-f1.getHeight()/2;		
	   
       f1.setLocation(xpos,ypos); // frame해당 위치 이동
       f2.setLocation(300, 300); 
       f1.setResizable(false); /* 창크기 조절 t/f */
       
	}

}
