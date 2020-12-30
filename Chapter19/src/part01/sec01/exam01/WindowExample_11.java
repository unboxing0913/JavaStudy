package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*선생님이하신것*/
public class WindowExample_11 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("연락처 프로그램");
		frame.setPreferredSize(new Dimension(250,150));
		frame.setLocation(500, 400);
		
		Container contentPane=frame.getContentPane();
		
		JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(3,2));
        
        JTextField text1=new JTextField();
        JTextField text2=new JTextField();
        JTextField text3=new JTextField();
        
        /*라벨 옆에 텍스트필드 붙이기*/
        panel.add(new JLabel("이름"));
        panel.add(text1);//
        panel.add(new JLabel("주소"));
        panel.add(text2);//
        panel.add(new JLabel("전화번호"));
        panel.add(text3); //
        
        /*contentPane에 어떻게 올리느냐*/
        contentPane.add(panel,BorderLayout.CENTER);
        contentPane.add(new JButton("입력"),BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        //패널위에 올리고contentPane에 올려준 순서  (패널1개만만들고 그리드레이아웃으로 바로옆 텍스트필드까지 붙여주는법)
	}

}
