package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIExampleTest_03 extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	
	public GUIExampleTest_03() {
		this.setTitle("Text Area Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);//
		
		textArea=new JTextArea(10,30);
		textArea.setEditable(false);
		
		this.add(textField,BorderLayout.NORTH);
		this.add(textArea,BorderLayout.CENTER);
		
		
		JScrollPane scrollPane=new JScrollPane(textArea);
		this.add(scrollPane,BorderLayout.CENTER);
		
		
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //text는 엔터키를 이벤트로인식
		    String text = textField.getText();
			textArea.append(text+"\n");
			textField.selectAll();		
			
		}
		
	public static void main(String[] args) {
		new GUIExampleTest_03();

	}


	
}
