package part01.sec01.exam01;

public class Problem08_01 {

	public static void main(String[] args) {
		
		int[][] aa=new int[4][4];
		
		
		
		for(int i=0;i<aa.length;i++) {              //�� �Է�
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j]=(int)(Math.random()*10)+1;
				
			
			}
		}
		
		for(int i=0;i<aa.length;i++) {             //�� ���
			for(int j=0;j<aa[i].length;j++) {
				System.out.print(aa[i][j]+"\t");
			}
	             System.out.println();

           }
		
	}
}
// 4X4 2���� �迭�� ����� 
// �̰��� 1���� 10���� ������ ������ 
// �����ϰ� �����Ͽ� ���� 16�����迭�� 
// �����ϰ� 2���� �迭�� ȭ�鿡 ����ϼ���.
// 1���� 10������ ������ ������ �����ϰ� ���� ���� �ڵ� ���.