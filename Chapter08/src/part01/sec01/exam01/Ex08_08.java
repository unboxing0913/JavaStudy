package part01.sec01.exam01;

public class Ex08_08 {

	public static void main(String[] args) {
		int[][] aa=new int[3][4];
		int i,k;
		int val=1;
		
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++){
				aa[i][k]=val;
				val++;              //��������
				
			}System.out.println();
		}
		
		 System.out.printf("aa[0][0]���� aa[2][3]���� ���\n");
		
		for(i=0;i<3;i++) {
			//System.out.println();
			for(k=0;k<4;k++){            // ����½�
                System.out.printf("%3d",aa[i][k]);
	       }
			System.out.println();
        }
		
	}
}
