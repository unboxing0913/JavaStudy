package part01.sec01.exam01;

public class Problem08_02 {

	public static void main(String[] args) {
		
		 int[][] gg=new int[9][9];
		 
		 for(int i=0;i<gg.length;i++) {
			 for (int j=0;j<gg.length;j++){
				  gg[j][i] = (j+1)*(i+1);
			 }
		 }
		 
		 for(int i=0;i<gg.length;i++) {
			 for (int j=0;j<gg.length;j++){
				  System.out.printf("%d X %d = %d \t",j+1,i+1,gg[j][i]);
			 }System.out.println();
		 }

	}

}

//�迭�� ����� ���ÿ� ��ü�������
// ��øfor���� ����Ͽ�
// �������� ����ϼ���