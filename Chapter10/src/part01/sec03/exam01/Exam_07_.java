//package part01.sec03.exam01;                �ٸ���� ���������ϽŰ� 
//
//import java.io.IOException;
//import java.util.Scanner;
//
//class RoomMgg{
//	Scanner in;
//	boolean room[];
//	int roomsu;
//	
//	RoomMgg(){                                      // �����ڷ� �ٷ������ؼ��� ���
//		in=new Scanner(System.in);
//		System.out.print("���� ������ �Է� : ");
//		roomsu=in.nextInt();		
//	}
//	
//	void input(){
//		int roomNum;
//		boolean check=true;
//		do {
//			System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
//			roomNum=in.nextInt();
//			if(roomNum<1||roomNum>roomsu) {
//				System.out.println(roomNum+"ȣ���� �����ϴ�.");
//			}else {
//				check=false;
//			}
//		}while(check);
//	    if(room[roomNum-1]) {
//		System.out.println(roomNum+"ȣ���� ���� ����� �Դϴ�.");
//	    }else {
//	    	room[roomNum-1]=true;
//	    	System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
//	    }
// }
//	
//	
//	void output() {
//		int roomNum;
//		boolean check=true;
//		
//		do {
//			System.out.print("��� �Ͻ� ���� ��ȣ�� �Է� : ");
//			roomNum=in.nextInt();
//			if(roomNum<1||roomNum>roomsu) {
//				System.out.println(roomNum+"ȣ���� �����ϴ�.");
//			}else {
//				check=false;
//			}			
//		}while(check);
//		
//		if(room[roomNum-1]) {
//			room[roomNum-1]=false;
//			System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
//		}else {
//			System.out.println(roomNum+"ȣ���� ����Դϴ�.");
//		}
//	}
//	
//	
//	void view() {
//		for(int i=0;i<room.length;i++) {
//			if(room[i]) {
//				System.out.println(i+1+"���� ����� �Դϴ�.");
//			}else {
//				System.out.println(i+1+"���� ��� �Դϴ�.");
//			}
//		}
//	}
//	
//	void exit() {
//		System.out.println("���α׷��� �����մϴ�.");
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
//		   System.out.println("1.�Խ�|2.���|3.����|4.����");
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
//				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
//		   }
//	   }
//
//	}
//}



