package part01.sec01.exam01;

public class WrapperExample3_2 {

	public static void main(String[] args) { 
		
		int total=0;
		
		for(int cnt=0;cnt<args.length;cnt++) { 
			total+=Integer.parseInt(args[cnt]); // args[cnt]�� ���ڹ迭�� ���ڷ� �ްڴ�
		}
		  System.out.println(total);

	}

}

/*
 * ���� Ŭ�������� �Ķ���ͷ� ���� ���ڿ��� �ؼ��Ͽ� ������Ƽ�� ������
 * ���� �����ϴ� ���� �޼ҵ尡 �ִ�. 
 */
 