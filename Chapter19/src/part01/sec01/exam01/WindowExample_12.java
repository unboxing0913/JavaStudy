package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*계산기*/

public class WindowExample_12 extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels= {"Backspace","","","CE","C","7","8","9"
			                   ,"/","sprt","4","5","6","x","%","1","2","3"
			                   ,"-","1/x","0","+/-",".","+","="}; //계산기순서
	
	public WindowExample_12() {
		tField=new JTextField(35);
		panel=new JPanel();
		
		setTitle("calculator_test");
		tField.setText("0.");
		tField.setEnabled(false); /*필드에 값을 입력가능하게 할것인지 t/f */
		tField.setBackground(Color.pink);
		
		panel.setLayout(new GridLayout(5,5,3,3)); //행,열,수평,수직
		buttons = new JButton[25];
		int index=0;
		/*2차원배열 => 2중포문                       핵심)라벨을 버튼안에 넣는방법 */
		for(int rows=0;rows<5;rows++) { //밖 for문 행		
			for(int cols=0;cols<5;cols++) { //안 for문 열
				buttons[index] = new JButton(labels[index]);
				panel.setLocation(rows, cols); // 패널의 위치
				panel.add(buttons[index]); // 패널에 버튼의 배열을 덮어줌
				panel.setBackground(Color.BLACK);
				//if(index<25) /*버튼배열을 [25]을 설정해놨기때문에 index 최대값 안정해줘도됨*/														
					if(cols>=3) {
						buttons[index].setForeground(Color.RED);
					}else {
						buttons[index].setForeground(Color.blue);
					}
					buttons[index].setBackground(Color.YELLOW);	
					index++;	 //index 마지막에 증가												
			}
		}
	    this.setLayout(new BorderLayout());  //jframe 특성상 ContentPane의 Layout은 BorderLayout이기때문에 굳이 안써줘도됨
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
