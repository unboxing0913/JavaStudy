package part01.sec10.exam01;

public class problem06_01 {

	public static void main(String[] args) {

		int i, k, m;

		for (m = 2; m <= 9; m++) { // 변수 하나 더 만들필요는없음. (난 모르고하나더만든것 i를써도 밑에 초기화되면서 이상없음)

			System.out.printf(" #제%d단#\t\t", m);

		}
		System.out.println();
		System.out.println(); 
		//System.out.printf("\n\n"); 같은것

		for (i = 1; i <= 9; i++) {//여기서 i값 다시주기때문에
			for (k = 2; k <= 9; k++) {
				System.out.printf("%d x %d= %d \t", k, i, k * i);
			}

			System.out.println();

		}

	}

}
