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
		System.out.println(this.type+"�� �����Դϴ�.");
	}
	
	static int getCounnt() {
		return count;
	}
	
	
	
	
}



public class Problem10_03 {

	public static void main(String[] args) {
		Pet3 pet1 = new Pet3("������",8);
		Pet3.count++;
		Pet3 pet2 = new Pet3("�����",13);
		Pet3.count++;
		
		
		pet1.move();
		pet2.move();
		System.out.println(pet1.getType()+"��"+pet1.getAge()+"���� �Դϴ�.");
		System.out.println(pet2.getType()+"��"+pet2.getAge()+"���� �Դϴ�.");
		System.out.println("���� �츮�� �ֿϵ��� ����"+Pet3.count+"���� �Դϴ�.");
		
		
		

	}

}
