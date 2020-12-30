package part01.sec01.exam01;

public class Ex08_08 {

	public static void main(String[] args) {
		int[][] aa=new int[3][4];
		int i,k;
		int val=1;
		
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++){
				aa[i][k]=val;
				val++;              //값증가식
				
			}System.out.println();
		}
		
		 System.out.printf("aa[0][0]부터 aa[2][3]까지 출력\n");
		
		for(i=0;i<3;i++) {
			//System.out.println();
			for(k=0;k<4;k++){            // 값출력식
                System.out.printf("%3d",aa[i][k]);
	       }
			System.out.println();
        }
		
	}
}
