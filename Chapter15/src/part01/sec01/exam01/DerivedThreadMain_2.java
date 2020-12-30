package part01.sec01.exam01;

class DerivedThread extends Thread {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i+"\t");
		}
	}
}

public class DerivedThreadMain_2 {

	public static void main(String[] args) {  /*스레드 방식에서는 메인이끝나도 프로그램이 종료가안됨 */
		System.out.println("프로그램의 시작");       /*각각의 메소드가 종료가되야함*/
        DerivedThread d=new DerivedThread();
        d.start();
        System.out.println("프로그램의 종료");
	}

}
