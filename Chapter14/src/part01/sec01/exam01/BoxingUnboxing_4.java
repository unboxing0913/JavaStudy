package part01.sec01.exam01;

public class BoxingUnboxing_4 {

	public static void main(String[] args) {
		Integer iValue = new Integer(10);
		Double dValue = new Double(3.14);
		
		System.out.println(iValue.intValue());
		System.out.println(iValue); // autounboxing 
		
		iValue=new Integer(iValue.intValue()+10);
		dValue=new Double(dValue.doubleValue()+1.2);
		
		System.out.println(iValue);
		System.out.println(dValue);
	}

}
