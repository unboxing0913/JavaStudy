package part01.sec01.exam01;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample_02 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Hello Java Program"); /*Ÿ��Ʋ �ٿ� ǥ��*/
		frame.setLocation(500,400); /*������ ��ġ ����*/
		frame.setPreferredSize(new Dimension(300,200)); /*������ ũ�� ����*/
		Container contentPane=frame.getContentPane();       
		JLabel label = new JLabel("Hello,Java",SwingConstants.CENTER); /*�� ��ġ ���� */  
		contentPane.add(label); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x��ư ������ ����
		frame.pack();
		frame.setVisible(true);  

	}

}
