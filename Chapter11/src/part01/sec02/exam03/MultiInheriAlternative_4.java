package part01.sec02.exam03;

class TV2{
	
	public void onTV() {
		System.out.println("���� ��� ��");
	}
	
}

interface Computer2{
	public void dataReceive(); //�߻�޼ҵ�
}

class ComputerImpl{
	
	public void dataReceive() { //����ϱ��� => �Ϲݸ޼ҵ�
		System.out.println("���� ������ ���� ��"); //����: �������̵��ȸ޼ҵ�
	}
}
             /*�Ϲ�Ŭ����*/     /*�������̽�*/ 
class IPTV extends TV2 implements Computer2{ //implements:�����Ѵ�
	//java ���߻�� �ȵǱ⶧���� �Ϲݻ������ �ѹ��ް� �������̽����ѹ� �޴� ���
	ComputerImpl comp=new ComputerImpl();
	 
	public void dataReceive() { //�������̵�
		comp.dataReceive(); 
	}
	
	public void powerOn() {
		dataReceive();//=>Ŭ�����ȿ��ִ� dataReceive() �޼ҵ� ȣ��
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
