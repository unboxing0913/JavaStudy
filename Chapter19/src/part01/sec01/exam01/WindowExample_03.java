package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class WindowExample_03 {
                                     /*���� ������â ũ�⿡ ���缭 ��� ��ġ*/
	public static void main(String[] args) {
	   Frame f1=new Frame("title1");                  /*JFrame�� �ʱ���� Frame*/
	   Frame f2=new Frame("title2");
	  
	   f1.setVisible(true);  //frame ȭ�� ��  t/f
	   f2.setVisible(true);
	   
	   f1.setSize(200, 200); //frame ũ�� ����
	   f2.setSize(300, 300);
	   
	   // ���� ����ϴ� ����� ������ ���� ���θ� DimensionŬ������ �־� �ش�. (����ó�� �˰��������)
	   Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	   int xpos=(int)(screen.getWidth()/2)-f1.getWidth()/2;	
	   int ypos=(int)(screen.getHeight()/2)-f1.getHeight()/2;		
	   
       f1.setLocation(xpos,ypos); // frame�ش� ��ġ �̵�
       f2.setLocation(300, 300); 
       f1.setResizable(false); /* âũ�� ���� t/f */
       
	}

}
