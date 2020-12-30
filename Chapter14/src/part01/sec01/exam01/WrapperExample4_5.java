package part01.sec01.exam01;

public class WrapperExample4_5 {
    
	public static void main(String[] args) {
		
		Integer obj=new Integer("10");//가져올때 정수로 가져옴
		System.out.println(obj.intValue());
	    int sum=obj+20;
	    System.out.println(sum);

	}

}
