package part01.sec10.exam01;


public class problem06_02 {

	public static void main(String[] args) {
	     
	      int i;
	      for(i=0;i<=127;i++) {
	    	  if(i%16==0) { // 이런문제는 if 먼저물어봐야함.
		    	  System.out.println("-----------------------");
		    	  System.out.println("10진수\t16진수\t문자");
		    	  System.out.println("-----------------------");
		      }
	    	  
	      System.out.printf("%3d\t%3x\t%3c\n",i,i,i);
	     
	}     
 }
}
// 반복문 for if 사용
// 아스키 코드 출력(0부터 128까지)
// 16으로 나눈 나머지가 0일때 제목출력