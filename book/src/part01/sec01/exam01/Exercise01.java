package part01.sec01.exam01;

public class Exercise01 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3!=0) {
				continue;			
			}else {
				sum+=i;
			}
		}System.out.print("3의 배수의 합"+sum);
	
	}

}
