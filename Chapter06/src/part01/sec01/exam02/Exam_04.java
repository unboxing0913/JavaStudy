package part01.sec01.exam02;

public class Exam_04 {

	public static void main(String[] args) {
		
//	    char alpa;               (char ������ �༭ �ϴ¹��)
//	    
//	    for(int i=1;i<=26;i++) {
//	    	alpa ='A';
//	    	for(int j=1;j<=i;j++) {	    		
//	    		System.out.print(alpa);
//	    		alpa++;//��ġ�߿�
//	    	}
//	    	System.out.println();
//	    }
		
		
		for(char i='A';i<='Z';i++) { // for�� ���ǹ��ȿ� char�������־�ϴ¹��
			for(char j='A';j<=i;j++) {
				
			
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
