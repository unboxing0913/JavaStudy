package part01.sec01.exam01;
//���ڿ� �Ųٷ� ��½�Ű��
import java.util.Scanner;

public class Problem09_01 {

	public static void main(String[] args) {               // ��� ���� �Ѵ� �� 
		Scanner s=new Scanner(System.in);
//		String str;
//		String tt="";
//		System.out.print("���ڿ��� �Է��ϼ��� : ");
//		str=s.nextLine();
//	
//		for(int i=0;i<str.length();i++) { 
//			
//			
//			tt+=str.charAt((str.length()-1)-i);        //��ġ ������ �ð����ɷ���
//	      
//			
//	 			
//	     }System.out.print("������ �Ųٷ� ��� ==>"+tt);
//			
//	 		s.close();
	 		
	 ////////////////////////////////////////////////////////////////////////////////////////////		
	 	 String ss;
	 	 String tt=""; // ������ �ʱ�ȭ���Ǿ��־����
	 	 int count,i;
	 	 
	 	 System.out.printf("���ڿ��� �Է��ϼ���:");
	 	 ss=s.nextLine();
	 	 
	 	 count=ss.length();
		
	 	 for(i=0;i<count;i++) {
	 		 tt+=ss.charAt(count-(i+1));
	 	 }
	 	  System.out.printf("������ �Ųٷ� ���==>%s\n",tt);
	 	 s.close();
	 	}
		
		

	}



