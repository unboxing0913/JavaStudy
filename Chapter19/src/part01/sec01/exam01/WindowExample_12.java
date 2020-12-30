package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*����*/

public class WindowExample_12 extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels= {"Backspace","","","CE","C","7","8","9"
			                   ,"/","sprt","4","5","6","x","%","1","2","3"
			                   ,"-","1/x","0","+/-",".","+","="}; //�������
	
	public WindowExample_12() {
		tField=new JTextField(35);
		panel=new JPanel();
		
		setTitle("calculator_test");
		tField.setText("0.");
		tField.setEnabled(false); /*�ʵ忡 ���� �Է°����ϰ� �Ұ����� t/f */
		tField.setBackground(Color.pink);
		
		panel.setLayout(new GridLayout(5,5,3,3)); //��,��,����,����
		buttons = new JButton[25];
		int index=0;
		/*2�����迭 => 2������                       �ٽ�)���� ��ư�ȿ� �ִ¹�� */
		for(int rows=0;rows<5;rows++) { //�� for�� ��		
			for(int cols=0;cols<5;cols++) { //�� for�� ��
				buttons[index] = new JButton(labels[index]);
				panel.setLocation(rows, cols); // �г��� ��ġ
				panel.add(buttons[index]); // �гο� ��ư�� �迭�� ������
				panel.setBackground(Color.BLACK);
				//if(index<25) /*��ư�迭�� [25]�� �����س��⶧���� index �ִ밪 �������൵��*/														
					if(cols>=3) {
						buttons[index].setForeground(Color.RED);
					}else {
						buttons[index].setForeground(Color.blue);
					}
					buttons[index].setBackground(Color.YELLOW);	
					index++;	 //index �������� ����												
			}
		}
	    this.setLayout(new BorderLayout());  //jframe Ư���� ContentPane�� Layout�� BorderLayout�̱⶧���� ���� �Ƚ��൵��
		this.add("North",tField);
		this.add("Center",panel);
		this.pack();
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		WindowExample_12 f =new WindowExample_12();

	}

}
