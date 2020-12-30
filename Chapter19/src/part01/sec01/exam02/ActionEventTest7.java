package part01.sec01.exam02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*Graphics Ŭ���� Ȱ�� */
class MyPanel2 extends JPanel implements ActionListener{
	
	private int light_number=0;
	//JButton button = new JButton("Traffic light turn on");
	public MyPanel2() {
		//layout����,��ư ����,��ư�� ��ü ����,��ư ���̾ƿ� ����
		JButton button = new JButton("Traffic light turn on");
		button.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add("South",button);
		
	}
	
	              /*(�ڵ�����)  ��� ���� ������Ʈ�� �ڽ��� ����� �׸��� paintComponent() �޼��� ����*/
	protected void paintComponent(Graphics g) {//Graphics ��ü�� �ڹ� �÷����� ���� ����
		super.paintComponent(g); // �Ź� ���� ���������
		g.setColor(Color.BLACK);
		g.drawRect(100, 100, 100, 300);
		g.drawOval(100, 100, 100, 100); /*(x��ǥ,y��ǥ,��,����)*/
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		
		if(light_number == 0 ) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100); /*���� ä����۾�(x��ǥ,y��ǥ,��,����)*/
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
		if(light_number++ >= 2) { //���ǽ�(����������)
			light_number=0;
		}repaint();//������Ʈ
		

		
		
		
//		if(e.getSource()==button) {
//			paintComponent(super.getGraphics()); //Graphics �θ�Ÿ��ȣ���ؼ��ѱ�
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
