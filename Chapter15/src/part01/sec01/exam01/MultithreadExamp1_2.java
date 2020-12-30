package part01.sec01.exam01;
/* ��Ƽ������ */
class DigitThread2 extends Thread{         //Thread ��� Ŭ������ ��ӹ���

	public void run() {       //Thread Ŭ������ �������������� �޼ҵ���� run()�̿���
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
		}
	}
}

public class MultithreadExamp1_2 {                        /*Thread�� �������� ���*/

	public static void main(String[] args) {
		//DigitThread2 digit = new DigitThread2();
		//digit.start(); // run()�� ȣ���Ϸ��� ��ü.start(); �� ȣ���Ѵ�
		
		Thread thread = new DigitThread2(); //������ ������ ���ؼ� �θ�Ÿ������ �����ص� �ȴ�
		thread.start();

		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.print(ch);

		}
	}

}

/*
 *  ������(thread) : ���α׷��� �����帧
 *  �ϳ��� ���α׷������� *���������� ����Ǵ� *�޼ҵ�
 *  single thread : �����尡 �ϳ����� ���α׷�
 *  multithread program:�����尡 �� �̻��� ���α׷� :���������� ���������̵�
 *  
 *  ���ÿ� ����Ǵ� ���� �ƴϰ� �ڹ� ���� ���� ��Ƽ���α׷��� ���� �� �� 
 *  ���α׷��� ����ð��� ���� ���� �������� ����� �����带 ������ �����Ѵ�.
 */