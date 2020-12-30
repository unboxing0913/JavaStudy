package part01.sec01.exam02;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionEventTest8 extends JFrame implements ActionListener{
	
	private JTextField txt;
	private JPanel panel;
/*	private JButton[] button = new JButton[9];   */
	
	public ActionEventTest8() {
		this.setTitle("keypad_test");
		txt = new JTextField(20);
		this.add(txt,BorderLayout.NORTH); /*���ݸ��� txt�� frame�� ������� ��������*/
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		this.add(panel,BorderLayout.CENTER);/*���ݸ��� panel�� frame�� ������� ��ġ�Ұ���*/
		
		//String[] str=new String[] {"1","2","3","4","5","6","7","8","9"};
		
/*		for(int i=0;i<button.length;i++) {			
		//button[i]=new JButton(str[i]);	
		button[i]=new JButton(Integer.toString(i+1));//()
		panel.add(button[i]);	
		button[i].addActionListener(this);//
		}   */
		
		for(int i = 1 ; i <= 9 ; i++) { //for�� 9�����ϱ� �迭�� �Ƚᵵ ��ư9������
			JButton btn=new JButton(""+i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100,100));
			panel.add(btn);
		}
		pack();
		
		
		
		txt.setEnabled(false);//
	/*	this.setSize(400, 400);  */
		this.setVisible(true);
	/*	this.setLocation(300, 300);  */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand=e.getActionCommand(); //getActionCommand() => ��ư�� �ִ� ���� ���ڿ��� �������°�
		txt.setText(txt.getText()+actionCommand);
		}
		
			
	/*	for(int i=0;i<9;i++) {			
			if(e.getSource() == button[i]) {				
				txt.setText(txt.getText()+Integer.toString(i+1));//���ڿ�����
			}		
		}		*/
	
	
	

	public static void main(String[] args) {
		ActionEventTest8 f = new ActionEventTest8();

	}
}
