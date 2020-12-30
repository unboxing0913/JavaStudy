package part01.sec01.exam02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*가위바위보 프로그램 만들기 */
public class ActionEventTest_10 extends JFrame implements ActionListener{
	static final int ROCK=0;
	static final int PAPER=1;
	static final int SCISSOR=2;
	
	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton paper;
	private JButton scissor;
		
	
	public ActionEventTest_10() {
		this.setTitle("가위,바위,보");
	    this.setSize(400,300);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);//
	    
		panel = new JPanel();// 패널 설정
	    panel.setLayout(new GridLayout(1,3));//
	    
	    information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오");
	    this.add("North",information);
	    information.setEnabled(false);
	    
	    rock = new JButton("ROCK");
	    paper = new JButton("PAPER");
	    scissor = new JButton("SCISSOR");
	    
	    rock.addActionListener(this);
	    paper.addActionListener(this);
	    scissor.addActionListener(this);
	    
	    panel.add(rock);
	    panel.add(paper);
	    panel.add(scissor);
	    
	    this.add("Center",panel);
	    output = new JTextField();
	//  output.setEnabled(false);
	    this.add("South",output);
	    
	    this.setVisible(true);
	    
		
	}
	
	

	public static void main(String[] args) {
		ActionEventTest_10 gui=new ActionEventTest_10();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Random random=new Random();
		int computer=random.nextInt(3); /*0~2까지*/ //
		if(e.getSource()==rock) {
			if(computer==SCISSOR) {
				output.setText("사용자 승리");
			}else if(computer==ROCK) {
				output.setText("비겼습니다");
			}else {
				output.setText("컴퓨터 승리");
			}
			
		}else if(e.getSource()==paper) {
			if(computer==SCISSOR) {
				output.setText("컴퓨터 승리");
			}else if(computer==ROCK) {
				output.setText("사용자 승리");
			}else {
				output.setText("비겼습니다");
			}
			
		}else if(e.getSource()==scissor){
			if(computer==SCISSOR) {
				output.setText("비겼습니다");
			}else if(computer==ROCK) {
				output.setText("컴퓨터 승리");
			}else {
				output.setText("사용자 승리");
			}
		}
		
		System.out.println(computer);
		
		
		
/*		int com = (int)(Math.random()*3)+1;
		int use;
		if(e.getSource()==rock) {
			use=1;			
		}else if(e.getSource()==paper) {
			use=2;			
		}else {
			use=3;			
		}
		
		switch(use-com){
		
		case 2:
		    System.out.println(com);
		    output.setText("졌습니다.");
		    output.setForeground(Color.RED);
		    break;
		case 1:
			System.out.println(com);
			output.setText("이겼습니다.");
			output.setForeground(Color.BLUE);
		    break;
		case -1:
			System.out.println(com);
			output.setText("졌습니다.");
			output.setForeground(Color.RED);
		    break;
		case -2:
			System.out.println(com);
			output.setText("이겼습니다.");
			output.setForeground(Color.BLUE);
		    break;
	    default:
	    	System.out.println(com);
	    	output.setText("비겼습니다.");
	    	output.setForeground(Color.BLACK);
	    	//비김
		}
		                                      */
		
		
	}


	

}
