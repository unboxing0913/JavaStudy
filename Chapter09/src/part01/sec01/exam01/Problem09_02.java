package part01.sec01.exam01;
//오늘이거 100번치기
import java.util.Scanner;

public class Problem09_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		String str;
//		String out="";
//		String ff="";
//		// +32 -32 
//		System.out.print("문자열을 입력하세요 : ");                  //방법 여러개 
//		str = s.nextLine();		
//		for(int i=0;i<str.length();i++) {
//			   	 
//			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
//				ff=str.toLowerCase();
//			}else if(str.charAt(i)>=97 && str.charAt(i)<=122){
//			    ff=str.toUpperCase();	 
//			}
//			   out+=ff.charAt(i);
//			
//		}		 
//		System.out.println("변환된 문자열 ==>"+out);
		
		String in,out="";
		char ch;
		int count,i;
		int diff='a'-'B'; // 또는 32
		
		System.out.printf("문자열을 입력하세요 : ");
		in=s.nextLine();
		count=in.length();
		
		for(i=0;i<count;i++) {
			ch=in.charAt(i);
			if(('A'<=ch)&&ch<=('Z')) {
				out+=(char)(ch+diff);
			}else if(('a'<=ch)&&(ch<='z')) {
				out+=(char)(ch-diff);
			}else
				out+=ch;
		}  
		System.out.printf("변환된 문자열==>%s \n",out);
		s.close();
		
		
		
		
	}

}
