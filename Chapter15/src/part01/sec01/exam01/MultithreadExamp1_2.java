package part01.sec01.exam01;
/* 멀티스레드 */
class DigitThread2 extends Thread{         //Thread 라는 클래스를 상속받음

	public void run() {       //Thread 클래스의 도움을받으려면 메소드명이 run()이여함
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
		}
	}
}

public class MultithreadExamp1_2 {                        /*Thread로 받을때의 방식*/

	public static void main(String[] args) {
		//DigitThread2 digit = new DigitThread2();
		//digit.start(); // run()을 호출하려면 객체.start(); 로 호출한다
		
		Thread thread = new DigitThread2(); //다형성 원리에 의해서 부모타입으로 대입해도 된다
		thread.start();

		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.print(ch);

		}
	}

}

/*
 *  스레드(thread) : 프로그램의 실행흐름
 *  하나의 프로그램내에서 *독립적으로 실행되는 *메소드
 *  single thread : 스레드가 하나뿐인 프로그램
 *  multithread program:스레드가 둘 이상인 프로그램 :독립적으로 각각실행이됨
 *  
 *  동시에 실행되는 것이 아니고 자바 가상 기계는 멀티프로그램을 실행 할 때 
 *  프로그램의 실행시간을 아주 작은 간격으로 나누어서 스레드를 번갈아 실행한다.
 */