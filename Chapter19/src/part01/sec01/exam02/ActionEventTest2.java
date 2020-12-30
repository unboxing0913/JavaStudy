package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

                                            //중첩클래스를 사용
class MyFrame2 extends JFrame{
		private JButton button;
		private JLabel label;
		
		public MyFrame2() {
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
		
		class MyListener implements ActionListener{ //중첩클래스(상위클래스의 것을 사용)			
		    //ActionListener 인터페이스가 가지고있는 actionPerformed추상메소드 재정의
			@Override
			public void actionPerformed(ActionEvent e) { /*ActionEvent 타입의 매개변수*/
			    //JButton button=(JButton)e.getSource();//e타입의 가져온정보
				if(e.getSource() == button) { //가져온 정보가 button인가? t/f
				label.setText("마침내 버튼이 눌러졌습니다."); // t 면 label에 Text적용
				}		
			}
		}
}

public class ActionEventTest2 {

	public static void main(String[] args) {
		MyFrame2 t=new MyFrame2();
	}
}

