package sec02.try_catch_finally;

public class TryCatchFinallyExample_1 {

	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("java.lang.String2");
		/*Class.forName() Ŭ�����ȿ� �̷� Ŭ������ �ִ��� ã���ִ� ClassŸ���� �޼ҵ� */	
		}catch(ClassNotFoundException e) { //Exception�� �ְ� �θ�
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		}finally {
			System.out.println("�ý����������մϴ�");
		}
	  

	}

}
