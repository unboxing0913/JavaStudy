package part01.sec01.exam01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample_07 {
	        /*FlowLayout 버튼만들기*/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		FlowLayout layout=new FlowLayout(); //창의 흐름에 따라서 배치가 자유롭게 변함
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("파인애플"));
		contentPane.add(new JButton("오렌지"));
		contentPane.add(new JButton("포도"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("복숭아"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); // 윈도우 크기 자동조절 
		frame.setVisible(true);

	}
}
