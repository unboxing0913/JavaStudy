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
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.print("java ArrayIndexOutOfBoundsException");
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �� �� �����ϴ�.");
		}finally {
			System.out.println("�ٽ� ���� �ϼ���");
		}
		

	}

}
