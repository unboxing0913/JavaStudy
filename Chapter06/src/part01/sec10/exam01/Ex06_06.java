package part01.sec10.exam01;

public class Ex06_06 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=10;i++) {
			//1234568910
			hap=hap+i;//��ȣ�ȿ����� �ߴ��� hap�� Ŀ������
			System.out.println(hap);
		}
		System.out.print(hap); // ��ȣ���� Ŀ�� hap �ϳ������ ��ȣ�� ���� ��������
		//�̹� hap�� 55�� ���� �����ϰ�����.
		//System.out.printf("1����10������ ��%d\n",hap);
	}

}


