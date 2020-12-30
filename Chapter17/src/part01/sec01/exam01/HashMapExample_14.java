package part01.sec01.exam01;

import java.util.HashMap;

class Name{
	String firstName;
	String lastName;
	
	Name(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		

	}
	
	public int hashCode() {		/*������ �ؽ��ڵ尪�����ؼ� ���� ������� ����ϰ� �������̵� (�繰�Ա�������)*/
		return firstName.hashCode()+lastName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) { /*����� name�� ���ӰԳѱ� name�� ���ڿ� ��*/
		if(!(obj instanceof Name)) {
			return false;	
		}
	    
		Name name=(Name)obj;   /*�Ѿ�°�ü�� NameŸ������ ĳ�����ؼ� NameŬ������ ���������� �޾��ش�*/
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
		
		hashtable.put(new Name("�ظ�","����"), new Integer(95));
		hashtable.put(new Name("�츣�̿´�","�׷�����"), new Integer(100));
		hashtable.put(new Name("��","����"), new Integer(85));
		hashtable.put(new Name("�巹����","������"), new Integer(93));
		hashtable.put(new Name("�׺�","�չ���"), new Integer(70));
		
		Integer num=hashtable.get(new Name("�츣�̿´�","�׷�����"));/*new�� ���οü*/
		System.out.println("�츣�̿´� �׷������� ������?"+num); /*Object���������ִ� hashCode�� ���ϰ�ü��ó������*/
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		
		Name obj1=new Name("�츣�̿´�","�׷�����");
		Name obj2=new Name("�츣�̿´�","�׷�����");
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();		/*hashCode�� int��*/
		System.out.println(hash1);
		System.out.println(hash2);
		
		
	

	}

}
