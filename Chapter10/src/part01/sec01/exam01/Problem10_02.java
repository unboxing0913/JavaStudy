package part01.sec01.exam01;

class Pet2{
	private String type;
	private int age;	
	
	
	public void move() {
		System.out.println(this.type+"�� �����Դϴ�.");
	}
	public void setType(String type){
		this.type=type;
	}
	String getType() {
		return this.type;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	
}

public class Problem10_02 {

	public static void main(String[] args) {
	
		
		Pet2 pet1 = new Pet2();
		pet1.setType("������");
		pet1.setAge(8);
		Pet2 pet2 = new Pet2();
		pet2.setType("�����");
		pet2.setAge(13);
		
	    pet1.move();
	    pet2.move();
		System.out.println(pet1.getType()+"��"+pet1.getAge()+"���� �Դϴ�.");
		System.out.println(pet2.getType()+"��"+pet2.getAge()+"���� �Դϴ�.");
		
		

	}

}
