package sec02.try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample_2 {

	public static void main(String[] args) {
		String data1=null;
		String data2=null;
		
		try {
			data1=args[0];
			data2=args[1];			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsException");
			System.out.print(" 값1 값2");
			
			return;
		}
		try {
			
			int value1=Integer.parseInt(data1);
		    int value2=Integer.parseInt(data2); 		 
		    int result=value1+value2;		
		    System.out.println(data1+"+"+data2+"="+result);
				
			
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
		}finally { //예외 발생 여부와 상관없이 실행(생략가능)
			System.out.println("다시 실행하세요.");
		}

		
		
	}

}
