package part01.sec01.exam01;

public class Ex09_17 {

	// ���� ����(call by value)-�� ��ü�� �޼ҵ忡 �Ѱ��ִ� ���  
	
	static void func1(int a){
		a=a+1;
		System.out.printf("���޹��� a==>%d\n",a); //11
	}
	
	
	
	public static void main(String[] args) {
	    int a=10;
	    func1(a); //call by value : ���� ���� func1 �޼ҵ忡 �Ѱ���
	   
	    System.out.printf("func1()���� ���� a==>%d\n",a); //10

	}
              
}
