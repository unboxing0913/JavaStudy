package part01.sec01.exam01;
//�ٽ��غ���
import java.util.Scanner;

public class Ex09_14 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int res;
		int oper,a,b;
		System.out.printf("����Է�(1:+,2:-,3:*,4:/):");
		oper = s.nextInt();
		
		System.out.printf("ù��° ���ڸ� �Է� : ");
		a=s.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է� : ");
		b=s.nextInt();
		
	    res=calc(a,b,oper);
	    
	    System.out.printf("��� ����� :%d\n",res);
	    
	    s.close();
		
	}


   public static int calc(int v1,int v2,int op) {
	   int result;
		
		switch(op) {
		case 1:
			result = v1+v2;
			break;
		case 2:
			result = v1-v2;
			break;
		case 3:
			result = v1*v2;
			break;
		case 4:
			result = v1/v2;
			break;
		default:
			result=0;			
		break;
		}
        return result; 
		
   }
   
}