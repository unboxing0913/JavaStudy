package part01.sec01.exam01;

public class WrapperExample1_1 {

	public static void main(String[] args) {
		
		Integer obj1=new Integer(12); // ����Ŭ��������     : �ڽ� Boxing        (12): ������Ƽ�갪
		Integer obj2=new Integer(7);
		
		int sum=obj1.intValue()+obj2.intValue(); //������ִ°� �������¹� intValue() : ��ڽ� Unboxing
		System.out.println(sum);

	}

}

/*
 * �ϳ��� ���� ��ü���� �ϳ��� ������Ƽ�� ���� ���� �� �ִµ� �� ���� ������ �Ķ���ͷ� �Ѱ��־���Ѵ�
 * ���� ��ü�� �����ǰ� �� �������� �� ��ü�ȿ� �ִ� ������Ƽ�� ���� �ٲ� �� ����.
 */
