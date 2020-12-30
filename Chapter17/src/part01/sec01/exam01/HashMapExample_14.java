package part01.sec01.exam01;

import java.util.HashMap;

class Name{
	String firstName;
	String lastName;
	
	Name(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		

	}
	
	public int hashCode() {		/*각각의 해쉬코드값을구해서 더한 결과값을 출력하게 오버라이딩 (사물함까지접근)*/
		return firstName.hashCode()+lastName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) { /*저장된 name과 새롭게넘긴 name의 문자열 비교*/
		if(!(obj instanceof Name)) {
			return false;	
		}
	    
		Name name=(Name)obj;   /*넘어온객체를 Name타입으로 캐스팅해서 Name클래스의 참조변수로 받아준다*/
		if(firstName.equals(name.firstName) && lastName.equals(name.lastName)) {			
			 return true;	
		}else {
		     return false;
		}
		
			
	}
	
	
}

public class HashMapExample_14 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable = new HashMap<Name,Integer>();
		
		hashtable.put(new Name("해리","포터"), new Integer(95));
		hashtable.put(new Name("헤르미온느","그레인져"), new Integer(100));
		hashtable.put(new Name("론","위즐리"), new Integer(85));
		hashtable.put(new Name("드레이코","말포이"), new Integer(93));
		hashtable.put(new Name("네빌","롱버텀"), new Integer(70));
		
		Integer num=hashtable.get(new Name("헤르미온느","그레인져"));/*new로 새로운객체*/
		System.out.println("헤르미온느 그레인져의 성적은?"+num); /*Object가가지고있는 hashCode는 단일객체만처리가능*/
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		
		Name obj1=new Name("헤르미온느","그레인져");
		Name obj2=new Name("헤르미온느","그레인져");
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();		/*hashCode는 int값*/
		System.out.println(hash1);
		System.out.println(hash2);
		
		
	

	}

}
