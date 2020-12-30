package part01.sec01.exam01;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample_02 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Hello Java Program"); /*타이틀 바에 표시*/
		frame.setLocation(500,400); /*윈도우 위치 지정*/
		frame.setPreferredSize(new Dimension(300,200)); /*프레임 크기 지정*/
		Container contentPane=frame.getContentPane();       
		JLabel label = new JLabel("Hello,Java",SwingConstants.CENTER); /*라벨 위치 지정 */  
		contentPane.add(label); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 윈도우 닫힘
		frame.pack();
		frame.setVisible(true);  

	}

}
