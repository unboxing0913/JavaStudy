package part01.sec01.exam01;

public class Ex07_11 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=100;i++) {
			
				hap+=i;
			
		}
		System.out.printf("1~100까지의 합은 %d입니다.\n",hap);
		
		if(hap > 5000) {
			return;//main()종료
         }
		
		System.out.printf("프로그램의 끝입니다.");
		
			

	}

}
