package part01.sec01.exam01;



import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

class MyFrame_05 extends Frame{
	private Label label=new Label("�ȳ��ϼ��� awt�������� �Դϴ�",Label.RIGHT);
	
	public MyFrame_05(String title) {
		  super(title);
		  this.add(label);
		 // Container contentPane=this.getContentPane(); //������Ʈ ���� (������) j�����Ӿ���
	                   /* f1.setPreferredSize(new Dimension(500,400)); 
	                   setPreferredSize(); �� �޼ҵ�� Dimension��ü�� ���ڷ� �����鼭 �ش� ������Ʈ�� �⺻ũ�⸦ ������ �ݴϴ�.*/
	   //   JLabel label=new JLabel("�ȳ��ϼ��� swi������ �Դϴ�.",SwingConstants.RIGHT); // ������Ʈ ���� �Է��� �� ���� (J�����Ӿ���
	   //   contentPane.add(label); // ���� ��ġ���۾�
	  
	      this.setSize(400,300); // ������ ������
	      //f1.pack(); â ���� ���°�
	      
	       Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		   int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;	
		   int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		   this.setLocation(xpos,ypos); //������� ũ�� ��� ��ġ
		   
		   //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //xŰ       => JFrame��밡��
		   
		   this.setResizable(false); //âũ�����
		   this.setVisible(true);    //â�����ٲ���
		
	}
	
	
	
	
	
	
	
}

public class WindowExample_05 {

	public static void main(String[] args) {
		
	      MyFrame_05 f1 = new MyFrame_05("MyFrame example"); //�����ӱ���������� ��ü����
	     
	}

}
