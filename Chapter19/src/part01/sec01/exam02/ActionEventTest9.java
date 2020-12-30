package part01.sec01.exam02;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ConfirmButtonActionListener implements ActionListener{
	
	JTextField text;
	JLabel label;
	
	
	ConfirmButtonActionListener(JTextField text,JLabel label){ //main에서 객체생성후 값을줌★
		this.text=text;
		this.label=label;
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		    String name = text.getText(); //text내용을 name에 계속저장
		    label.setText("Hello"+name);
		
	}
	
}

public class ActionEventTest9 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Program");
		frame.setPreferredSize(new Dimension(200,70));//
		frame.setLocation(500, 400);
		Container contentPane=frame.getContentPane();
		
		JButton btn = new JButton("확인");
		JLabel label = new JLabel("Hello");
		JTextField text = new JTextField();
		
		contentPane.add("Center",text);
		contentPane.add("East",btn);
		contentPane.add("South",label);
		
		ActionListener listener=new ConfirmButtonActionListener(text,label);//★ text label 넘겨주기위한 객체생성
		btn.addActionListener(listener);//객체연결
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		frame.setVisible(true);

	}

}
