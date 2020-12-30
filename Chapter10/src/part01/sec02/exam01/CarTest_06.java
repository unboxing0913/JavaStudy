package part01.sec02.exam01;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		
	}
	
	Car(String color,String gearType,int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
}

public class CarTest_06 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		Car c2=new Car("white","auto",4);
		
		
		
		System.out.println("c1 의 color="+c1.color);
		System.out.println("c1 의 gearType="+c1.gearType);
		System.out.println("c1 의 door="+c1.door);
		
		System.out.println("c2 의 color="+c2.color);
		System.out.println("c2 의 gearType="+c2.gearType);
		System.out.println("c2 의 door="+c2.door);

	}

}
