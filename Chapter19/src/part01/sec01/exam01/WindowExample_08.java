package part01.sec01.exam01;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample_08 {
          /*BoxLayout 버튼만들기*/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		BoxLayout layout=new BoxLayout(contentPane,BoxLayout.Y_AXIS); //창을 움직여도 유지( X축Y축 )
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("자바"));
		contentPane.add(new JButton("에스프레소"));
		contentPane.add(new JButton("카푸치노"));
		contentPane.add(new JButton("블루마운틴"));
		contentPane.add(new JButton("콜럼비아"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // 윈도우 크기 자동조절 
		frame.setVisible(true);
	}

}
