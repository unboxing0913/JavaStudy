package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import part01.sec01.exam02.MyFrame2.MyListener;
//�͸���Ŭ������ �̿��� ���
class MyFrame4 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame4() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ���� ");
		
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new ActionListener() { // �͸� ����Ŭ���� 

			@Override
			public void actionPerformed(ActionEvent e) { // �͸�Ŭ�����ȿ��� �������̵�(�������̽��̱⋚���� �߻�޼ҵ�)
				if(e.getSource() == button) { 
					label.setText("��ħ�� ��ư�� ���������ϴ�."); 		
				
			    } 	
		    }
		
		});
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);		
	}
	
	
}

public class ActionEventTest4 {

	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();

	}

}
