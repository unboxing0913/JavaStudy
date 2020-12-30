package part01.sec01.exam01;

public class AboutStaticWrapping_3 {

	public static void main(String[] args) {
		Integer iValue1=new Integer(10); //생성자를 통해서
		Integer iValue2=Integer.valueOf(10);  // 메소드를 통해서      (생성자 없이 객체생성)       
		Integer iValue3=Integer.valueOf(20);
		Integer iValue4=Integer.valueOf(20); //같은숫자일시 공간공유 (객체가같다) //객체를 또 생성하지않음
		
		
		if(iValue1==iValue2) {
			System.out.println("iValue1과 iValue2는 동일 객체 참조");
		}else {
			System.out.println("iValue1과 iValue2는 다른 객체 참조");
		}
		
		if(iValue2==iValue3) {
			System.out.println("iValue2과 iValue3는 동일 객체 참조");
		}else {
			System.out.println("iValue2과 iValue3는 다른 객체 참조");
		}
		
		if(iValue3==iValue4) {
			System.out.println("iValue3과 iValue4는 동일 객체 참조");
		}else {
			System.out.println("iValue3과 iValue4는 다른 객체 참조");
		}
			
	}

}
