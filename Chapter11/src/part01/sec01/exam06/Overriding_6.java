package part01.sec01.exam06;


class Speaker{ //final class Speaker : 상속 금지
	private int volumeRate;
	
	/*final public void showCurrentState() {
		System.out.println("볼륨크기: "+volumeRate); //10
	}final : 메서드 오버라이딩 금지*/
	
	public void showCurrentState() {
		System.out.println("볼륨크기: "+volumeRate); //10
	}
	public void seVolume(int vol) { //10
		volumeRate=vol;
	}
	
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() {
		super.showCurrentState();//volumeRate는 상속이여도 private이기때문에 부모메소드 호출해줘야함
		System.out.println("베이스 크기:"+baseRate); //20
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
