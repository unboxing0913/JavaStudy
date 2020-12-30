package part01.sec01.exam01;

import java.awt.Frame;
// GUI(Graphic User Interface)
class RunFrame extends Frame implements Runnable{          //Frame으로 받을땐 임포트 시켜줘야함    :GUI쪽클래스
	public void run() {               //객체가 다른클래스를 상속받고있을때 Runnable을 쓴다 ( 자바는 다중상속이 안되기때문 ) 
		int i=0;
		System.out.println("스레드 시작!");
		while(i<20) {
			System.out.print(i+"\t");
			this.setTitle("스레드 동작 중"+i++); //setTitle
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}		
		}
		System.out.println("스레드 종료!");
	}
}

public class RunFrameMain_6 {

	public static void main(String[] args) {
		RunFrame r = new RunFrame();
	    r.setSize(300,100);
	    r.setVisible(true);
	    Thread t=new Thread(r); // implements Runnable로 받아줘야함
	    t.start();
	}

}
