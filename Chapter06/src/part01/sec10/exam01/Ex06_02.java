package part01.sec10.exam01;

public class Ex06_02 {

	public static void main(String[] args) {
		int i; //제어 변수(for문에 쓰는변수는 반복을 제어한다라는뜻)
		//int j;
		
		//for도 if와 같이 조건이 맞으면 무조건 첫번째 명령문
		for(i=0;i<5;i++) {// (초기화;비교;증가)(조건이맞을때까지) 각각위치값을 맞게
			System.out.println("안녕하세요? 빙글빙글 for문을 공부 중 입니다.");
		}
		System.out.println("안녕하세요2? 빙글빙글 for문을 공부 중 입니다.");
		
		for(i=0;i<3;i++) { //i=5 => i=0으로 초기화 
			System.out.println("안녕하세요?");
		    System.out.println("##반갑습니다.");
		}
		System.out.println("i="+i);

	}

}
