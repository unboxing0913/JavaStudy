//package part01.sec03.exam01;                다른방식 선생님이하신것 
//
//import java.io.IOException;
//import java.util.Scanner;
//
//class RoomMgg{
//	Scanner in;
//	boolean room[];
//	int roomsu;
//	
//	RoomMgg(){                                      // 생성자로 바로접근해서한 방법
//		in=new Scanner(System.in);
//		System.out.print("방의 갯수를 입력 : ");
//		roomsu=in.nextInt();		
//	}
//	
//	void input(){
//		int roomNum;
//		boolean check=true;
//		do {
//			System.out.print("입실하실 방의 번호 : ");
//			roomNum=in.nextInt();
//			if(roomNum<1||roomNum>roomsu) {
//				System.out.println(roomNum+"호실은 없습니다.");
//			}else {
//				check=false;
//			}
//		}while(check);
//	    if(room[roomNum-1]) {
//		System.out.println(roomNum+"호실은 현재 사용중 입니다.");
//	    }else {
//	    	room[roomNum-1]=true;
//	    	System.out.println(roomNum+"호실에 입실하셨습니다.");
//	    }
// }
//	
//	
//	void output() {
//		int roomNum;
//		boolean check=true;
//		
//		do {
//			System.out.print("퇴실 하실 방의 번호를 입력 : ");
//			roomNum=in.nextInt();
//			if(roomNum<1||roomNum>roomsu) {
//				System.out.println(roomNum+"호실은 없습니다.");
//			}else {
//				check=false;
//			}			
//		}while(check);
//		
//		if(room[roomNum-1]) {
//			room[roomNum-1]=false;
//			System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
//		}else {
//			System.out.println(roomNum+"호실은 빈방입니다.");
//		}
//	}
//	
//	
//	void view() {
//		for(int i=0;i<room.length;i++) {
//			if(room[i]) {
//				System.out.println(i+1+"방은 사용중 입니다.");
//			}else {
//				System.out.println(i+1+"방은 빈방 입니다.");
//			}
//		}
//	}
//	
//	void exit() {
//		System.out.println("프로그램을 종료합니다.");
//		System.exit(0); 
//	}
//	
//	
//}
//
//
//public class Exam_07_ {
//
//	public static void main(String[] args) throws IOException  { //
//	   
//		    RoomMgg room=new RoomMgg();
//	   
//	   while(true) {
//		   System.out.println("1.입실|2.퇴실|3.보기|4.종료");
//		   int select=System.in.read()-48;
//		   System.in.skip(2);
//		   
//		   
//		   switch(select) {
//		   case 1:
//			   room.input();
//			   break;
//		   case 2:
//			   room.output();
//			   break;
//		   case 3:
//			   room.view();
//			   break;
//		   case 4:
//			   room.exit();
//			   break;
//			default:
//				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
//		   }
//	   }
//
//	}
//}



