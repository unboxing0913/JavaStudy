package part01.sec02.exam01;

class Car2{
	String color;
	String gearType;
	int door;
	
    Car2(){
     this("white","auto",4);
      
    }
    Car2(String color){
    	this(color,"auto",4);
    	this.color = color;
        
     
      
    }
    Car2(String color,String gearType,int door){
    	this.color=color;
    	this.gearType=gearType;
    	this.door=door;
        
    }
   
	
	
}

  
public class CarTest2 {

	     public static void main(String[] arg) {
	    	 Car2 c1=new Car2();
	    	 Car2 c2=new Car2("blue");
	    	 
	    	 System.out.println("c1ÀÇ color="+c1.color+",gearType="+c1.gearType+",door="+c1.door);
	    	 // white,auto,4
	    	 System.out.println("c2ÀÇ color="+c2.color+",gearType="+c2.gearType+",door="+c2.door);		 
	    	 // blue,auto,4	 
	    	 		 
	     }
}
