package part01.sec01.exam01;
//������ ����
public class Ex04_02 {

	public static void main(String[] args) {
		int a=2,b=3,c=4;
		int result1,mok,namugi;
		double result2;
		
		result1=a+b-c;
		System.out.printf("%d+%d-%d=%d\n",a,b,c,result1);
		
		
		result1=a+b*c;
		System.out.printf("%d+%d*%d=%d\n",a,b,c,result1);
		
		
		result2=(float)a*b/c; // 6/4 ->  6.0/4.0 float �����ϳ��� �������
	    System.out.printf("%d*%d/%d=%f\n",a,b,c,result2);
	    // �Ǽ�result2 �������°� %d���ƴ� %f 
	    //���������� ������ ���� (�����ʸ�����ؼ� 1.00000~)->float���꿡�� ĳ��������
	    
	    mok=c/b;
		System.out.printf("%d/%d�� ����%d\n",c,b,mok);
		
		
		namugi=c%b;
		System.out.printf("%d%%%d �� �������� %d\n ",c,b,namugi);
		

		

		
	}

}
