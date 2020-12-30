package windowproblem_08;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setTitle("프로그램");
		Container c = this.getContentPane();        // Conteiner 생성자에서 쓸땐 this.getContentPane();
		c.setLayout(null);
		
		JLabel label=new JLabel("Java~~♥♥♥");
		
		label.setFont(new Font("고딕",25,25));  //Font설정,가로,세로
		label.setLocation(0, 0);
		
		
		label.setSize(150,50);//★라벨 사이즈지정해줘야함
		c.add(label);				
		
		
		
		this.setLocation(500,400); //500,400
		this.setPreferredSize(new Dimension(400,340));
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int x=0 ; x<=400 ; x+=40) {		//for문 위치 중요	 
			for(int y=0;y<=340 ; y+=40) {
				   label.setLocation(x,y);
				try {									
					Thread.sleep(500);				
				}catch(InterruptedException e) {
					e.getMessage();
				}
				
			}
		 }
	
		
		//이중for문 ,Label위치지정 , 시간간격Thread.sleep(500) try~catch
	}

}
