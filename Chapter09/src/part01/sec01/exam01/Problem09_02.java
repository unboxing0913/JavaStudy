package part01.sec01.exam01;
//�����̰� 100��ġ��
import java.util.Scanner;

public class Problem09_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		String str;
//		String out="";
//		String ff="";
//		// +32 -32 
//		System.out.print("���ڿ��� �Է��ϼ��� : ");                  //��� ������ 
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
//		System.out.println("��ȯ�� ���ڿ� ==>"+out);
		
		String in,out="";
		char ch;
		int count,i;
		int diff='a'-'B'; // �Ǵ� 32
		
		System.out.printf("���ڿ��� �Է��ϼ��� : ");
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
		System.out.printf("��ȯ�� ���ڿ�==>%s \n",out);
		s.close();
		
		
		
		
	}

}
