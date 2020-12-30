package part01.sec01.exam02;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*KeyListener �� �̹��� �ҷ�����*/
/*����Ű�� �̿��ؼ� �̹��� �̵�*/
class MyPanel extends JPanel{//
	BufferedImage img=null;//
	int img_x=100,img_y=100; //
	
	public MyPanel()  { //�����ʰ� ���ÿ� main���� �����ϱ����ؼ�
		try {
			img=ImageIO.read(new File("car.png")); /*�̹������� �����Ŭ����*/
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1); //�̹�������� ����ɶ� '1'
		}
		
		this.addKeyListener(new KeyListener() {//�͸�Ŭ����

			@Override
			public void keyPressed(KeyEvent e) { //Ű�� ����������
				int keycode=e.getKeyCode();
				
				switch(keycode) {
				case KeyEvent.VK_UP:
					img_y-=10;	
					break;
				case KeyEvent.VK_DOWN:
					img_y+=10;
					break;
				case KeyEvent.VK_LEFT:
					img_x-=10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x+=10;
					break;
				}
				repaint();//��ť��Ʈã�ƺ���
				
			}//keyPressed ��ȣ

			@Override
			public void keyReleased(KeyEvent e) { //Ű�� ���������� ȣ��
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) { //Ű�������� �Է������� ȣ��
				// TODO Auto-generated method stub
				
			}
			
			
			
		});
		/*�̹����� �����̱����� ��ɾ�*/
		this.requestFocus(); // Ű �̺�Ʈ�� ���� ������Ʈ�� ������ ����
		this.setFocusable(true);// Ű �̺�Ʈ�� ��Ŀ���� ���� ���ִ� ������Ʈ�� ������������ �켱������ �Է¹ޱ� ���� ����
	}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,img_x,img_y,null);
		}
		
	
}



public class ActionEventTest_11 extends JFrame{
	
	public ActionEventTest_11() {
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel()); //��������ִ°�
		this.setVisible(true);
	}
	
	
	

	public static void main(String[] args) {
		ActionEventTest_11 s=new ActionEventTest_11();

	}


	

}
