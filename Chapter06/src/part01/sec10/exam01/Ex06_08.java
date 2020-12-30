package part01.sec10.exam01;

public class Ex06_08 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=10;i++) {
			//hap=hap+i; 이걸 간단하게 줄이는 식
			hap+=i;
			
		}
      System.out.printf("1에서 10까지의 합:%d",hap);
	}

}

