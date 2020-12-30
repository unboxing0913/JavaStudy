package part01.sec01.exam01;

public class WrapperExample3_2 {

	public static void main(String[] args) { 
		
		int total=0;
		
		for(int cnt=0;cnt<args.length;cnt++) { 
			total+=Integer.parseInt(args[cnt]); // args[cnt]의 문자배열을 숫자로 받겠다
		}
		  System.out.println(total);

	}

}

/*
 * 래퍼 클래스에는 파라미터로 받은 문자열을 해석하여 프리미티브 값으로
 * 만들어서 리턴하는 정적 메소드가 있다. 
 */
 