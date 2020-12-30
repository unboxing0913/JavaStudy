package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

   //ActionListener자체를 클래스에 구현
class MyFrame3 extends JFrame implements ActionListener{ /*인터페이스 이기때문에 클래스를 하나 더안만들고 바로 implements후 사용하는방법*/
		private JButton button;
		private JLabel label;
		
		public MyFrame3() {
			this.setSize(300,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("이벤트 예제 ");
			
			JPanel panel=new JPanel();
			button=new JButton("버튼을 누르시오");
			label=new JLabel("아직 버튼이 눌러지지 않았습니다.");
			button.addActionListener(this);//자기자신클래스에 연결
			panel.add(button);
			panel.add(label);
			
			this.add(panel);
			this.setVisible(true);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) { /*ActionEvent 타입의 매개변수*/
			//JButton button=(JButton)e.getSource();//e타입의 가져온정보
			if(e.getSource() == button) { //가져온 정보가 button인가? t/f
			label.setText("마침내 버튼이 눌러졌습니다."); // t 면 label에 Text적용
			
			}		
		}
}

public class ActionEventTest3 {

	public static void main(String[] args) {
		MyFrame3 t=new MyFrame3();
	}
}

