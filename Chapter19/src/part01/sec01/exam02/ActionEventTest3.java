package part01.sec01.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

   //ActionListener��ü�� Ŭ������ ����
class MyFrame3 extends JFrame implements ActionListener{ /*�������̽� �̱⶧���� Ŭ������ �ϳ� ���ȸ���� �ٷ� implements�� ����ϴ¹��*/
		private JButton button;
		private JLabel label;
		
		public MyFrame3() {
			this.setSize(300,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("�̺�Ʈ ���� ");
			
			JPanel panel=new JPanel();
			button=new JButton("��ư�� �����ÿ�");
			label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
			button.addActionListener(this);//�ڱ��ڽ�Ŭ������ ����
			panel.add(button);
			panel.add(label);
			
			this.add(panel);
			this.setVisible(true);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) { /*ActionEvent Ÿ���� �Ű�����*/
			//JButton button=(JButton)e.getSource();//eŸ���� ����������
			if(e.getSource() == button) { //������ ������ button�ΰ�? t/f
			label.setText("��ħ�� ��ư�� ���������ϴ�."); // t �� label�� Text����
			
			}		
		}
}

public class ActionEventTest3 {

	public static void main(String[] args) {
		MyFrame3 t=new MyFrame3();
	}
}

