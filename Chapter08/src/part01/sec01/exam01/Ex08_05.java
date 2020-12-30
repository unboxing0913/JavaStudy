package part01.sec01.exam01;

public class Ex08_05 {

	public static void main(String[] args) {
		int[] aa=new int[100];
		int bb[]=new int[100];
		int i;
		
		for(i=0;i<100;i++) { //i라는변수는 값을나타내거나 위치를나타내는용도
			aa[i]=i*2; // aa[0]=0 , aa[1]=2,~,aa[99]=198
		}
		for(i=0;i<100;i++) {
			bb[i]=aa[99-i]; // 배열안에서 연산식 가능
			
			//1        98
					
		
		}
		
		   System.out.printf("bb[0]는 %d,bb[99]는 %d 입력됨\n",bb[0],bb[99]);
		   // bb[0]==>198,bb[99]==>0
	}
}

