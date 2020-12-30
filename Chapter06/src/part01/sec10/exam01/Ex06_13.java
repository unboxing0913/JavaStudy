package part01.sec10.exam01;

public class Ex06_13 {

	public static void main(String[] args) {
		int i, k;

		for (i = 0; i < 3; i++) { // for문안의 for문을 3번실행
			for (k = 0; k < 2; k++)   //k 2번출력
				//System.out.println("i=" + i+"k="+k);
				System.out.printf("중첩 for문 입니다.(i값%d,k값%d)\n",i,k);
			    System.out.println();
			
			

		}//첫번째 for문으로 다시감

	}
}