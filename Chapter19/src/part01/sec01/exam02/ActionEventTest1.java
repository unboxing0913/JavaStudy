package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*��ư�� Ŭ���ϸ� ���� �ٲ�Բ� �̺�Ʈ����*/             //Ŭ������ü����
class MyListener implements ActionListener{
	
    //ActionListener �������̽��� �������ִ� actionPerformed�߻�޼ҵ� ������
	@Override
	public void actionPerformed(ActionEvent e) { /*ActionEvent Ÿ���� �Ű�����*/
		JButton button=(JButton)e.getSource();//eŸ���� ����������
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
		
	}
	
}

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ���� ");
		
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());//��ư�� �����ϴ� ��� (Ŭ�����ϱ� ��ü����)
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}

public class ActionEventTest1 {

	public static void main(String[] args) {
		MyFrame t=new MyFrame();
	

	}

}
