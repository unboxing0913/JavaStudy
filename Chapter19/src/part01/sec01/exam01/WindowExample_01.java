package part01.sec01.exam01;

import java.awt.Container;

import javax.swing.JFrame; /*swing ���߿����¹���*/
import javax.swing.JLabel;
/*��ġ�½��� ���� */ /*Frame , JFrame �����*/
public class WindowExample_01 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Hello Java Program"); /*�����ӱ�������ϱ����� ��ü����*/
		Container contentPane = frame.getContentPane();       /*������ contentPane������ϱ����� (�θ�Ÿ���ε�)*/
		JLabel label = new JLabel("Hello,Java"); /* ���� ��ü���� */
		contentPane.add(label); /*contentPane ���� ���� ��ġ�� */
		frame.pack(); /*�����ӳ��� ����������Ʈ���� ���̾ƿ��� Prefered Size��
                                                �µ��� �������� ����� ���ߴ� �۾��̴�.*/
		frame.setVisible(true);    /* ������â�� �����ٲ��� t/f */

	    
	}

}
