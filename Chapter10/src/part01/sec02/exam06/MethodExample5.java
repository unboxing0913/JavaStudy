package part01.sec02.exam06;

public class MethodExample5 {

	public static void main(String[] args) {
		Account obj=new Account("777-777-7777777","최대박",10000);
		
		try {                            //시도하다  
		int amount=obj.withdraw(100000);
		System.out.println("인출액 :"+amount);
		}catch(Exception e){//던진거 여기서받아줌                   //시도하다가 에러가 나면 잡아준다 밑에 
	    String msg=e.getMessage();
		System.out.println(msg);
		}

	}

}
