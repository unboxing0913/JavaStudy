package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_02 {

	public static void main(String[] args) {
		
//	   Scanner s=new Scanner(System.in);
//	
//	   int money,c500,c100,c50,c10;
//	   
//	   System.out.printf("## 교환할 돈은?");
//	   money=s.nextInt();
	   
	   /*c500=money/500; 
	   System.out.printf("오백원짜리 ==> %d개\n",c500);   
	   c100=(money-(c500*500))/100; // 
	   System.out.printf("백원짜리 ==> %d개\n",c100);
	   c50=(money-(c500*500)-(c100*100))/50;//80 어디
	   System.out.printf("오십원짜리 ==> %d개\n",c50);
	   c10=(money-(c500*500)-(c100*100)-(c50*50))/10;
	   System.out.printf("십원짜리 ==> %d개\n",c10);
	   
	   
	   money=money%10; //money%10 (X) money=money%10 (O)
	   System.out.printf("바꾸지 못한 잔돈 ==> %d개\n",money); */
	   
//	   c500=money / 500;
//	   money=money % 500;
//	   System.out.printf("오백원짜리 ==> %d개\n",c500);
//	   c100=money / 100;
//	   System.out.printf("백원짜리 ==> %d개\n",c100);
//	   money=money % 100;
//       c50 = money / 50;
//       System.out.printf("오십원짜리 ==> %d개\n",c50);
//       money=money % 50;
//       c10 = money / 10;
//       System.out.printf("십원짜리 ==> %d개\n",c10);
//       money=money % 10;
//       System.out.printf("바꾸지 못한 잔돈 ==> %d개\n",money);	   
//	   s.close();
	   
//	   Scanner s=new Scanner(System.in);
//	   
//	   int reslut,c500,c100,c50,c10,jandon;
//	   
//	   System.out.print("## 교환할 돈은?");
//	   reslut=s.nextInt();
//	   
//	   c500=reslut/500; 
//	   System.out.printf("오백원짜리 ==>%d\n",c500);
//	   
//	   c500=reslut%500; //reslut=reslut%500;
//	   c100=c500/100;   //c100=reslut/100;
//	   System.out.printf("백원짜리 ==>%d\n",c100);
//	   
//	   c100=c500%100; //reslut=reslut%100;
//	   c50=c100/50;    //c100=reslut/50;
//	   System.out.printf("오십원짜리 ==>%d\n",c50);
//	  
//	   c50=c100%50; //reslut=reslut%50;
//	   c10=c50/10;	   //c100=reslut/10;
//	   System.out.printf("십원짜리 ==>%d\n",c10);
//	   
//	   jandon=c10/10; // reslut=reslut%10;
//	   System.out.printf("바꾸지 못한 잔돈==>%d\n",jandon); //reslut
//	   
//	   s.close();
//	
//	   

	   
	   
	   Scanner s=new Scanner(System.in);
	   
	   System.out.print( "## 교환할돈은 ?");
	   int money=s.nextInt();
	   int c500,c100,c50,c10,jan;
	   
	   c500=money/500;
	   System.out.println("오백원짜리==>"+c500+"개");
	   
	   money=money%500;
	   c100=money/100;
	   System.out.println("백원짜리==>"+c100+"개");
	   
	   money=money%100;
	   c50=money/50;
	   System.out.println("오십원짜리==>"+c50+"개");
	   
	   money=money%50;
	   c10 = money/10;
	   System.out.println("십원짜리==>"+c10+"개");
	   
	   jan=money%10;
	   System.out.println("바꾸지 못한 잔돈==>"+jan+"개");
       
	   s.close();

}
}