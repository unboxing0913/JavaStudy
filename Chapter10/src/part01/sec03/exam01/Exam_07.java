package part01.sec03.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) throws IOException { //
		  Scanner s=new Scanner(System.in);
		  System.out.print("���� ������ �Է�: ");
		   int su =s.nextInt();		   
	       RoomMg room=new RoomMg(new boolean[su]);
	 
	   
	   while(true) {
		   System.out.println("1.�Խ�|2.���|3.����|4.����");
		   //int select=s.nextInt();
		   int select=System.in.read()-48;
		   System.in.skip(2);
		   
		   
		   switch(select) {
		   case 1:
			   room.input();
			   break;
		   case 2:
			   room.output();
			   break;
		   case 3:
			   room.view();
			   break;
		   case 4:
			   room.exit();
			   s.close();
			   break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
		   }
	   }
           
	}
}



