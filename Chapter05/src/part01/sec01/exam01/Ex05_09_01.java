package part01.sec01.exam01;



public class Ex05_09_01 {

	public static void main(String[] args) {
		// A,B���� :"�� ���Ͽ����ϴ�."
		// C,D���� :"�� �� ����ϼ���."
		// F ���� :"���� �б⿡ �ٽ� ���� �ϼ���"
		// �׿� :"�߸��� �����Դϴ�."
			    
	    
	    char grade='C';//���ڵ���ǥ
	    
	    switch(grade) {
	    case 'A'://���ڵ���ǥ
	    	//System.out.println("�� ���Ͽ����ϴ�.");
	        //break;
	    case 'B':
	    	System.out.println("�� ���Ͽ����ϴ�.");
	    	break;
	    case 'C':
	    	//System.out.println("�� �� ����ϼ���.");
	    	//break;
	    case 'D':
	    	System.out.println("�� �� ����ϼ���.");
	    	break;
	    case 'F':
	        System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
	        break;
	    
	    default:
	    	System.out.println("�߸��� �����Դϴ�.");
	    }
	}
}
	


