package part01.sec02.exam07;

class LimitedValue{
	final static int UPPER_LIMIT=100000; // final �� �ٰԵǸ� �ѹ����õȰ��� ���� �ٲ����ʴ´�  : ��� => �����Ȱ�  /�������
 	int value;
	
	void setValue(int value) {
		if(value<UPPER_LIMIT) {
			this.value=value;
		}else {
			this.value=UPPER_LIMIT;
		}
	}
}

public class StaticFieldExample2_4 {

	public static void main(String[] args) {
		LimitedValue v=new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value="+v.value);
		System.out.println("���Ѱ�="+LimitedValue.UPPER_LIMIT);
		//LimitedValue.UPPER_LIMIT=200000;
		System.out.println("���Ѱ�="+LimitedValue.UPPER_LIMIT);

	}

}
