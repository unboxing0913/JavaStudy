package part01.sec02.exam07;

/*
 * static으로 선언된 변수는 변수가 선언된 클래스의 모든 객체가 공유하는 변수이다.
 * static으로 선언된 변수는 메모리 공간에 하나만 존재하며 어디서나 접근이 가능한 변수이다.
 * 단, 어디서나 접근이 가능하려면 static 변수도 public으로 선언되어야 한다.
 * static 으로 선언 가능한 것은 정적필드,정적메서드,정적 초기화 블록이 있다.
 * 
 */

class InstCnt{
	static int instNum=0;  //객체생성을 안해도되는 정적멤버이기때문에  밑에서 값이증가함에 따라 증가된값이 저장됨
	//객체가 생성되기전에 먼저만들어짐 
	public InstCnt() {
           instNum++;
           System.out.println("인스턴트 생성: "+instNum);
		
		
	}
}


public class ClassVar {

	public static void main(String[] args) {
      InstCnt cnt1=new InstCnt();
      InstCnt cnt2=new InstCnt();
      InstCnt cnt3=new InstCnt();
      

	}

}
