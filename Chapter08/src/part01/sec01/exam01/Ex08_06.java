package part01.sec01.exam01;

public class Ex08_06 {

	public static void main(String[] args) {
		int aa[]= {10,20,30,40,50};
		int count,size;
		int sum=0;
		
		count=aa.length;
		size=count*Integer.BYTES; //������ ũ�⸦ �����ִ� ��ɾ�
		
		System.out.printf("�迭 aa[]�� ����� ������%d�� �Դϴ�.\n",count);
		System.out.printf("�迭 aa[]�� ����� ��üũ��� %d����Ʈ �Դϴ�.\n",size);

		// ���� for��
		 
		for(int k:aa)  //aa���� ������ �ϳ����ǰ��� k������
		   sum+=k;
		
		System.out.println("���� "+sum);
			 
			
			
			
			
			
	}

}
