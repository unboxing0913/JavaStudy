package part01.sec01.exam01;
                              //별표다섯개 메소드 ★★★★★
public class Ex08_04_02 {
                       
	public static void main(String[] args) { // main()메소드:JVM에서 호출
		int[] scores;
		scores =new int[]{83,90,87};
		
		int sum1=0;
		
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		
		for(int i=0;i<=2;i++) {				
			sum1+=scores[i];			
		}System.out.println("총합sum1 : "+sum1);	
		
		 
		
		   //매소드는 호출해야 일을 한다. 호출할때는 반드시 괄호 ★★★★★★★★★★★★★★★★★
		  int sum2=add(new int[]{83,90,87}); //호출하기전 값을만들어서 호출할add()에 값을넘기는것 
		        //260이라는값이 넘어옴
		  System.out.println("총합sum2 : "+sum2);
		  System.out.println();
		  	  
	
		  
		  
	} //main이 끝나면서 프로그램이 종료
           //  int[] scores= new int[]{83,90,87};     
   public static int add(int[] scores) { //add()매소드==>메소드는 반드시()가 존재해야 한다.★★★★★★★★★★★★
           	   int sum=0;
           	   for(int i=0;i<3;i++) {
           		   sum+=scores[i];
           	   }          	   
           	   
             	System.out.println("총합sum : "+sum);//260넘어감
           	   //return:메소드 종료★★★★★★★★★★★★
           	   return sum; //return옆에 변수가있으면 메소드종료이면서 sum값을 호출한 쪽으로 돌려준다.  
           	   //아주중요함 ★★★★★★★★★★★★★★★★★★★
   }
	

}
