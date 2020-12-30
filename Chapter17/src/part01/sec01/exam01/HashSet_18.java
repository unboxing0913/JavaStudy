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
	public String toString() {    /*Object클래스의 toSting 오버라이딩*/
		
		return name+":"+age;
	}
}

public class HashSet_18 {

	public static void main(String[] args) {
		HashSet <Object>set = new HashSet<Object>(); /*<타입>을 지정안하면 Object로 처리*/
        set.add("abc");
        set.add("abc"); /*중복 저장안됨 하나만나옴*/
        set.add(new Person("David",10));                          
        set.add(new Person("David",10)); /*new 객체이기때문에 서로다른객체 */
        
        System.out.println(set);
        
	}

}
