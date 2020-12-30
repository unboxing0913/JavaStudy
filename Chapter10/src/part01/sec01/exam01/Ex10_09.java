package part01.sec01.exam01;

class Calc{
	
	void addValue(double v1,double v2) {                 //동일메소드를 호출할때 매개변수로 구분이가능
		System.out.println("double값 계산 ==> "+(v1+v2));
	}
	void addValue(int v1,int v2) {
		System.out.println("int값 계산 ==> "+(v1+v2));
	}	
	void addValue(double v1) {                          //동일메소드지만 구분이되면 상관이없다.
		System.out.println("double값 계산 ==> "+(v1));
	}
}


public class Ex10_09 {

	public static void main(String[] args) {
		Calc myCalc = new Calc();
		
		myCalc.addValue(1.0,1.0);
		myCalc.addValue(1,1);
		myCalc.addValue(0.1);

	}

}
