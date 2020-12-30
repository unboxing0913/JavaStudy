package part01.sec02.exam03;
//인터페이스의 메소드는 public abstract 로  선언되기때문에 메소드 오버라이딩할때 public 해줘야함
interface A2{  //=> 서로다 같음 //인터페이스의 메소드는 public abstract 자동
	void aaa();
	public abstract void bbb();
	
}

class B2 implements A2{
	
	public void aaa() {  //반드시 public : 메소드 재정의시 더 강한 접근제한자를 사용할수없기때문에      
		System.out.println("aaa method");	
	     }
	
    public void bbb() {
    	System.out.println("bbb method");
         }
}
public class Round14_Ex02_6 {

	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();

	}

}
