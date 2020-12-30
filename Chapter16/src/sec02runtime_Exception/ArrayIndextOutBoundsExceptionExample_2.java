package sec02runtime_Exception;

public class ArrayIndextOutBoundsExceptionExample_2 {

	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
                                                        //배열의 인덱스값을 모르거나 넘어갈경우
			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsException");
			System.out.print(" 값1 값2");
		}
	}
}
