package part01.sec01.exam01;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample_08 {
          /*BoxLayout ��ư�����*/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		BoxLayout layout=new BoxLayout(contentPane,BoxLayout.Y_AXIS); //â�� �������� ����( X��Y�� )
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("�ڹ�"));
		contentPane.add(new JButton("����������"));
		contentPane.add(new JButton("īǪġ��"));
		contentPane.add(new JButton("��縶��ƾ"));
		contentPane.add(new JButton("�ݷ����"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // ������ ũ�� �ڵ����� 
		frame.setVisible(true);
	}

}
