package sec02runtime_Exception;
//클래스와관련된예외
class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}


public class ClassCastExceptionExample_4 {

	public static void main(String[] args) {
		Dog dog = new Dog(); 
	    changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		   if(animal instanceof Dog) {
			   Dog dog=(Dog)animal;   //상속관계에서 부모타입은 자식타입에 캐스팅안된다.
		   }else if(animal instanceof Cat) {
			   Cat cat=(Cat)animal;
		   }
		   
		   System.out.println("not castiong");
	       
	}

}
