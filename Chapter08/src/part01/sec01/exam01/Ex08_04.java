package part01.sec01.exam01;

public class Ex08_04 {

	public static void main(String[] args) {
		
		int aa[]= {100,200,300,400}; //�߰�ȣ�� �������� �ټ����ִ�.
		int[] bb= new int[] {100,200,300}; //�����ָ� ���̸�������⶧���� ���� []���� ���ڸ����൵�ȴ�.
		int cc[]; //�����ϰ� ���߿� �ټ����ִ�. ��������ÿ��ٶ��� �������������� �����ϰ��ٶ��� new int[]�̷��� �߰�
		cc=new int[] {100,200}; //�����ϰ� �ٶ��� �迭�� �̹̼����߱⶧���� �迭��! ����ȴ�.
		int[] dd=new int[1];//ũ�⸦ ���� �ټ����ִ�.
		dd[0]=100;//100�̶�¼��ڸ� dd�迭 0��°�� �־��
		
		int i;
		
		for(i=0;i<4;i++) {
			System.out.printf("aa[%d]==>%d\t",i,aa[i]); //�迭�����߿��Ѱ� ��ġ ��ġ���׻�0����
		}System.out.println();
		for(i=0;i<3;i++) {
			System.out.printf("bb[%d]==>%d\t",i,bb[i]);
		}System.out.println();
		for(i=0;i<2;i++) {
			System.out.printf("cc[%d]==>%d\t",i,cc[i]);
		}System.out.println();
		for(i=0;i<1;i++) {
			System.out.printf("dd[%d]==>%d\t",i,dd[i]);
		}System.out.println();
	}

}
