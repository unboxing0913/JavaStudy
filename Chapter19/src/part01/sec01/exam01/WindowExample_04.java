package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;

class MyFrame_04 extends Frame{
	                                       /*Frame�� ��ӹ޾� ��������� Ŭ������ ����� ó��*/
	public MyFrame_04(String title) {
    	   super(title);
		
		   this.setSize(400,300);		
		   Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		   int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
		   int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		   this.setLocation(xpos,ypos); //������� ũ�� ��� ��ġ
		   this.setResizable(false); //âũ�����
		   this.setVisible(true);    //â�����ٲ���
	}
}

public class WindowExample_04 {

	public static void main(String[] args) {
		MyFrame_04 frame = new MyFrame_04("frame ����");

	}

}
