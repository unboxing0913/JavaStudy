package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import part01.sec01.exam02.MyFrame2.MyListener;
//익명구현클래스를 이용한 방법
class MyFrame4 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame4() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제 ");
		
		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르시오");
		label=new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(new ActionListener() { // 익명 구현클래스 

			@Override
			public void actionPerformed(ActionEvent e) { // 익명클래스안에서 오버라이딩(인터페이스이기떄문에 추상메소드)
				if(e.getSource() == button) { 
					label.setText("마침내 버튼이 눌러졌습니다."); 		
				
			    } 	
		    }
		
		});
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);		
	}
	
	
}

public class ActionEventTest4 {

	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();

	}

}
