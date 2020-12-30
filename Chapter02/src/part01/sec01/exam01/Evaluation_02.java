package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {

		 Scanner s =new Scanner(System.in);
		 
		 
		 
		 System.out.print("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä==>");
		 int su1 = s.nextInt();
		 System.out.print("<1>µ¡¼À<2>»¬¼À<3>°ö¼À<4>³ª´°¼À==>");
		 int type = s.nextInt();
		 System.out.print("µÎ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä==>");
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
