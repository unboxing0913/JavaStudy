package part01.sec01.exam01;

class Pet3{
	
	private String type;
	private int age;
	static int count=0;
	
	Pet3(String type,int age){
		this.type=type;
		this.age=age;
		//count++;
	}
	
	
	String getType() {
		return this.type;
		
	}
	
	int getAge() {
		return this.age;
	}
	
	public void move() {
		System.out.println(this.type+"가 움직입니다.");
	}
	
	static int getCounnt() {
		return count;
	}
	
	
	
	
}



public class Problem10_03 {

	public static void main(String[] args) {
		Pet3 pet1 = new Pet3("강아지",8);
		Pet3.count++;
		Pet3 pet2 = new Pet3("고양이",13);
		Pet3.count++;
		
		
		pet1.move();
		pet2.move();
		System.out.println(pet1.getType()+"는"+pet1.getAge()+"개월 입니다.");
		System.out.println(pet2.getType()+"는"+pet2.getAge()+"개월 입니다.");
		System.out.println("현재 우리집 애완동물 수는"+Pet3.count+"마리 입니다.");
		
		
		

	}

}
