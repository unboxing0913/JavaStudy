package part01.sec01.exam01;

public class Ex08_06 {

	public static void main(String[] args) {
		int aa[]= {10,20,30,40,50};
		int count,size;
		int sum=0;
		
		count=aa.length;
		size=count*Integer.BYTES; //정수의 크기를 구해주는 명령어
		
		System.out.printf("배열 aa[]의 요소의 개수는%d개 입니다.\n",count);
		System.out.printf("배열 aa[]의 요소의 전체크기는 %d바이트 입니다.\n",size);

		// 향상된 for문
		 
		for(int k:aa)  //aa에서 가져온 하나씩의값을 k의저장
		   sum+=k;
		
		System.out.println("합은 "+sum);
			 
			
			
			
			
			
	}

}
