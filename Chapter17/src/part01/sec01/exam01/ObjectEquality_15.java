package part01.sec01.exam01;

class IntNumber{
	int num;
	
	public IntNumber(int num) {
		this.num=num;		
	}
	public boolean isEquals(IntNumber numObj) {
		if(numObj.num==this.num) { /*숫자이기때문에 == , numObj의 num의 객체를 가져와야함 */
			return true;
		}else {
			return false;
		}
    
	}
	@Override
	public boolean equals(Object numObj) {
		if(this.num==((IntNumber)numObj).num) {  /* 캐스팅 괄호다음 도트연산자후에 호출 */
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectEquality_15 {

	public static void main(String[] args) {
		
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
                                           /*isEquals 직접메소드만든것*/
		if(num1.isEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.isEquals(num3)) {
			System.out.println("num1과 num3는 동일한 정수");
		}else {
			System.out.println("num1과 num3는 다른 정수");
		}
		////////////////////////////////////////////////////
		System.out.println();
		////////////////////////////////////////////////////
		if(num1.equals(num2)) {              /*equals메소드 오버라이딩*/
			System.out.println("num1과 num2는 동일한 정수");
		}else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.equals(num3)) {
			System.out.println("num1과 num3는 동일한 정수");
		}else {
			System.out.println("num1과 num3는 다른 정수");
		}
		
	}

}
