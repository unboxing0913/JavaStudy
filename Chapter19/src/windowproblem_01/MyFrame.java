package windowproblem_01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
         
	
	public MyFrame(){
		setSize(300,200);
		setTitle("My Frame");		
		setLayout(new FlowLayout());				
		JButton button = new JButton("¹öÆ°");
		this.add(button);	
		setVisible(true);
		

	}
}
