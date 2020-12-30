package part01.sec01.exam01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample_06 {
            /*GridLayout 버튼만들기*/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Zoo Program");
		frame.setLocation(500, 400);
		Container contentPane=frame.getContentPane();
		GridLayout layout = new GridLayout(3,2); //3행2열 버튼 모양
		contentPane.setLayout(layout);  //   레이아웃을 사용하겠다     (  layout / null )
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("코뿔소"));
		contentPane.add(new JButton("펭귄"));
		contentPane.add(new JButton("하이에나"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // 윈도우 크기 자동조절 
		frame.setVisible(true);
		
		

	}

}
