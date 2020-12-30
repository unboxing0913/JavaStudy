package part01.sec01.exam01;

import java.awt.Frame;
// GUI(Graphic User Interface)
class RunFrame extends Frame implements Runnable{          //Frame���� ������ ����Ʈ ���������    :GUI��Ŭ����
	public void run() {               //��ü�� �ٸ�Ŭ������ ��ӹް������� Runnable�� ���� ( �ڹٴ� ���߻���� �ȵǱ⶧�� ) 
		int i=0;
		System.out.println("������ ����!");
		while(i<20) {
			System.out.print(i+"\t");
			this.setTitle("������ ���� ��"+i++); //setTitle
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}		
		}
		System.out.println("������ ����!");
	}
}

public class RunFrameMain_6 {

	public static void main(String[] args) {
		RunFrame r = new RunFrame();
	    r.setSize(300,100);
	    r.setVisible(true);
	    Thread t=new Thread(r); // implements Runnable�� �޾������
	    t.start();
	}

}
