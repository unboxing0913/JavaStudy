package part01.sec01.exam01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample_06 {
            /*GridLayout ��ư�����*/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Zoo Program");
		frame.setLocation(500, 400);
		Container contentPane=frame.getContentPane();
		GridLayout layout = new GridLayout(3,2); //3��2�� ��ư ���
		contentPane.setLayout(layout);  //   ���̾ƿ��� ����ϰڴ�     (  layout / null )
		contentPane.add(new JButton("��踻"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("�ڳ���"));
		contentPane.add(new JButton("�ڻԼ�"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���̿���"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // ������ ũ�� �ڵ����� 
		frame.setVisible(true);
		
		

	}

}
