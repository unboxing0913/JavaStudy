package part01.sec01.exam01;
 /*두개의 클래스를 서로 상호작용*/
import java.awt.Frame;

class SoloFrame extends Frame{
	
	public SoloFrame() {   
	SoloThread t = new SoloThread(this); // this 자기자신  여기에선 SoloFrame
	t.start();
	}
}

class SoloThread extends Thread{
	private Frame f=null;
	
	public SoloThread(Frame f) {
	  	this.f=f;//
	}
	
	public void run() {
		int i=0;
		System.out.println("스레드 시작!");
		while(i<20) {
			System.out.print(i+"\t");
			f.setTitle("스레드 동작 중"+i++); 
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}		
		}
		System.out.println("스레드 종료!");
	}
}


public class SoloFrameMain_7 {

	public static void main(String[] args) {
		SoloFrame s = new SoloFrame();
		s.setSize(300,100); //윈도우창 가로세로크기
		s.setVisible(true); //윈도우창 보여줄건지 t/f
        
	}

}
