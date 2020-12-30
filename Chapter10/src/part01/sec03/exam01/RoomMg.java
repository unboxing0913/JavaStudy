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
			System.out.print("입실하실 방의 번호를 입력 : ");
			roomNum=s.nextInt(); 
			if(roomNum<1 || roomNum>this.roomSu.length) {
		       System.out.println(roomNum+"호실은 없습니다.");
			}else {
				check=false;
			}
		}while(check); 
		
		if(this.roomSu[roomNum-1]){
			 System.out.println(this.roomNum+"호실은 현재 사용중 입니다.");
		 }else {
			 this.roomSu[roomNum-1]=true;
			 System.out.println(this.roomNum+"호실에 입실하셨습니다.");
		 }
	   
   }
   void output() {
	   do {
			System.out.print("퇴실하실 방의 번호를 입력 : ");
			roomNum=s.nextInt(); 
			if(roomNum<1 || roomNum>this.roomSu.length) {
		       System.out.println(roomNum+"호실은 없습니다.");
			}else {
				this.check=false;
			}
		}while(check); 
		
		if(this.roomSu[roomNum-1]){
			roomSu[roomNum-1]=false;
			 System.out.println(this.roomNum+"호실에서 퇴실하셨습니다.");
		 }else {
			 System.out.println(this.roomNum+"호실은 빈방입니다.");
		 }
	   
	   
	   
   }
   void view() {
	   for(int i=0;i<this.roomSu.length;i++) {
			if(this.roomSu[i]) {
				System.out.println(i+1+"방은 사용중 입니다.");				   
		}else{					
			System.out.println(i+1+"방은 빈방 입니다.");
		 }			
	    }
	   
	   
   }
   void exit() {
	   System.out.println("프로그램을 종료합니다.");
	   System.exit(0);
	   
   }

}
