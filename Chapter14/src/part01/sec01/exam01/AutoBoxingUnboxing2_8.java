package part01.sec01.exam01;

public class AutoBoxingUnboxing2_8 {

	public static void main(String[] args) {
		Integer num1=10;
		Integer num2=20;
		
		num1++; // num1 = new Integer(num1.inValue()+1);        //==>���οü�� ����� �ٽ� num1�� ���� ����
		System.out.println(num1);                               //    ���ο� ��ü��
		num2+=3; //num2 = new Integer(num2.inValue()+3);
		System.out.println(num2);
		
		int addResult=num1+num2;
		System.out.println(addResult);
		
		int minResult=num1-num2;
		System.out.println(minResult);

	}

}
