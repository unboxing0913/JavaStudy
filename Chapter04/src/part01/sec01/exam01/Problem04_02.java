package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_02 {

	public static void main(String[] args) {
		
//	   Scanner s=new Scanner(System.in);
//	
//	   int money,c500,c100,c50,c10;
//	   
//	   System.out.printf("## ��ȯ�� ����?");
//	   money=s.nextInt();
	   
	   /*c500=money/500; 
	   System.out.printf("�����¥�� ==> %d��\n",c500);   
	   c100=(money-(c500*500))/100; // 
	   System.out.printf("���¥�� ==> %d��\n",c100);
	   c50=(money-(c500*500)-(c100*100))/50;//80 ���
	   System.out.printf("���ʿ�¥�� ==> %d��\n",c50);
	   c10=(money-(c500*500)-(c100*100)-(c50*50))/10;
	   System.out.printf("�ʿ�¥�� ==> %d��\n",c10);
	   
	   
	   money=money%10; //money%10 (X) money=money%10 (O)
	   System.out.printf("�ٲ��� ���� �ܵ� ==> %d��\n",money); */
	   
//	   c500=money / 500;
//	   money=money % 500;
//	   System.out.printf("�����¥�� ==> %d��\n",c500);
//	   c100=money / 100;
//	   System.out.printf("���¥�� ==> %d��\n",c100);
//	   money=money % 100;
//       c50 = money / 50;
//       System.out.printf("���ʿ�¥�� ==> %d��\n",c50);
//       money=money % 50;
//       c10 = money / 10;
//       System.out.printf("�ʿ�¥�� ==> %d��\n",c10);
//       money=money % 10;
//       System.out.printf("�ٲ��� ���� �ܵ� ==> %d��\n",money);	   
//	   s.close();
	   
//	   Scanner s=new Scanner(System.in);
//	   
//	   int reslut,c500,c100,c50,c10,jandon;
//	   
//	   System.out.print("## ��ȯ�� ����?");
//	   reslut=s.nextInt();
//	   
//	   c500=reslut/500; 
//	   System.out.printf("�����¥�� ==>%d\n",c500);
//	   
//	   c500=reslut%500; //reslut=reslut%500;
//	   c100=c500/100;   //c100=reslut/100;
//	   System.out.printf("���¥�� ==>%d\n",c100);
//	   
//	   c100=c500%100; //reslut=reslut%100;
//	   c50=c100/50;    //c100=reslut/50;
//	   System.out.printf("���ʿ�¥�� ==>%d\n",c50);
//	  
//	   c50=c100%50; //reslut=reslut%50;
//	   c10=c50/10;	   //c100=reslut/10;
//	   System.out.printf("�ʿ�¥�� ==>%d\n",c10);
//	   
//	   jandon=c10/10; // reslut=reslut%10;
//	   System.out.printf("�ٲ��� ���� �ܵ�==>%d\n",jandon); //reslut
//	   
//	   s.close();
//	
//	   

	   
	   
	   Scanner s=new Scanner(System.in);
	   
	   System.out.print( "## ��ȯ�ҵ��� ?");
	   int money=s.nextInt();
	   int c500,c100,c50,c10,jan;
	   
	   c500=money/500;
	   System.out.println("�����¥��==>"+c500+"��");
	   
	   money=money%500;
	   c100=money/100;
	   System.out.println("���¥��==>"+c100+"��");
	   
	   money=money%100;
	   c50=money/50;
	   System.out.println("���ʿ�¥��==>"+c50+"��");
	   
	   money=money%50;
	   c10 = money/10;
	   System.out.println("�ʿ�¥��==>"+c10+"��");
	   
	   jan=money%10;
	   System.out.println("�ٲ��� ���� �ܵ�==>"+jan+"��");
       
	   s.close();

}
}