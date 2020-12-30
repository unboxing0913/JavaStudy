package part01.sec10.exam01;

public class Evaluation_05 {

	public static void main(String[] args) {
		// 반복문 for if 사용
		// 아스키 코드 출력(0부터 128까지)
		// 16으로 나눈 나머지가 0일때 제목출력
		
		int i=0;
		
		
		for(i=0;i<=127;i++) {
			if(i%16==0) {
				System.out.println("-----------------------------");
				System.out.println("10진수\t 16진수\t 문자");
				System.out.println("-----------------------------");
			}
			System.out.printf("%d\t",i);
			System.out.printf("%x\t",i);
			System.out.printf("%c\n",i);
		
		} 
}	
}
