package sec02.try_catch_finally;

public class TryCatchFinallyExample_1 {

	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("java.lang.String2");
		/*Class.forName() 클래스안에 이런 클래스가 있는지 찾아주는 Class타입의 메소드 */	
		}catch(ClassNotFoundException e) { //Exception은 최고 부모
			System.out.println("클래스가 존재하지 않습니다");
		}finally {
			System.out.println("시스템을종료합니다");
		}
	  

	}

}
