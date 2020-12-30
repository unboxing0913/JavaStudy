package part01.sec01.exam01;
/*스레드 상속으로 받을때와 인터페이스로 받을때 차이점*/
class SmallLetters implements Runnable{
	
	 public void run() {
		 for(char ch='a';ch<='z';ch++) {
			 System.out.print(ch);
		 }
	 }
}

public class MultithreadExample_5 {
                                               /*Runnable로 받을때의 방식 */
	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters()); // Thread 객체생성 (생성자에 클래스를넘겨줌)
		thread.start();
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch:arr) { //향상된for문
			System.out.println(ch);
		}
           
	}

}
