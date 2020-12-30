package part01.sec01.exam01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*A,B,AB,O,��Ÿ ComboBox    ����� ��������? => �����Ͻ������� : ? �� */
public class GUIExampleTest_06_02 extends JFrame implements ActionListener{
	     
	    private JLabel result;
	
	
	
	GUIExampleTest_06_02(){
		this.setTitle("frame����");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("����� ��������?",SwingConstants.CENTER);
		label.setFont(new Font("",Font.BOLD,15));
		result = new JLabel("�������� �����ϼ���",SwingConstants.CENTER);
		result.setFont(new Font("",Font.BOLD,15));
		String[] bloodType= {"A��","B��","AB��","O��","��Ÿ"};
		JComboBox bloodTypeList = new JComboBox(bloodType);
		bloodTypeList.setSelectedIndex(0);
		
		bloodTypeList.addActionListener(this);
		
		
		panel.setLayout(new GridLayout(3,1));
		this.setVisible(true);
		this.setSize(300, 200);
		this.add(panel);
		this.setLocation(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		JPanel panel2 = new JPanel();
		
		panel.add(label);	
		panel.add(panel2);
		panel2.setLayout(new FlowLayout());
		panel2.add(bloodTypeList);
	    bloodTypeList.setPreferredSize(new Dimension(280,20));
		panel.add(result);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    JComboBox blt=(JComboBox)e.getSource();
	    String bl = (String)blt.getSelectedItem();
	    result.setText(bl+"�� ���� �߽��ϴ�.");
	}
	

	public static void main(String[] args) {
		GUIExampleTest_06_02 f = new GUIExampleTest_06_02();

	}

	

}
