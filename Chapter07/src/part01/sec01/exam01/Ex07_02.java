package part01.sec01.exam01;

public class Ex07_02 {

	public static void main(String[] args) {
		//1부터 10까지의 합
			
		int i=1;
		int hap=0; 
		
		while(i<=10) { 
			
			 		
			hap=hap+i; // 계산하고 나서 증감시키기
			i++;	
		
		}
		System.out.printf("1부터 10까지의 합:%d\n",hap);


//		int i=0;
//		int hap=0; // 값을누적시키기위한 변수
//		
//		while(i<10) { //<=경우 10도포함이기때문에 10증가시킨 값인 11이 산출됨
//			
//			i++;	 		
//			hap=hap+i; // 증가되는 i값을 합에 더하기
//		}
//		System.out.printf("1부터 10까지의 합:%d\n",hap);
	}

}

