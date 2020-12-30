package windowproblem_06;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//contentPane의 기본은 BorderLayout();
//Panel의 기본은 FlowLayout();
public class MyFrame extends JFrame{
	
	public MyFrame() {
		setSize(600,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel=new JPanel();
		JPanel panelA=new JPanel();
		JPanel panelB=new JPanel();
		
		JLabel label1=new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오");
		panelA.add(label1);
		
		JButton button1=new JButton("콤보피자");
		JButton button2=new JButton("포테이토 피자");
		JButton button3=new JButton("불고기 피자");
		
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2=new JLabel("개수");
		JTextField field1 = new JTextField(10);
		
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		
		add(panel);
		
		panel.setBackground(Color.blue); //뒷배경색설정
		setVisible(true);
		
	}
	
	
	}


//MyFrame(){
//	this.setTitle("MyFrame");
//	this.setLayout(new BorderLayout());
//	this.setSize(600,130);
//	
//	JPanel jpanel1 = new JPanel();
//	JPanel jpanel2 = new JPanel();
//	JPanel jpanel3 = new JPanel();
//	JPanel jpanel4 = new JPanel();
//	jpanel1.setOpaque(true); 
//	jpanel1.setBackground(Color.blue);
//	jpanel2.setOpaque(true); 
//	jpanel2.setBackground(Color.blue);
//	
//	this.add("North",jpanel1);
//	this.add("Center",jpanel2);
//			
//	jpanel1.setLayout(new FlowLayout());
//	jpanel1.add(jpanel3);
//	jpanel3.add(new JLabel("자바 피자에 오신것을 환영합니다 피자의 종류를 선택하시오"));
//	jpanel2.setLayout(new FlowLayout());
//	jpanel2.add(jpanel4);
//	jpanel4.add(new JButton("콤보피자"));
//	jpanel4.add(new JButton("포테이토피자"));
//	jpanel4.add(new JButton("불고기피자"));
//	jpanel4.add(new JLabel("개수"));
//	jpanel4.add(new TextField(15));
//	
//  
//	
//	this.setVisible(true);
//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	
//    
//	this.setLocation(450, 400);
//	//this.pack();
//	
	