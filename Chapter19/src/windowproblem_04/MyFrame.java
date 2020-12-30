package windowproblem_04;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public MyFrame() {
		
		this.setTitle("테스트 프레임");
		this.setSize(400,150);
		//this.setLayout(new BorderLayout());   JFrame 기본레이아웃
		JLabel jlabel = new JLabel("자바 호텔에 오신것을 환영합니다. ");
		JLabel jlabel2= new JLabel("숙발일수를 입력하세요.");
		
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
		
		
		
		jpanel1.add(jlabel);
		jpanel1.add(jlabel2);
		
		for(int i=1;i<6;i++) {
			jpanel2.add(new JButton(i+"명"));
		}
		

		
//		this.add(BorderLayout.CENTER,jpanel1); /*같은의미*/
//		this.add("South",jpanel2);             /*같은의미*/
		
        jpanel3.add(jpanel1);
        jpanel3.add(jpanel2);       /*패널의 패널을 올린 방법*/
        
        add(jpanel3);

	
		
		setVisible(true);
		this.setResizable(true);
		//this.pack();
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocation(400, 400);
	}
}
