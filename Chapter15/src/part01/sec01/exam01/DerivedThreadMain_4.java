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
			System.out.println("프로그램의 시작");       
	        DerivedThread2 d1=new DerivedThread2();
	        DerivedThread2 d2=new DerivedThread2();
	        d1.start();/*필요한 만큼 객체를 만들어 사용할수있다*/
	        d2.start();/*객체별로 실행하면 각각 객체별로 실행된다*/
	        System.out.println("프로그램의 종료");
		}

	}

