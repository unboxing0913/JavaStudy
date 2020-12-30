package part01.sec02.exam03;

class A4{
	
	void methodA(){
		I2 i = InstanceManager.getInstance(); //정적메소드 호출
		//반환 값 받을 I2타입 변수
		i.methodB(); //반환된 	
	}
}

interface I2{
	
	public abstract void methodB();
	
}

class B3 implements I2{
	
	public void methodB() {
		System.out.println("methodB in B2 class");
	}	
}

class InstanceManager{
	
	public static I2 getInstance() {
//	   I2 i = new B3(); //객체생성
//	   return i; //반환
	   
	   return new B3();  // 반환값에 바로 객체생성해서 보낼수있음
	}
}


public class InterfaceTest3_8 {

	public static void main(String[] args) {

		A4 a=new A4();
		a.methodA();
		

	}

}
