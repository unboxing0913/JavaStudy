package windowproblem_02;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("My Frame");		
		setLayout(new FlowLayout());				
		JButton button = new JButton("��ư");
		this.add(button);	
		setVisible(true);
		setSize(300,200);
		setResizable(false);
		
		
		/*â ���*/
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();		

		setLocation(screenSize.width/2-this.getWidth()/2,screenSize.height/2-this.getHeight()/2);/*setSize ��������� �����*/
				//���� �����߱⶧���� int�� ����ĳ���þ��ص� ��밡��
		
//		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();		
//		int x = (int)(d.getWidth()/2)-this.getWidth()/2;
//		int y = (int)(d.getHeight()/2)-this.getHeight()/2;
//		setLocation(x,y);
		
		
		
		
	}
	
}
