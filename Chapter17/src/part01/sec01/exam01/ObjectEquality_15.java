package part01.sec01.exam01;

class IntNumber{
	int num;
	
	public IntNumber(int num) {
		this.num=num;		
	}
	public boolean isEquals(IntNumber numObj) {
		if(numObj.num==this.num) { /*�����̱⶧���� == , numObj�� num�� ��ü�� �����;��� */
			return true;
		}else {
			return false;
		}
    
	}
	@Override
	public boolean equals(Object numObj) {
		if(this.num==((IntNumber)numObj).num) {  /* ĳ���� ��ȣ���� ��Ʈ�������Ŀ� ȣ�� */
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectEquality_15 {

	public static void main(String[] args) {
		
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
                                           /*isEquals �����޼ҵ常���*/
		if(num1.isEquals(num2)) {
			System.out.println("num1�� num2�� ������ ����");
		}else {
			System.out.println("num1�� num2�� �ٸ� ����");
		}
		
		if(num1.isEquals(num3)) {
			System.out.println("num1�� num3�� ������ ����");
		}else {
			System.out.println("num1�� num3�� �ٸ� ����");
		}
		////////////////////////////////////////////////////
		System.out.println();
		////////////////////////////////////////////////////
		if(num1.equals(num2)) {              /*equals�޼ҵ� �������̵�*/
			System.out.println("num1�� num2�� ������ ����");
		}else {
			System.out.println("num1�� num2�� �ٸ� ����");
		}
		
		if(num1.equals(num3)) {
			System.out.println("num1�� num3�� ������ ����");
		}else {
			System.out.println("num1�� num3�� �ٸ� ����");
		}
		
	}

}
