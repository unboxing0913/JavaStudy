package part01.sec01.exam01;

import java.awt.FlowLayout; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
                             //ButtonListerner 를 내부클래스로 만들면 필드값을 getter로 안받아와도 실행가능 (내부클래스에선안됨)
                             /*JButton을 상속안받으면 버튼이 작동안함 (addActionList 버튼에 적용하면 작동하긴함)*/
/* class ButtonListener extends JButton implements ActionListener{
	   
	private JTextField text;
	private JTextField result;
	private JButton button;	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button);
		int a =  Integer.parseInt(text.getText());
		result.setText(Integer.toString(a*a));
		
		
	}
	
    public void ListenerSet(JTextField text,JTextField result,JButton button) {
		this.text=text;
		this.result=result;
		this.button = button;
	}
	
} */

public class GUIExampleTest_04 extends JFrame {
	private JButton button;
	private JTextField text,result;
	
	GUIExampleTest_04(){
		this.setSize(30,30);
		this.setTitle("제곱 계산하기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener listener=new ButtonListener();//
		JPanel panel=new JPanel();
		panel.add(new JLabel("숫자입력: "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		panel.add(new JLabel("제곱한 값: "));
		result = new JTextField(15);
		panel.add(result);
		result.setEditable(false);
		
		button = new JButton("OK");
		button.addActionListener(listener);// 버튼이벤트를 쓰지않으면 listener가 JButton을 상속받아야 이벤트실행 (내부클래스에서 안됨)
		this.add("Center",panel);	
		panel.add(button);
		this.setVisible(true);
		this.setSize(200, 200);
		
	//	listener.ListenerSet(text,result,button);
		
		// 내부클래스 : 텍스트 필드와 버튼의 액션 이벤트처리		
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
							
			if(e.getSource()==button);
			int a =  Integer.parseInt(text.getText());
			result.setText(Integer.toString(a*a));
			
		}
		
	}
	



	public static void main(String[] args) {
		new GUIExampleTest_04();
	}

}
