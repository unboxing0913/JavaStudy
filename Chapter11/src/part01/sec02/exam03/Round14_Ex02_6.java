package part01.sec02.exam03;
//�������̽��� �޼ҵ�� public abstract ��  ����Ǳ⶧���� �޼ҵ� �������̵��Ҷ� public �������
interface A2{  //=> ���δ� ���� //�������̽��� �޼ҵ�� public abstract �ڵ�
	void aaa();
	public abstract void bbb();
	
}

class B2 implements A2{
	
	public void aaa() {  //�ݵ�� public : �޼ҵ� �����ǽ� �� ���� ���������ڸ� ����Ҽ����⶧����      
		System.out.println("aaa method");	
	     }
	
    public void bbb() {
    	System.out.println("bbb method");
         }
}
public class Round14_Ex02_6 {

	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();

	}

}
