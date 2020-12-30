package part01.sec01.exam01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*로그인창만들기*/
public class GUIExampleTest_01 extends JFrame{
	
	JLabel lbl,la1,la2;
	JTextField id;
    JPasswordField passwd; //
    JPanel idPanel,paPanel,loginPanel;
    JButton b1,b2;
    JTextArea content;
    
    public GUIExampleTest_01() {//
    	super("JText테스트");
    	setLayout(new FlowLayout());
    	lbl=new JLabel("아이디와 패스워드를 입력해 주세요");
    	this.add(lbl);
    	
    	idPanel=new JPanel();
    	paPanel=new JPanel();
    	la1 = new JLabel("아이디 ");
    	la2 = new JLabel("패스워드");
    	
    	id= new JTextField(10);
    	passwd = new JPasswordField(10);
    	
    	idPanel.add(la1);
    	idPanel.add(id);
    	paPanel.add(la2);
    	paPanel.add(passwd);	
    	
    	this.add(idPanel);
    	this.add(paPanel);
        
        
    	b1 = new JButton("로그인");
    	b2 = new JButton("회원가입");
    	loginPanel = new JPanel();
    	loginPanel.add(b1);
    	loginPanel.add(b2);   	
    	this.add(loginPanel);
    	   	
    	content = new JTextArea(3,20);
    	JScrollPane s = new JScrollPane(content);  // 스크롤기능 	
    	//loginPanel.add(content);
        this.add(s); //스크롤기능을 가지고있는 JTextArea 의객체 s 를 넘김
        
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(250, 350);
    	
    	
    	
    	
    }

	public static void main(String[] args) {
	
		
		new GUIExampleTest_01();

	}

}
