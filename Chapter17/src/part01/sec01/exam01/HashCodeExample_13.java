package part01.sec01.exam01;

public class HashCodeExample_13 {

	public static void main(String[] args) {
		String obj1=new String("헤르미온느");
		String obj2=new String("헤르미온느");
		String obj3=new String("헤르미온느2");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode(); /*(key)값이 같으면 해쉬코드값 같음*/
		int hash3=obj3.hashCode(); /*(key)값이달라지면 해쉬코드값도 달라짐*/
		System.out.println(hash1);
		System.out.println(hash2);
		System.out.println(hash3);
	}
}
