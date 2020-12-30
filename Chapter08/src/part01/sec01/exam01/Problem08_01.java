package part01.sec01.exam01;

public class Problem08_01 {

	public static void main(String[] args) {
		
		int[][] aa=new int[4][4];
		
		
		
		for(int i=0;i<aa.length;i++) {              //값 입력
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j]=(int)(Math.random()*10)+1;
				
			
			}
		}
		
		for(int i=0;i<aa.length;i++) {             //값 출력
			for(int j=0;j<aa[i].length;j++) {
				System.out.print(aa[i][j]+"\t");
			}
	             System.out.println();

           }
		
	}
}
// 4X4 2차원 배열을 만들고 
// 이곳에 1에서 10까지 범위의 정수를 
// 랜덤하게 생성하여 정수 16개를배열에 
// 저장하고 2차월 배열을 화면에 출력하세요.
// 1에서 10까지의 범위의 정수를 랜덤하게 생성 다음 코드 사용.