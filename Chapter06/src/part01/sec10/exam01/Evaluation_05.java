package part01.sec10.exam01;

public class Evaluation_05 {

	public static void main(String[] args) {
		// �ݺ��� for if ���
		// �ƽ�Ű �ڵ� ���(0���� 128����)
		// 16���� ���� �������� 0�϶� �������
		
		int i=0;
		
		
		for(i=0;i<=127;i++) {
			if(i%16==0) {
				System.out.println("-----------------------------");
				System.out.println("10����\t 16����\t ����");
				System.out.println("-----------------------------");
			}
			System.out.printf("%d\t",i);
			System.out.printf("%x\t",i);
			System.out.printf("%c\n",i);
		
		} 
}	
}
