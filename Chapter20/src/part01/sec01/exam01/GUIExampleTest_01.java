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

/*�α���â�����*/
public class GUIExampleTest_01 extends JFrame{
	
	JLabel lbl,la1,la2;
	JTextField id;
    JPasswordField passwd; //
    JPanel idPanel,paPanel,loginPanel;
    JButton b1,b2;
    JTextArea content;
    
    public GUIExampleTest_01() {//
    	super("JText�׽�Ʈ");
    	setLayout(new FlowLayout());
    	lbl=new JLabel("���̵�� �н����带 �Է��� �ּ���");
    	this.add(lbl);
    	
    	idPanel=new JPanel();
    	paPanel=new JPanel();
    	la1 = new JLabel("���̵� ");
    	la2 = new JLabel("�н�����");
    	
    	id= new JTextField(10);
    	passwd = new JPasswordField(10);
    	
    	idPanel.add(la1);
    	idPanel.add(id);
    	paPanel.add(la2);
    	paPanel.add(passwd);	
    	
    	this.add(idPanel);
    	this.add(paPanel);
        
        
    	b1 = new JButton("�α���");
    	b2 = new JButton("ȸ������");
    	loginPanel = new JPanel();
    	loginPanel.add(b1);
    	loginPanel.add(b2);   	
    	this.add(loginPanel);
    	   	
    	content = new JTextArea(3,20);
    	JScrollPane s = new JScrollPane(content);  // ��ũ�ѱ�� 	
    	//loginPanel.add(content);
        this.add(s); //��ũ�ѱ���� �������ִ� JTextArea �ǰ�ü s �� �ѱ�
        
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(250, 350);
    	
    	
    	
    	
    }

	public static void main(String[] args) {
	
		
		new GUIExampleTest_01();

	}

}
