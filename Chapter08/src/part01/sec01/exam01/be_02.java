package part01.sec01.exam01;

public class be_02 {

	public static void main(String[] args) {
		int gugu[][]=new int[9][9];

		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				gugu[j][i]=(i+1)*(j+1);
				System.out.printf("%d X %d = %d\t",j+1,i+1,gugu[j][i]);
			}System.out.println();
		}
		
				

	}

}

//배열을 선언과 동시에 객체를만들고
//중첩for문을 사용하여
//구구단을 출력하세요