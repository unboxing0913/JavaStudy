package part01.sec01.exam01;

class DigitThread {

	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
		}
	}

}

public class MultithreadExample1_1 {

	public static void main(String[] args) {
		 DigitThread digit = new DigitThread();
		  digit.run();
		  
		for(char ch='A';ch<'Z';ch++) {
			System.out.print(ch);
			
		}
	 
	}

}
