package part01.sec02.exam03;

class TV{
	
	public void onTV() {
		System.out.println("���� ��� ��");
	}
	
}

class Computer{
	public void dataReceive() {
		System.out.println("���� ������ ������");
	}
}
/*
class IPTV extends TV,Computer{ //java�� ���� ����� �������� �ʴ´�.

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
