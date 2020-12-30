package part01.sec01.exam01;

public class Ex08_09 {

	public static void main(String[] args) {
		
		
		   int[][] aa= {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //행과행사이(,) , 전체괄호  ==>크기는 [3][4]인셈
		   int i,k;
		                               //값은있음
		   
		   System.out.printf("aa[0][0]부터 aa[2][3]까지 출력\n");
			
			for(i=0;i<3;i++) {                      //값출력
				//System.out.println();
				for(k=0;k<4;k++){ 
	                System.out.printf("%3d",aa[i][k]);
		       }
				System.out.println();
	        }
		
		

  }
 }


