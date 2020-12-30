package part01.sec03.exam01;

import java.util.Scanner;

public class RoomMg {
   Scanner s=new Scanner(System.in);
	int roomNum;
	boolean[] roomSu;
	boolean check=true;	
	
	
   RoomMg(boolean[] roomSu){
	   this.roomSu=roomSu;
   }
   
   void input() {
	   do {
			System.out.print("�Խ��Ͻ� ���� ��ȣ�� �Է� : ");
			roomNum=s.nextInt(); 
			if(roomNum<1 || roomNum>this.roomSu.length) {
		       System.out.println(roomNum+"ȣ���� �����ϴ�.");
			}else {
				check=false;
			}
		}while(check); 
		
		if(this.roomSu[roomNum-1]){
			 System.out.println(this.roomNum+"ȣ���� ���� ����� �Դϴ�.");
		 }else {
			 this.roomSu[roomNum-1]=true;
			 System.out.println(this.roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
		 }
	   
   }
   void output() {
	   do {
			System.out.print("����Ͻ� ���� ��ȣ�� �Է� : ");
			roomNum=s.nextInt(); 
			if(roomNum<1 || roomNum>this.roomSu.length) {
		       System.out.println(roomNum+"ȣ���� �����ϴ�.");
			}else {
				this.check=false;
			}
		}while(check); 
		
		if(this.roomSu[roomNum-1]){
			roomSu[roomNum-1]=false;
			 System.out.println(this.roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
		 }else {
			 System.out.println(this.roomNum+"ȣ���� ����Դϴ�.");
		 }
	   
	   
	   
   }
   void view() {
	   for(int i=0;i<this.roomSu.length;i++) {
			if(this.roomSu[i]) {
				System.out.println(i+1+"���� ����� �Դϴ�.");				   
		}else{					
			System.out.println(i+1+"���� ��� �Դϴ�.");
		 }			
	    }
	   
	   
   }
   void exit() {
	   System.out.println("���α׷��� �����մϴ�.");
	   System.exit(0);
	   
   }

}
