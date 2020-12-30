package sec04.multi_catch;

public class CatchOrderExample_2 {

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
			
		}catch(Exception e) { // Exception이 최고조상이기때문에 혼자 다처리함 밑으로갈 일이없음 (맨마지막으로가야함)
			System.out.println("실행 매개값의 수가 부족합니다.");			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행에 문제가 있습니다.");
		}finally {
			System.out.println("다시 실행 하세요");
		}

	}

}
