package windowproblem_05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	
	public MyFrame(){
	JPanel panel = new JPanel();
	add(panel);
	
	JLabel label1 = new JLabel("È­¾¾ ¿Âµµ");
	JLabel label2 = new JLabel("¼·¾¾ ¿Âµµ");
	 
	JTextField field1 = new JTextField(15);
	JTextField field2 = new JTextField(15);
		
	JButton button=new JButton("º¯Çü");
	
	panel.add(label1);
	panel.add(field1);
	panel.add(label2);
	panel.add(field2);
	panel.add(button);
	

	setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 150);
    this.setTitle("¿Âµµº¯È¯±â");
		
	}

}
