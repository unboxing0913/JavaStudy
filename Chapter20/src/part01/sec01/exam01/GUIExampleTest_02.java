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
		setTitle("콤보박스");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		
		String[] animals= {"dog","lion","tiger"};
		JComboBox animalList = new JComboBox(animals); // 콤보박스 생성 안에 animals 리스트를 넣어 객체생성
		animalList.setSelectedIndex(0);  // 인덱스값 0 항목선택 (시작값)		
		animalList.addActionListener(this); //이벤트처리
		
		label=new JLabel();
	    label.setHorizontalAlignment(JLabel.CENTER);//수평조절
		
		this.add(animalList,BorderLayout.NORTH);
		this.add(label,BorderLayout.SOUTH);
		
		changePicture(animals[animalList.getSelectedIndex()]); //메소드(첫글자소문자) //animalList의 선택한 인덱스값
		
		this.setVisible(true);
		
	}
	
	
	protected void changePicture(String name){
	    ImageIcon icon = new ImageIcon(name+".gif"); //이미지를 바꾸는 작업
	    label.setIcon(icon);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {//그림이 변경될때 눌려진값 , ActionEvent (실행시 뭔가발생했을때의 값)
		JComboBox cb = (JComboBox)e.getSource(); //이벤트가 발생한 타입으로 강제타입변환시켜준다
		String name = (String)cb.getSelectedItem(); //선택한걸 가져온다  dog,lion,tiger문자타입이기때문에 String으로 강제타입변환
		changePicture(name); // 호출
	}
	
	

	public static void main(String[] args) {
		GUIExampleTest_02 f = new GUIExampleTest_02();
	}



}
