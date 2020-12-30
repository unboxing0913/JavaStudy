package sec06.throws_;
/*throws 의 개념 */ 
public class ThrowsExample {

	public static void main(String[] args) {
		try {
		      findClass();
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		}
			
		
	}
	
	public static void findClass() throws ClassNotFoundException { //던진곳에서 반드시 try-catch 처리
		
		Class clazz=Class.forName("java.lang.String2");
		
	}

}
