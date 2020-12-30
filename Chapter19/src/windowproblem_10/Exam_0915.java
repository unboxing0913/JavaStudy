package windowproblem_10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;

class MyFrame15 extends JFrame{
	private Label lb=new Label("계산기 예제",Label.CENTER);
	private Button bt[] = new Button[16];
	private String str[] = new String[] {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "%", "/"};
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,4);
	private BorderLayout bl = new BorderLayout();
	
	public void init() {
		this.setLayout(bl);
		lb.setFont(new Font("",Font.BOLD,30));
		this.add("North",lb); // 라벨을 패널없이 바로 넣어줄수있음
		this.add("Center",p);
		p.setLayout(gl);
		
		for(int i=0;i<bt.length;i++) { //panel의 위치를 안정해줘도 Grid 레이아웃 순서에 따라 버튼이생성됨
			bt[i]=new Button(str[i]);
			bt[i].setFont(new Font("",Font.PLAIN,20));
			p.add(bt[i]);
		}
	}
	
	public MyFrame15(String title) {
		super(title);
		this.init();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - this.getWidth() / 2;
		int ypos = (int) (screen.getHeight() / 2) - this.getHeight() / 2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(400,300);
	}
	
	
	
}

public class Exam_0915 {

	public static void main(String[] args) {
		MyFrame15 f = new MyFrame15("예제");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
