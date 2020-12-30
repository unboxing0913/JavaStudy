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

/*A,B,AB,O,기타 ComboBox    당신의 혈액형은? => 선택하신혈액형 : ? 형 */
public class GUIExampleTest_06_02 extends JFrame implements ActionListener{
	     
	    private JLabel result;
	
	
	
	GUIExampleTest_06_02(){
		this.setTitle("frame예제");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("당신의 혈액형은?",SwingConstants.CENTER);
		label.setFont(new Font("",Font.BOLD,15));
		result = new JLabel("혈액형을 선택하세요",SwingConstants.CENTER);
		result.setFont(new Font("",Font.BOLD,15));
		String[] bloodType= {"A형","B형","AB형","O형","기타"};
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
	    result.setText(bl+"을 선택 했습니다.");
	}
	

	public static void main(String[] args) {
		GUIExampleTest_06_02 f = new GUIExampleTest_06_02();

	}

	

}
