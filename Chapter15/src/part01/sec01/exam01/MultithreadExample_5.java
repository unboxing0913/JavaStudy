package part01.sec01.exam01;
/*������ ������� �������� �������̽��� ������ ������*/
class SmallLetters implements Runnable{
	
	 public void run() {
		 for(char ch='a';ch<='z';ch++) {
			 System.out.print(ch);
		 }
	 }
}

public class MultithreadExample_5 {
                                               /*Runnable�� �������� ��� */
	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters()); // Thread ��ü���� (�����ڿ� Ŭ�������Ѱ���)
		thread.start();
		char arr[] = {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for(char ch:arr) { //����for��
			System.out.println(ch);
		}
           
	}

}
