package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {

		 Scanner s =new Scanner(System.in);
		 
		 
		 
		 System.out.print("ù��° ����� ���� �Է��ϼ���==>");
		 int su1 = s.nextInt();
		 System.out.print("<1>����<2>����<3>����<4>������==>");
		 int type = s.nextInt();
		 System.out.print("�ι�° ����� ���� �Է��ϼ���==>");
		 int su2 = s.nextInt();
		 
		 
//		 if(type==1) {
//		 int result = su1+su2;
//		 System.out.printf("%d+%d=%d",su1,su2,result);
//		 }else if(type==2) {
//		 int result = su1-su2;
//		 System.out.printf("%d-%d=%d",su1,su2,result);
//		 }else if(type==3){
//	     int result = su1*su2;
//	     System.out.printf("%d*%d=%d",su1,su2,result);
//		 }else if(type==4){
//		 int result = su1/su2;
//	     System.out.printf("%d/%d=%f",su1,su2,(float)result);
//		 }else 
//			 s.close();
// ---------------------------------------------------------------------		 
		 switch (type){
		 case 1:
			 int result = su1+su2;
		     System.out.printf("%d+%d=%d",su1,su2,result);
		     break;
		 case 2: 
			 result = su1-su2;
			 System.out.printf("%d-%d=%d",su1,su2,result);
			 break;
		 case 3:
			 result = su1*su2;
			 System.out.printf("%d*%d=%d",su1,su2,result);
			 break;
		 case 4:
			 result = su1/su2;
			 System.out.printf("%d/%d=%d",su1,su2,(float)result);
			 break;
		 default:
			 s.close();
		 }
		 
	}

}
