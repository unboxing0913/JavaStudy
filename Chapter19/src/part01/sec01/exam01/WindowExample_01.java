package part01.sec01.exam01;

import java.awt.Container;

import javax.swing.JFrame; /*swing 나중에나온버전*/
import javax.swing.JLabel;
/*겹치는식의 구조 */ /*Frame , JFrame 사용방법*/
public class WindowExample_01 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Hello Java Program"); /*프레임구조사용하기위해 객체생성*/
		Container contentPane = frame.getContentPane();       /*다형성 contentPane을사용하기위해 (부모타입인듯)*/
		JLabel label = new JLabel("Hello,Java"); /* 라벨의 객체생성 */
		contentPane.add(label); /*contentPane 위에 라벨을 겹치는 */
		frame.pack(); /*프레임내에 서브컴포넌트들의 레이아웃과 Prefered Size에
                                                맞도록 윈도우의 사이즈를 맞추는 작업이다.*/
		frame.setVisible(true);    /* 윈도우창을 보여줄껀지 t/f */

	    
	}

}
