package part01.sec01.exam02;

public class Exam_03 {

	public static void main(String[] args) {
		int co=0;
		
		for(int i=1;i<=9;i++) {
			
			if(i<=5) //co 는 열의 증가감소를 조절해주는역활을 하고있음
				co++; 
			else
				co--;
			
			// System.out.println(co); ==> 1,2,3,4,5,4,3,2,1
 			for(int j=1;j<=co;j++) {
							
					
				System.out.print(j);
		
		}System.out.println();
	   

	}

}
}