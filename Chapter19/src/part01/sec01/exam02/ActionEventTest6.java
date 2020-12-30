package part01.sec01.exam02;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
/*콘솔창 연결 활용 */
class MyFrame6 extends JFrame implements ActionListener{
	
	Button b1 = new Button("버튼1");
	Button b2 = new Button("버튼2");
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
			System.out.println("버튼1을 누르셨습니다");
			label.setText("버튼1을 누르셨습니다");
		}else if(e.getSource() == b2 ) {
		    System.out.println("버튼2를 누르셨습니다.");
		    label.setText("버튼2를 누르셨습니다.");
		}
		
	}
	
}

public class ActionEventTest6 {

	public static void main(String[] args) {
		
		MyFrame6 frame = new MyFrame6("frame 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
