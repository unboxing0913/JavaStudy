package part01.sec01.exam01;

public class Ex03_10 {

	public static void main(String[] args) {
		 int a=100,b=200; // ����
		 double result;
	     
		 result=a/b; //   ����/���� ==> ����
		 
		 System.out.printf("%f\n",result); //�׷��� 0.000000000����ǥ��
		 
		 a=170;
		 b=30;		 
		 
		 result=a/b; 
		 // 5.666666666666667 -> �����ʸ���� ����� 5.000000 (�Ǽ��ͱ�����ü�� �ٸ�)
		 
		 System.out.printf("%f\n",result); // %f ������ �Ǽ���������� �����ʸ����
		 		
		 //float w=0.1234;
		 float w=0.1234f; //�⺻������ �ڹٿ��� �Ǽ��� double�� �νĵǱ⶧���� f�� float �ٲ��ֱ�
		 System.out.printf("%f\n",w);
		 
		 double y=0.1234;
		 System.out.printf("%f\n",y);
		 
		 

	}

}
