package part01.sec01.exam01;

public class Exercise06 {

	public static void main(String[] args) {
		int max = 0;
		int[] array= {1,5,3,8,2};
		
		for(int i=0;i<5;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		
		
		System.out.println("max:"+max);
 
	}

}
