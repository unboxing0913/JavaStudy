package part01.sec01.exam01;

import java.awt.FlowLayout; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
                             //ButtonListerner �� ����Ŭ������ ����� �ʵ尪�� getter�� �ȹ޾ƿ͵� ���డ�� (����Ŭ���������ȵ�)
                             /*JButton�� ��Ӿȹ����� ��ư�� �۵����� (addActionList ��ư�� �����ϸ� �۵��ϱ���)*/
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
		this.setTitle("���� ����ϱ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener listener=new ButtonListener();//
		JPanel panel=new JPanel();
		panel.add(new JLabel("�����Է�: "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		panel.add(new JLabel("������ ��: "));
		result = new JTextField(15);
		panel.add(result);
		result.setEditable(false);
		
		button = new JButton("OK");
		button.addActionListener(listener);// ��ư�̺�Ʈ�� ���������� listener�� JButton�� ��ӹ޾ƾ� �̺�Ʈ���� (����Ŭ�������� �ȵ�)
		this.add("Center",panel);	
		panel.add(button);
		this.setVisible(true);
		this.setSize(200, 200);
		
	//	listener.ListenerSet(text,result,button);
		
		// ����Ŭ���� : �ؽ�Ʈ �ʵ�� ��ư�� �׼� �̺�Ʈó��		
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
