package part01.sec02.exam08;
 //실행되는 순서
public class BlockTest_3 {
	
	static {
		System.out.println("static { }");//클래스 초기화 블록
	}
	
	{
		System.out.println("{}"); //객체 초기화 블록
	}
	
	public BlockTest_3() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest_3 bt=new BlockTest_3();");
		BlockTest_3 bt1=new BlockTest_3();
		
		System.out.println("BlockTest_3 bt=new BlockTest_3();");
		BlockTest_3 bt2=new BlockTest_3();

	}

}
