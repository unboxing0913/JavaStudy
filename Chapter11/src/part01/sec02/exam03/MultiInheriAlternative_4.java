package part01.sec02.exam03;

class TV2{
	
	public void onTV() {
		System.out.println("영상 출력 중");
	}
	
}

interface Computer2{
	public void dataReceive(); //추상메소드
}

class ComputerImpl{
	
	public void dataReceive() { //상속하기전 => 일반메소드
		System.out.println("영상 데이터 수신 중"); //현재: 오버라이딩된메소드
	}
}
             /*일반클래스*/     /*인터페이스*/ 
class IPTV extends TV2 implements Computer2{ //implements:구현한다
	//java 다중상속 안되기때문에 일반상속으로 한번받고 인터페이스로한번 받는 방법
	ComputerImpl comp=new ComputerImpl();
	 
	public void dataReceive() { //오버라이딩
		comp.dataReceive(); 
	}
	
	public void powerOn() {
		dataReceive();//=>클래스안에있는 dataReceive() 메소드 호출
		onTV();
	}
}

public class MultiInheriAlternative_4 {

	public static void main(String[] args) {	   
	    IPTV iptv=new IPTV();
	    iptv.powerOn();
	    
	    /*TV2 tv=iptv; 
	      Computer2 comp=iptv;*/
		

	}

}
