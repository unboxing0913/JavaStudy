package part01.sec01.exam01;

public class HashCodeExample_13 {

	public static void main(String[] args) {
		String obj1=new String("�츣�̿´�");
		String obj2=new String("�츣�̿´�");
		String obj3=new String("�츣�̿´�2");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode(); /*(key)���� ������ �ؽ��ڵ尪 ����*/
		int hash3=obj3.hashCode(); /*(key)���̴޶����� �ؽ��ڵ尪�� �޶���*/
		System.out.println(hash1);
		System.out.println(hash2);
		System.out.println(hash3);
	}
}
