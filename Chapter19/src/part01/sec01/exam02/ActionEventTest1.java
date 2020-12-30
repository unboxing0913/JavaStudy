package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*버튼을 클릭하면 라벨이 바뀌게끔 이벤트설정*/             //클래스자체연결
class MyListener implements ActionListener{
	
    //ActionListener 인터페이스가 가지고있는 actionPerformed추상메소드 재정의
	@Override
	public void actionPerformed(ActionEvent e) { /*ActionEvent 타입의 매개변수*/
		JButton button=(JButton)e.getSource();//e타입의 가져온정보
		button.setText("마침내 버튼이 눌러졌습니다.");
		
	}
	
}

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제 ");
		
		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르시오");
		label=new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(new MyListener());//버튼에 연결하는 방법 (클래스니깐 객체생성)
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}

public class ActionEventTest1 {

	public static void main(String[] args) {
		MyFrame t=new MyFrame();
	

	}

}
