package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int com[]=new int[6];
		int select[]=new int[6];
		

		for(int i=0;i<com.length;i++) {//반복해도 여기서 다시 ++해주기때문
			com[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++) { // j<i => i전 값 까지만 비교하면되기때문에
					if(com[i]==com[j]) {
						i--; //중복된숫자였을때 처리되지않기위해 i의 위치를 뺌
						break;//안쪽 for문을 빠져나감
					}		
				}		
             }
		for(int i=0;i<select.length;i++) {                   //입력된값 범위체크
			do {
				System.out.print((i+1)+"번째 수를 입력:");
				select[i]=s.nextInt();
			}while(select[i]>45 || select[i]<1); //조건식을 만족하면 다시읽어라 
			
			for(int j=0;j<i;j++) {                           // 입력된값 숫자체크
				if(select[i]==select[j]) {
					i--;
					break;
				}
			}
		}
		   int co=0;
		   for(int i=0;i<com.length;i++) {
			   for(int j=0;j<select.length;j++) {
				   if(com[i]==select[j]) {
					   co++;
					   break;
				   }
				  
				   
			   }
		   }
		      System.out.println(co+"개를 맞추셨습니다");
		      s.close();
		

}
}

//for(int i=0;i<com.length;i++) {
//	com[i]=(int)(Math.random()*45)+1;
//		for(int j=0;j<com.length;j++) {
//			if(com[i]==com[j]) {
//				continue;
//			}else if(com[i]>com[j]) {
//				com[i]=com[j];
//			}else {
//				break;
//			}
//		        for(int k=0;k<select.length;k++) {
//				System.out.printf("%d번째 수를 입력 : ",k+1);
//				select[k] =s.nextInt();	
//				if(select[k]==com[j]) {
//				  	su+=1;
//				    }
//	             }					                          					    		
//              }
//            }
//      System.out.println(su+"개 맞추셨습니다.");
