package part01.sec01.exam02;

import java.util.Scanner;

public class ms_04 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("방의 갯수를 입력: ");
		 int su=s.nextInt();
		 boolean room[]=new boolean[su]; //입실/퇴실 => 두개
		 
		 while(true) {
		 System.out.print("1.입실 |2.퇴실 |3.보기 |4.종료");
		 int select=s.nextInt();
		 
		 if(select==4) {
			 break;
		 }
		 
		 int num;
		 boolean tt=true;
		 
		 switch(select) {
		 
		 case 1:
			     do{
			    	System.out.print("입실하실 방의 번호를 입력 : ");
			    	num=s.nextInt();
			    	if(num<1 || num>room.length){
			    		System.out.printf("%d호수는 존재하지않습니다.\n",num);
			    	}else {
			    	 tt=false;
			    	}
			     }while(tt);
			    
			     if(room[num-1]) {//room[num-1] 방수(몇번째방)   \ //room[su] ==> 방의범위 를 지정하려고쓴거임
			    	 System.out.printf("%d호실은 현재 사용중 입니다.\n",num);
			     }else {
			    	 System.out.printf("%d호실에 입실하셨습니다.\n",num);
			    	 room[num-1]=true;
			     }break;
			 
			 
		 case 2:
			    do {
			    	System.out.println("퇴실하실 방의 번호를 입력 : ");
			    	num=s.nextInt();
			    	if(num<1||num>room.length) {
			    		System.out.printf("%d호수는 존재하지 않습니다.\n",num);
			    	}else {
			    		tt=false;
			    	}
			    }while(tt);
			    
			    if(room[num-1]) {		    	
			    	System.out.printf("%d호실에서 퇴실하셨습니다.\n",num);
			    	room[num-1]=false;
			    }else {
			    	System.out.printf("%d호실은 빈방입니다.\n",num);
			    }break;
			 
		 case 3:
			 for(int i=0;i<room.length;i++) {
				 if(room[i]==true) {
					 System.out.printf("%d번방은 사용중입니다.\n",i+1);
				 }else {
					 System.out.printf("%d번방은 빈방입니다.\n",i+1);
				 }
			 }
		default:
			
		
		 }		 
		 }
		  System.out.println("프로그램을 종료합니다.");
		  s.close();
	}

}
