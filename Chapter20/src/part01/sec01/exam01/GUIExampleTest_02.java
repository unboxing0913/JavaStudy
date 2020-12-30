package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*JComboBox*/
public class GUIExampleTest_02 extends JFrame implements ActionListener{
	JLabel label;
	
	public GUIExampleTest_02() {
		setTitle("�޺��ڽ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		
		String[] animals= {"dog","lion","tiger"};
		JComboBox animalList = new JComboBox(animals); // �޺��ڽ� ���� �ȿ� animals ����Ʈ�� �־� ��ü����
		animalList.setSelectedIndex(0);  // �ε����� 0 �׸��� (���۰�)		
		animalList.addActionListener(this); //�̺�Ʈó��
		
		label=new JLabel();
	    label.setHorizontalAlignment(JLabel.CENTER);//��������
		
		this.add(animalList,BorderLayout.NORTH);
		this.add(label,BorderLayout.SOUTH);
		
		changePicture(animals[animalList.getSelectedIndex()]); //�޼ҵ�(ù���ڼҹ���) //animalList�� ������ �ε�����
		
		this.setVisible(true);
		
	}
	
	
	protected void changePicture(String name){
	    ImageIcon icon = new ImageIcon(name+".gif"); //�̹����� �ٲٴ� �۾�
	    label.setIcon(icon);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {//�׸��� ����ɶ� �������� , ActionEvent (����� �����߻��������� ��)
		JComboBox cb = (JComboBox)e.getSource(); //�̺�Ʈ�� �߻��� Ÿ������ ����Ÿ�Ժ�ȯ�����ش�
		String name = (String)cb.getSelectedItem(); //�����Ѱ� �����´�  dog,lion,tiger����Ÿ���̱⶧���� String���� ����Ÿ�Ժ�ȯ
		changePicture(name); // ȣ��
	}
	
	

	public static void main(String[] args) {
		GUIExampleTest_02 f = new GUIExampleTest_02();
	}



}
