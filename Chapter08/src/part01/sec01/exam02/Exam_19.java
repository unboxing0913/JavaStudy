package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 		 
		 System.out.print("학생수를 입력 : ");
		 int inwon=s.nextInt();
		 
		 String name[]=new String[inwon];
		 int kor[]=new int[inwon];
		 int eng[]=new int[inwon];
		 int rank[]=new int[inwon];
		 int tot[]=new int[inwon];
		 
		 for(int i=0;i<name.length;i++) {
			 System.out.printf("%d번째 학생의 이름:",i+1);
			 name[i]=s.next();
			 
			 System.out.printf("%d번째 학생의 국어점수",i+1);
			 kor[i]=s.nextInt();
			 System.out.printf("%d번째 학생의 영어점수",i+1);
			 eng[i]=s.nextInt();
			 
			 tot[i]=kor[i]+eng[i];//배열전체남아있음 for문이 끝나도 이런거 기억		 
		   }
		   // 반복문을 한번씩돌려가면서 생각
		 for(int i=0;i<name.length;i++) {
			 rank[i]=1;//1등이라고 가정,만들어줘야함. 그리고 1로 계속초기화시켜주는 의미
			 for(int j=0;j<name.length;j++) {//j는 증가하고(0~?) i는계속0 이포문이끝나면 1씩증가
				 if(tot[i]<tot[j]) { //이걸한번 자세히생각해보기 위에포문 아래포문 반복하면서 생기는루트를
					 rank[i]++;
				 }			         
		       }		 		   
		    } 
		 for(int i=0;i<name.length;i++) {
			                                      //등수를 그저 숫자로 생각하면 쉬움
	      System.out.printf("%s님의 총점은 %d이고, 순위는 %d등 입니다.\n",name[i],tot[i],rank[i]);
	     }
		   s.close();


}
}