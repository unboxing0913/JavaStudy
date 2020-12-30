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

/*KeyListener 와 이미지 불러오기*/
/*방향키를 이용해서 이미지 이동*/
class MyPanel extends JPanel{//
	BufferedImage img=null;//
	int img_x=100,img_y=100; //
	
	public MyPanel()  { //생성됨과 동시에 main에서 실행하기위해서
		try {
			img=ImageIO.read(new File("car.png")); /*이미지관련 입출력클래스*/
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1); //이미지가없어서 종료될땐 '1'
		}
		
		this.addKeyListener(new KeyListener() {//익명클래스

			@Override
			public void keyPressed(KeyEvent e) { //키가 눌러졌을때
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
				repaint();//도큐먼트찾아보기
				
			}//keyPressed 괄호

			@Override
			public void keyReleased(KeyEvent e) { //키를 해제했을때 호출
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) { //키의종류를 입력했을때 호출
				// TODO Auto-generated method stub
				
			}
			
			
			
		});
		/*이미지를 움직이기위한 명령어*/
		this.requestFocus(); // 키 이벤트를 받은 컴포넌트를 강제로 설정
		this.setFocusable(true);// 키 이벤트의 포커스를 받을 수있는 컴포넌트가 여러개있을때 우선적으로 입력받기 위해 설정
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
		this.add(new MyPanel()); //적용시켜주는것
		this.setVisible(true);
	}
	
	
	

	public static void main(String[] args) {
		ActionEventTest_11 s=new ActionEventTest_11();

	}


	

}
