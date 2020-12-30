package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("방의 갯수를 입력 : ");
		int roomsu=s.nextInt();
		//boolean타입의 기본값은 false
		boolean room[]=new boolean[roomsu]; // 빈방 :false 사용중:true
		
		while(true) {
			System.out.print("1.입실|2.퇴실 |3.보기 |4.종료 : ");
			int select=s.nextInt();
			
			if(select==4) { //퇴실선택했을시 반복문종료
						break; 
			}
			
			int roomNum;
			boolean check=true;	
			
			switch(select) {
			case 1:
				do {
					System.out.print("입실하실 방의 번호를 입력 : ");
					roomNum=s.nextInt(); 
					if(roomNum<1 || roomNum>roomsu) {
				       System.out.println(roomNum+"호실은 없습니다.");//1~roomsu까지 방만 체크하려고
					}else {
						check=false;//반복문을 빠져나가기  나갔다가 들어오면서 다시true를주기때문에 상관없음
					}
				}while(check); // do while문 나가기 
				/////////////////////////////////////////////////////////////////////////////
				if(room[roomNum-1]){//룸배열의 인덱스안에들어가있으니 -1 ex)5번방=>0,1,2,3,4,5,6 이기때문에 -1 해줌
					 System.out.println(roomNum+"호실은 현재 사용중 입니다.");
				 }else {//기본값이 false 이기때문에 false이 참이아니니깐
					 room[roomNum-1]=true;
					 System.out.println(roomNum+"호실에 입실하셨습니다.");
				 }
				 break;
				
			
			
			case 2:
				do {
					System.out.print("퇴실하실 방의 번호를 입력 : ");
					roomNum=s.nextInt(); 
					if(roomNum<1 || roomNum>roomsu) {
				       System.out.println(roomNum+"호실은 없습니다.");
					}else {
						check=false;//반복문을 빠져나가기
					}
				}while(check);
				
				if(room[roomNum-1]) {
					room[roomNum-1]=false;
					System.out.println(roomNum+"호실에서 퇴실하셨습니다.");	
				}else {					
					System.out.println(roomNum+"호실은 빈방입니다.");
				}
				break;
						
								
			case 3:
				for(int i=0;i<room.length;i++) {//01234
					if(room[i]) {
						System.out.println(i+1+"방은 사용중 입니다.");				   
				}else{					
					System.out.println(i+1+"방은 빈방 입니다.");
				 }			
			    }
				break;
			default:
				System.out.println("번호를 잘 못 입력하셨습니다.");
				
			}
			
		}
          System.out.println("프로그램을 종료합니다.");
          s.close();
	}

}
