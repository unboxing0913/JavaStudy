package part01.sec01.exam01;

import java.util.HashSet;

class Person2{
	String name;
	int age;
	
	Person2(String name , int age){
		this.name=name;
		this.age=age;		
	}
	
	
	
	@Override
	public int hashCode() {		
		return this.name.hashCode()+this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 person=(Person2)obj;/*����ȯ*/
			return (this.name.equals(person.name)) && (this.age==person.age); /*������ true����*/
		}else {
			return false;
		}		
	}
	
	@Override
	public String toString() {   		
		return name+":"+age;
	}
	
	
}

public class HashSet_19 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		
		set.add(new String("abc"));
		set.add(new String("abc"));/*StringŸ�� : ���ڿ��� ó���ϸ� �ߺ�����ó�������ش�*/
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		
		
		System.out.println(set);

	}

}
