package part01.sec10.exam01;

public class problem06_01 {

	public static void main(String[] args) {

		int i, k, m;

		for (m = 2; m <= 9; m++) { // ���� �ϳ� �� �����ʿ�¾���. (�� �𸣰��ϳ�������� i���ᵵ �ؿ� �ʱ�ȭ�Ǹ鼭 �̻����)

			System.out.printf(" #��%d��#\t\t", m);

		}
		System.out.println();
		System.out.println(); 
		//System.out.printf("\n\n"); ������

		for (i = 1; i <= 9; i++) {//���⼭ i�� �ٽ��ֱ⶧����
			for (k = 2; k <= 9; k++) {
				System.out.printf("%d x %d= %d \t", k, i, k * i);
			}

			System.out.println();

		}

	}

}
