package part01.sec01.exam02;

public class Exam_04 {

	public static void main(String[] args) {
		
//	    char alpa;               (char 변수를 줘서 하는방법)
//	    
//	    for(int i=1;i<=26;i++) {
//	    	alpa ='A';
//	    	for(int j=1;j<=i;j++) {	    		
//	    		System.out.print(alpa);
//	    		alpa++;//위치중요
//	    	}
//	    	System.out.println();
//	    }
		
		
		for(char i='A';i<='Z';i++) { // for문 조건문안에 char변수를넣어서하는방법
			for(char j='A';j<=i;j++) {
				
			
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
