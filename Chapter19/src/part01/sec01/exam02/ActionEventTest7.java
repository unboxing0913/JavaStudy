package part01.sec01.exam02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*Graphics 클래스 활용 */
class MyPanel2 extends JPanel implements ActionListener{
	
	private int light_number=0;
	//JButton button = new JButton("Traffic light turn on");
	public MyPanel2() {
		//layout설정,버튼 생성,버튼에 객체 연결,버튼 레이아웃 지정
		JButton button = new JButton("Traffic light turn on");
		button.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add("South",button);
		
	}
	
	              /*(자동실행)  모든 스윙 컴포넌트는 자신의 모양을 그리는 paintComponent() 메서드 보유*/
	protected void paintComponent(Graphics g) {//Graphics 객체는 자바 플랫폼에 의해 공급
		super.paintComponent(g); // 매번 새로 만들어지게
		g.setColor(Color.BLACK);
		g.drawRect(100, 100, 100, 300);
		g.drawOval(100, 100, 100, 100); /*(x좌표,y좌표,폭,높이)*/
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		
		if(light_number == 0 ) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100); /*색을 채우는작업(x좌표,y좌표,폭,높이)*/
		}else if(light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		}else{
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
	   }
	
   }
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(light_number++ >= 2) { //조건식(후위연산자)
			light_number=0;
		}repaint();//업데이트
		

		
		
		
//		if(e.getSource()==button) {
//			paintComponent(super.getGraphics()); //Graphics 부모타입호출해서넘김
//			light_number=(light_number+1)%3;
//		}
				
	}
}



  public class ActionEventTest7 extends JFrame{
	
	public ActionEventTest7() {
		this.add(new MyPanel2());
	    this.setSize(300,500);
	    this.setVisible(true);
	 
	}
	

	public static void main(String[] args) {
		new ActionEventTest7();
	}

}
