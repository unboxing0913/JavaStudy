package windowproblem_04;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public MyFrame() {
		
		this.setTitle("�׽�Ʈ ������");
		this.setSize(400,150);
		//this.setLayout(new BorderLayout());   JFrame �⺻���̾ƿ�
		JLabel jlabel = new JLabel("�ڹ� ȣ�ڿ� ���Ű��� ȯ���մϴ�. ");
		JLabel jlabel2= new JLabel("�����ϼ��� �Է��ϼ���.");
		
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
		
		
		
		jpanel1.add(jlabel);
		jpanel1.add(jlabel2);
		
		for(int i=1;i<6;i++) {
			jpanel2.add(new JButton(i+"��"));
		}
		

		
//		this.add(BorderLayout.CENTER,jpanel1); /*�����ǹ�*/
//		this.add("South",jpanel2);             /*�����ǹ�*/
		
        jpanel3.add(jpanel1);
        jpanel3.add(jpanel2);       /*�г��� �г��� �ø� ���*/
        
        add(jpanel3);

	
		
		setVisible(true);
		this.setResizable(true);
		//this.pack();
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocation(400, 400);
	}
}
