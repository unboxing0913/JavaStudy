package part01.sec10.exam01;


public class Ex06_14_ {

	public static void main(String[] args) {
		//2*1=2 2*2=4 2*3=6 ........... 2*9=18
		//3*1=3 3*2=6 3*3=9 ........... 3*9=27
		//*1*2*3*4*5*6*7*8*9 반복된다.
		int i,k;
	    
	         	 
		for(i=2;i<=9;i++) { //2단부터 9단까지 
			for(k=1;k<=9;k++) { // 1곱부터 9곱까지
				System.out.printf("%d x %d= %d \n",i,k,i*k);
				//System.out.print('*');
	        	   
			}
			
			System.out.println();
			
		}
			
	}

}
