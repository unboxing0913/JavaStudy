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
//4X4 2���� �迭�� ����� 
//�̰��� 1���� 10���� ������ ������ 
//�����ϰ� �����Ͽ� ���� 16�����迭�� 
//�����ϰ� 2���� �迭�� ȭ�鿡 ����ϼ���.
//1���� 10������ ������ ������ �����ϰ� ���� ���� �ڵ� ���.