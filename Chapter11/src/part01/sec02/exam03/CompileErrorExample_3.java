package part01.sec02.exam03;

class TV{
	
	public void onTV() {
		System.out.println("영상 출력 중");
	}
	
}

class Computer{
	public void dataReceive() {
		System.out.println("영상 데이터 수신중");
	}
}
/*
class IPTV extends TV,Computer{ //java는 다중 상속을 지원하지 않는다.

	public void powerOn() {
		dataReceive();
		onTV();
	}
}

*/
public class CompileErrorExample_3 {

	public static void main(String[] args) {
		/*
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		TV tv=iptv;
		Computer comp=iptv;
		*/
	}

}
