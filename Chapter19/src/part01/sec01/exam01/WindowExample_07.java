package part01.sec01.exam01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample_07 {
	        /*FlowLayout ��ư�����*/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		FlowLayout layout=new FlowLayout(); //â�� �帧�� ���� ��ġ�� �����Ӱ� ����
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���ξ���"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("������"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // ������ ũ�� �ڵ����� 
		frame.setVisible(true);

	}
}
