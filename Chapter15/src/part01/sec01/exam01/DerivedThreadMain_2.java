package part01.sec01.exam01;

class DerivedThread extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i+"\t");
		}
	}
}

public class DerivedThreadMain_2 {

	public static void main(String[] args) {  /*������ ��Ŀ����� �����̳����� ���α׷��� ���ᰡ�ȵ� */
		System.out.println("���α׷��� ����");       /*������ �޼ҵ尡 ���ᰡ�Ǿ���*/
        DerivedThread d=new DerivedThread();
        d.start();
        System.out.println("���α׷��� ����");
	}

}
