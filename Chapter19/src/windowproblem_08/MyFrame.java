package windowproblem_08;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setTitle("���α׷�");
		Container c = this.getContentPane();        // Conteiner �����ڿ��� ���� this.getContentPane();
		c.setLayout(null);
		
		JLabel label=new JLabel("Java~~������");
		
		label.setFont(new Font("���",25,25));  //Font����,����,����
		label.setLocation(0, 0);
		
		
		label.setSize(150,50);//�ڶ� �����������������
		c.add(label);				
		
		
		
		this.setLocation(500,400); //500,400
		this.setPreferredSize(new Dimension(400,340));
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int x=0 ; x<=400 ; x+=40) {		//for�� ��ġ �߿�	 
			for(int y=0;y<=340 ; y+=40) {
				   label.setLocation(x,y);
				try {									
					Thread.sleep(500);				
				}catch(InterruptedException e) {
					e.getMessage();
				}
				
			}
		 }
	
		
		//����for�� ,Label��ġ���� , �ð�����Thread.sleep(500) try~catch
	}

}
