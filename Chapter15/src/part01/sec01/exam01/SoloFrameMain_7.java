package part01.sec01.exam01;
 /*�ΰ��� Ŭ������ ���� ��ȣ�ۿ�*/
import java.awt.Frame;

class SoloFrame extends Frame{
	
	public SoloFrame() {   
	SoloThread t = new SoloThread(this); // this �ڱ��ڽ�  ���⿡�� SoloFrame
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
		System.out.println("������ ����!");
		while(i<20) {
			System.out.print(i+"\t");
			f.setTitle("������ ���� ��"+i++); 
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}		
		}
		System.out.println("������ ����!");
	}
}


public class SoloFrameMain_7 {

	public static void main(String[] args) {
		SoloFrame s = new SoloFrame();
		s.setSize(300,100); //������â ���μ���ũ��
		s.setVisible(true); //������â �����ٰ��� t/f
        
	}

}
