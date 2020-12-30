package sec02runtime_Exception;

public class NumberFormatException_3 {
                                                /*숫자와 관련된 예외 NumberFormatException*/
	public static void main(String[] args) {
		String data1="100";
		String data2="a100";
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2); // 여기서 예외가 나온다
		
		int result=value1+value2;
		
		System.out.println(data1+"+"+data2+"="+result);
				

	}

}
