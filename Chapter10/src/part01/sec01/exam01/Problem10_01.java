package part01.sec01.exam01;

class Pet{
	
	String type;
	int age;
	
	void move() {
		System.out.println(this.type+"가 움직입니다.");
	}
	int getAge() {
		return this.age;
	}
	
	


}

public class Problem10_01 {

	public static void main(String[] args) {
	    Pet pet1 = new Pet();
	    pet1.type="강아지";
	    pet1.age = 8;
	    Pet pet2 = new Pet();
	    pet2.type="고양이";
	    pet2.age = 13;
	    
	   
	    
	    pet1.move();
	    pet2.move();
		System.out.println(pet1.type+"는"+pet1.age+"개월입니다.");
		System.out.println(pet2.type+"는"+pet2.getAge()+"개월입니다.");
		
//		System.out.println(pet2.type+"는"+pet2.age+"개월입니다.");
//		System.out.println(pet2.type+"는"+pet2.getAge()+"개월입니다.");
		
		
	}
		
	}


