package part01.sec01.exam01;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {    /*ObjectŬ������ toSting �������̵�*/
		
		return name+":"+age;
	}
}

public class HashSet_18 {

	public static void main(String[] args) {
		HashSet <Object>set = new HashSet<Object>(); /*<Ÿ��>�� �������ϸ� Object�� ó��*/
        set.add("abc");
        set.add("abc"); /*�ߺ� ����ȵ� �ϳ�������*/
        set.add(new Person("David",10));                          
        set.add(new Person("David",10)); /*new ��ü�̱⶧���� ���δٸ���ü */
        
        System.out.println(set);
        
	}

}
