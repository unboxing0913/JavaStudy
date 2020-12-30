package part01.sec01.exam02;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
/*�ܼ�â ���� Ȱ�� */
class MyFrame6 extends JFrame implements ActionListener{
	
	Button b1 = new Button("��ư1");
	Button b2 = new Button("��ư2");
	Label label = new Label("",Font.CENTER_BASELINE);
	MyFrame6(String title){
		super(title);
		this.setLayout(new GridLayout(3,1));
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.add(b1);
		this.add(b2);
		
		this.add(label);
		
		this.setSize(400,300);
		this.setVisible(true);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1 ) {
			System.out.println("��ư1�� �����̽��ϴ�");
			label.setText("��ư1�� �����̽��ϴ�");
		}else if(e.getSource() == b2 ) {
		    System.out.println("��ư2�� �����̽��ϴ�.");
		    label.setText("��ư2�� �����̽��ϴ�.");
		}
		
	}
	
}

public class ActionEventTest6 {

	public static void main(String[] args) {
		
		MyFrame6 frame = new MyFrame6("frame ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
