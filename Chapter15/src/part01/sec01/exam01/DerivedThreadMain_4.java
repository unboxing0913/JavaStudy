package part01.sec01.exam01;

class DerivedThread2 extends Thread {
	
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i+"\t");
		}
	}
}

public class DerivedThreadMain_4 {
	
		public static void main(String[] args) {  
			System.out.println("���α׷��� ����");       
	        DerivedThread2 d1=new DerivedThread2();
	        DerivedThread2 d2=new DerivedThread2();
	        d1.start();/*�ʿ��� ��ŭ ��ü�� ����� ����Ҽ��ִ�*/
	        d2.start();/*��ü���� �����ϸ� ���� ��ü���� ����ȴ�*/
	        System.out.println("���α׷��� ����");
		}

	}

