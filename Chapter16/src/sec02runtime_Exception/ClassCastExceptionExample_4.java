package sec02runtime_Exception;
//Ŭ�����Ͱ��õȿ���
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
			   Dog dog=(Dog)animal;   //��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ�Կ� ĳ���þȵȴ�.
		   }else if(animal instanceof Cat) {
			   Cat cat=(Cat)animal;
		   }
		   
		   System.out.println("not castiong");
	       
	}

}
