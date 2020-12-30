package part01.sec01.exam01;

public class AutoBoxingUnboxing_7 {

	public static void main(String[] args) {
		Integer iValue=10; //auto boxing
		Double dValue=3.14;
		
		System.out.println(iValue);//auto unboxing
		System.out.println(dValue);

		int num1=iValue; //auto unboxing
		double num2=dValue;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
