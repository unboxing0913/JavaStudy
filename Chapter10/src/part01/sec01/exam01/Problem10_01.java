package part01.sec01.exam01;

class Pet{
	
	String type;
	int age;
	
	void move() {
		System.out.println(this.type+"�� �����Դϴ�.");
	}
	int getAge() {
		return this.age;
	}
	
	


}

public class Problem10_01 {

	public static void main(String[] args) {
	    Pet pet1 = new Pet();
	    pet1.type="������";
	    pet1.age = 8;
	    Pet pet2 = new Pet();
	    pet2.type="�����";
	    pet2.age = 13;
	    
	   
	    
	    pet1.move();
	    pet2.move();
		System.out.println(pet1.type+"��"+pet1.age+"�����Դϴ�.");
		System.out.println(pet2.type+"��"+pet2.getAge()+"�����Դϴ�.");
		
//		System.out.println(pet2.type+"��"+pet2.age+"�����Դϴ�.");
//		System.out.println(pet2.type+"��"+pet2.getAge()+"�����Դϴ�.");
		
		
	}
		
	}


