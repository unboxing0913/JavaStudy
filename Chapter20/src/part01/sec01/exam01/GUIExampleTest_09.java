package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class MyButton05 extends Button{
	private Image img;
	
	public MyButton05(Image img) {
		this.img=img;
	}
	
	public void setImage(Image img) {
		this.img=img;
	}
	public void paint(Graphics g) {
		g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
	}
	
}

class MyFrame05 extends JFrame implements ActionListener,Runnable{ //쓰레드 인터페이스
	
	private MyButton05 bt[]=new MyButton05[9];
	private Label time_lb = new Label("시간:10초",Label.CENTER);
	private Label score_lb = new Label("점수:0",Label.CENTER);
	private Button start_bt = new Button("시작");
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	
	private int ransu;
	private int co=0;
	
	private Image img1=Toolkit.getDefaultToolkit().getImage("du1.jpg");
	private Image img2=Toolkit.getDefaultToolkit().getImage("du2.jpg");
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center",center_p);
		this.add("East",east_p);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0;i<bt.length;i++) {
			bt[i]=new MyButton05(img1);
			center_p.add(bt[i]);
			bt[i].setEnabled(false); // 버튼 비활성화
		}
		east_p.setLayout(new GridLayout(3,1));
		east_p.add(time_lb);
		east_p.add(score_lb);
		east_p.add(start_bt);
	}
	
	public void start() {
		start_bt.addActionListener(this);
		for(int i=0;i<bt.length;i++) {
			bt[i].addActionListener(this);
		}
	}
	
	public MyFrame05(String title) {
		super(title);
		
		this.init();
		this.start();
		
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int xpos = (int)(screen.getWidth()/2)-this.getWidth()/2;
	    int ypos = (int)(screen.getHeight()/2)-this.getHeight()/2;
	    this.setLocation(xpos, ypos);
	    this.setResizable(false);
	    this.setVisible(true);
	    System.out.println("ransu="+ransu);
	}
	

	@Override
	public void run() { //
		int time=10;
		while(time>=0) {
			time_lb.setText("시간: "+time+"초");
			time--;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.getMessage();
			}
		}
		
		start_bt.setEnabled(true);
		for(int i=0;i<bt.length;i++) {
			bt[i].setEnabled(false);
		}
		bt[ransu].setImage(img1);
		bt[ransu].repaint();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start_bt) {
			start_bt.setEnabled(false); //버튼
			co=0;//다시초기화시켜줌
			score_lb.setText("점수:0점");
			time_lb.setText("시간:10초");
			for(int i=0;i<bt.length;i++) {
				bt[i].setEnabled(true);
					
				}
			Thread th = new Thread(this); //
			th.start();// Thread 실행
			gameStart(); //
			
			}else {
				for(int i=0;i<bt.length;i++) {
					if(e.getSource()==bt[i]) {
						game(i);
					}
				}
		}
		
	}

	private void game(int i) {
		if(ransu==i) {
			co++;
			score_lb.setText("점수:"+co+"점");
			gameStart();
		}
		
	}

	private void gameStart() { //
		int ran;
		do {
			ran=(int)(Math.random()*9);
		}while(ransu==ran);
		bt[ransu].setImage(img1);
		bt[ransu].repaint();
		ransu=ran;
		bt[ransu].setImage(img2);
		bt[ransu].repaint();
		
	}
	
}

public class GUIExampleTest_09 {

	public static void main(String[] args) {
		MyFrame05 frame = new MyFrame05("frame 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
