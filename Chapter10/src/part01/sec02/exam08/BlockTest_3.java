package part01.sec02.exam08;
 //����Ǵ� ����
public class BlockTest_3 {
	
	static {
		System.out.println("static { }");//Ŭ���� �ʱ�ȭ ���
	}
	
	{
		System.out.println("{}"); //��ü �ʱ�ȭ ���
	}
	
	public BlockTest_3() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest_3 bt=new BlockTest_3();");
		BlockTest_3 bt1=new BlockTest_3();
		
		System.out.println("BlockTest_3 bt=new BlockTest_3();");
		BlockTest_3 bt2=new BlockTest_3();

	}

}
