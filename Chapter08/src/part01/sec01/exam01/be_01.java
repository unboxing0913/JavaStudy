package part01.sec01.exam01;



public class be_01 {

	public static void main(String[] args) {
	
		int[][] rd=new int[4][4];
		
		for(int i=0;i<rd.length;i++){
			for(int j=0;j<rd.length;j++){
				rd[i][j]=(int)(Math.random()*10)+1;
				
				System.out.print(rd[i][j]+"\t");
			}System.out.println();
		}
		
	}

}
//4X4 2차원 배열을 만들고 
//이곳에 1에서 10까지 범위의 정수를 
//랜덤하게 생성하여 정수 16개를배열에 
//저장하고 2차월 배열을 화면에 출력하세요.
//1에서 10까지의 범위의 정수를 랜덤하게 생성 다음 코드 사용.