package part01.sec01.exam02;

public class Exam_03 {

	public static void main(String[] args) {
		int n = 5;
		int sum = hap(n);
		System.out.println("1~5������ ��: " + sum);

	}

	public static int hap(int n) {
//		int gg = 0;
//		for (int i = 1; i <= n; i++) {
//			gg += i;
//		}
//		return gg;
		
		if(n==1) {                       //���ȣ�� ����
			return 1;
		     }
		int tot=n+hap(n-1); //hap(n-1) �޼ҵ�ȿ��� �ڱ��ڽ� ȣ�� (�׸��׷��������ذ� ���ο� �޼ҵ尡�ִٻ����ϰ� �׸���) ���ϸ��ϸ��ϸ��ϸ���
		return tot;

	}

}
