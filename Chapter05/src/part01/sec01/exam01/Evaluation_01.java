package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("������ �� �ٷ� ����� �Է�:");
		 String[] str = s.nextLine().split(" ");
	                         //nextLine �迭���� ���ڿ�!!!!!!!!!!	
		 char a = str[1].charAt(0); //0���ͽ��� 
		
		 int c = Integer.parseInt(str[0]);
		
		 int d = Integer.parseInt(str[2]);
		 
		 switch(a) {
		 
		 case '+':			
			 System.out.println(c+"+"+d+"="+(c+d));
			 break;
		 case '-':			
			 System.out.println(c+"-"+d+"="+(c-d));
			 break;			
		 case '*':
			 System.out.println(c+"*"+d+"="+(c*d));
			 break;
		 case '/':
			 System.out.println(c+"/"+d+"="+(float)(c/d));
			 break;
		 default:
			 System.out.println("�߸��Է��ϼ̽��ϴ�");
			 s.close();
		 }

}

}
