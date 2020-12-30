package part01.sec01.exam01;

class DigitThread3 extends Thread{         

	public void run() {     
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
			try {
				 Thread.sleep(1000); // ()¾ÈÀÇ °ª¸¸Å­ ½ÇÇàÀÌ ´ÊÃçÁü  (1000Àº 1ÃÊ)
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class MultithreadExample_3 {

	public static void main(String[] args) {
			
		Thread thread = new DigitThread3(); 
		thread.start();

		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.print(ch);
			try {
				 Thread.sleep(1000); 
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

   }
}