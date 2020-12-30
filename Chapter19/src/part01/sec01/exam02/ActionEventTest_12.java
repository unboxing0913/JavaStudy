package part01.sec01.exam02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ActionEventTest_12 extends JFrame implements KeyListener{
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area; /*�޸������*/
	
	public ActionEventTest_12() {
		panel=new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("���ڸ� �Է��Ͻÿ�:"));
		field=new JTextField(10);
		panel.add(field);
		area=new JTextArea(3,30);
		this.add(panel,BorderLayout.NORTH);
		this.add(area,BorderLayout.CENTER);
		
		field.addKeyListener(this);
		this.setTitle("keyEvent Test");
		this.setSize(400,200);
		this.setVisible(true);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		display(e,"key Pressed          ");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e,"key Released         ");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		display(e,"Key Typed           ");
		
	}
	
	/*����Ŭ����*/
	protected void display(KeyEvent e , String str) {
		char c = e.getKeyChar(); /*�Ѿ�� Ű�� ����*/
		int keyCode = e.getKeyCode(); /*�Ѿ�� Ű�� �ڵ尪*/
		String modifiers="Alt: "+e.isAltDown()+"Ctrl: "+e.isControlDown()+"Shift: "+e.isShiftDown(); //Ű�������� t/s
		area.append(""+str+"����"+c+"(�ڵ�:"+keyCode+")"+modifiers+"\n");
		
	}
	
	

	public static void main(String[] args) {
		new ActionEventTest_12();
		

	}

	

}
