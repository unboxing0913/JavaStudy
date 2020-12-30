package sec04.multi_catch;

public class CatchByExceptionKindExample_1 {

	public static void main(String[] args) {
		try {
			String data1=null;
			String data2=null;
			data1 = args[0];
			data2 = args[1];
			int value1=Integer.parseInt(data1);
		    int value2=Integer.parseInt(data2); 		 
		    int result=value1+value2;		
		    System.out.println(data1+"+"+data2+"="+result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsException");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
		}finally {
			System.out.println("다시 실행 하세요");
		}
		

	}

}
