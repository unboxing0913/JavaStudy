package part01.sec01.exam06;


class Speaker{ //final class Speaker : ��� ����
	private int volumeRate;
	
	/*final public void showCurrentState() {
		System.out.println("����ũ��: "+volumeRate); //10
	}final : �޼��� �������̵� ����*/
	
	public void showCurrentState() {
		System.out.println("����ũ��: "+volumeRate); //10
	}
	public void seVolume(int vol) { //10
		volumeRate=vol;
	}
	
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() {
		super.showCurrentState();//volumeRate�� ����̿��� private�̱⶧���� �θ�޼ҵ� ȣ���������
		System.out.println("���̽� ũ��:"+baseRate); //20
	}
	public void setBaseRate(int base) { //20
		baseRate=base;		
	}
}


public class Overriding_6 {

	public static void main(String[] args) {
		BaseEnSpeaker bs=new BaseEnSpeaker();
		bs.seVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	    
	}

}
