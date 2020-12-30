package part01.sec01.exam01;

public class WrapperExample5_6 {

	public static void main(String[] args) {
	   
		printDouble(new Double(123.45)); //될수있으면 이 방법선호
		printDouble(123.45);
		

	}
	
	public static void printDouble(Double obj) {
		System.out.println(obj);
	}

}
